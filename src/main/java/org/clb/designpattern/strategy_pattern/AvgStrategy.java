package org.clb.designpattern.strategy_pattern;

public class AvgStrategy implements Strategy{
    @Override
    public int execute(int a, int b) {
        return (a+b)/2;
    }
}
