package com.oodp.lab.FMvsS.strategy;

/**
 * to define the layout of the strategy algorithm.
 */
public interface InterestCalculationStrategy {
    double calculateInterest(double principal, double rate, int term);
}
