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

    protected void moveMotor (Direction direction) {
        // LGMotor를 구동시킴
        System.out.println("LGMotor 구동 ...");
    }
}
