package com.oodp.template_method.concreteclass;

import com.oodp.template_method.Direction;
import com.oodp.template_method.Door;
import com.oodp.template_method.DoorStatus;
import com.oodp.template_method.MotorStatus;
import com.oodp.template_method.abstractclass.Motor;

public class LGMotor extends Motor {
    public LGMotor(Door door) {
        super(door);
    }

    private void moveLGMotor(Direction direction) {
        // LGMotor를 구동시킴
    }

    // move 메서드는 HyundaiMotor와 상이
    public void move(Direction direction) {
        // 이미 이동중이면 아무 작업하지 않음
        if (getMotorStatus() == MotorStatus.MOVING) {
            return ;
        }

        // 문이 열려있으면 문을 닫음
        if (door.getDoorStatus() == DoorStatus.OPENED) {
            door.close();
        }

        // 모터를 주어진 방향으로 이동시킴
        moveLGMotor(direction);

        // 모터 상태를 '이동중'으로 변경
        setMotorStatus(MotorStatus.MOVING);
    }
}
