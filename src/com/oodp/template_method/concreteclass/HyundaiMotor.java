package com.oodp.template_method.concreteclass;

import com.oodp.template_method.Direction;
import com.oodp.template_method.Door;
import com.oodp.template_method.DoorStatus;
import com.oodp.template_method.MotorStatus;
import com.oodp.template_method.abstractclass.Motor;

public class HyundaiMotor extends Motor {
    public HyundaiMotor(Door door) {
        super(door);
    }

    protected void moveMotor (Direction direction) {
        // HyundaiMotor를 구동시킴
        System.out.println("HyundiMotor 구동..");
    }
}
