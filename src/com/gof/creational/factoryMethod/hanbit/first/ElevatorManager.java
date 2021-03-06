package com.gof.creational.factoryMethod.hanbit.first;

import com.oodp.template_method.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers ;
    private ThroughputScheduler scheduler ;

    // 주어진 수만큼의 ElevatorController를 생성함
    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }
        scheduler = new ThroughputScheduler();      // ThroughputScheduler 객체를 생성
    }

    void requestElevator(int destination, Direction direction) {
        // ThroughputScheduler를 이용해 엘리베이터를 선택함
        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
