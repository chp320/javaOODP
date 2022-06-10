package com.oodp.template_method;

public class LGMotor {
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public void moveLGMotor(Direction direction) {
        // LG Motor를 구동시킴
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void move(Direction direction) {
        // 이미 이동 중이면 아무 작업 하지 않음
        if (getMotorStatus() == MotorStatus.MOVING) {
            return;
        }

        // 만약 문의 열려 있으면 문을 닫음
        if (door.getDoorStatus() == DoorStatus.OPENED) {
            door.close();
        }

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
