package com.oodp.template_method.abstractclass;

import com.oodp.template_method.Direction;
import com.oodp.template_method.Door;
import com.oodp.template_method.DoorStatus;
import com.oodp.template_method.MotorStatus;

/**
 * HyundaiMotor와 LGMotor에 공통적인 기능을 구현하는 클래스
 */
public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    // HyundaiMotor와 LGMotor의 move 메서드에서 공통되는 부분
    public void move(Direction direction) {
        // 모터상태 확인, 문상태 확인, 이동, 모터상태 관리

        MotorStatus motorStatus = getMotorStatus();
        // 이미 이동 중이면 아무 작업을 하지 않음
        if (motorStatus == MotorStatus.MOVING) {
            return ;
        }

        // 만약 문이 열려있으면 우선 문을 닫는다
        if (door.getDoorStatus() == DoorStatus.OPENED) {
            door.close();
        }

        // 모터를 주어진 방향으로 이동시킴 -> 서브 클래스에서 오버라이드
        moveMotor(direction);

        // 모터 상태를 '이동중'으로 변경
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);
}
