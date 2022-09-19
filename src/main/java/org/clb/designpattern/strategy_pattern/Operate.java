package org.clb.designpattern.strategy_pattern;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Operate {
    public Strategy strategy;
    public int operate(int a,int b){
        return strategy.execute(a,b);
    }
}
