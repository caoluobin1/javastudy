package org.clb.designpattern.adapter_pattern;

public class SDCardAdapter implements Usb{
    private SDCard sdCard;

    public SDCardAdapter(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    @Override
    public String getMsg() {
        return this.sdCard.getMsg();
    }
}
