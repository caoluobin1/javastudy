package org.clb.designpattern.strategy_pattern;

public class StrategyTest {
    public static void main(String[] args) {
        Strategy avg = new AvgStrategy();
        Strategy sum = new SumStrategy();
        Operate operate = new Operate(avg);
        System.out.println(operate.operate(1, 2));
        operate = new Operate(sum);
        System.out.println(operate.operate(1, 2));
    }
}
