package com.gof.creational.factoryMethod.hanbit.second;

import com.oodp.template_method.Direction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 엘리베이터 처리량을 최대화시키는 전략을 가진 기존 ThroughputScheduler 클래스가 아닌
 * 다른 스케줄링 전략을 사용하기 위해 동적 스케줄링 지원하도록 클래스 수정
 * -> 결국 factory method pattern은 strategy pattern을 활용해 스케줄링 전략을 설계한 것
 */
public class ElevatorManager {
    private List<ElevatorController> controllers ;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for (int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
    }

    // 동적 스케줄링 처리를 위해 메서드 호출시 마다 현재 시간에 따라 적절한 스케줄링 객체를 생성함
    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;

        // 0..23
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        // 문제점 : strategy pattern을 활용해 설계했지만 새로운 전략이 추가될 경우 아래 코드가 수정되어야 한다 (OCP 위배)
        // 해결책 : ElevatorManager가 객체를 직접 생성하는 대신 별도로 SchedulerFactory 클래스를 두고 해당 클래스에서 객체를 생성하도록 변경한다.
        if (hour < 12) {
            // 오전에는 ResponseTimeScheduler를 이용
            scheduler = new ResponseTimeScheduler();
        } else {
            // 오후에는 ThroughputScheduler를 이용
            scheduler = new ThroughputScheduler();
        }

//        int selectedElevator = scheduler.selectElevator(this, destination, direction);
//        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
