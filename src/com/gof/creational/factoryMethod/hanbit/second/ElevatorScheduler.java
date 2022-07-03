package com.gof.creational.factoryMethod.hanbit.second;

import com.gof.creational.factoryMethod.hanbit.first.ElevatorManager;
import com.oodp.template_method.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
