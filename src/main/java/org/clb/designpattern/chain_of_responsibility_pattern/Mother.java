package org.clb.designpattern.chain_of_responsibility_pattern;

/**
 * @Description
 * @Classname Mother
 * @Date 2021/5/24 15:30
 * @Author clb
 */
public class Mother extends Handler {

    public void handler(Boy b) {
        b.shape="Éµ×Ó";
        System.out.println("Ä¸Ç×Ò»¶ÙÅÖ×á"+b);
        if (this.getNext()!=null){
            this.getNext().handler(b);
        }
    }
}
