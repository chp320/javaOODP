package com.oodp.template_method.abstractclass;

import com.oodp.template_method.Door;
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

    protected void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
}
