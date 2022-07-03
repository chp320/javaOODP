package com.gof.creational.factoryMethod.hanbit.third;

import com.oodp.template_method.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
