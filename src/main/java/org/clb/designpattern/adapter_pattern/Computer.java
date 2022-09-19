package org.clb.designpattern.adapter_pattern;

public class Computer {
    public String readMsg(Usb usb){
        return usb.getMsg();
    }
}
