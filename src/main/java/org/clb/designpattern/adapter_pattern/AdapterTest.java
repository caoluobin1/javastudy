package org.clb.designpattern.adapter_pattern;

public class AdapterTest {
    public static void main(String[] args) {
        Computer computer=new Computer();
        System.out.println(computer.readMsg(new SDCardAdapter(new SDCard())));
    }
}
