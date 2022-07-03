package com.gof.creational.factoryMethod.hanbit.third;

import com.oodp.template_method.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;

    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<ElevatorController>(controllerCount);

        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
        this.strategyID = strategyID;   // 스케줄링 전략을 설정
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }

    void requestElevator(int destination, Direction direction) {
        // 주어진 전략 ID에 해당되는 ElevatorScheduler를 사용
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
