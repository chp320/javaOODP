package com.oodp.template_method;

public class HyundaiMotor {
    private Door door ;
    private MotorStatus motorStatus ;

    public HyundaiMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;  // 초기는 멈춰있는 상태
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    private void moveHyundaiMotor(Direction direction) {
        // Hyundai Motor를 구동시킴
    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();
        // 이미 이동 중이면 아무 작업을 하지 않음
        if (motorStatus == MotorStatus.MOVING) {
            return ;
        }

        // 만약 문이 열려있으면 우선 문을 닫는다
        if (door.getDoorStatus() == DoorStatus.OPENED) {
            door.close();
        }

        // 모터를 주어진 방향으로 이동시킴
        moveHyundaiMotor(direction);

        // 모터 상태를 '이동중'으로 변경
        setMotorStatus(MotorStatus.MOVING);
    }
}
