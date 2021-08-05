package org.clb.designpattern.template_pattern;

/**
 * @Description
 * @Classname Caculate
 * @Date 2021/7/13 11:19
 * @Author clb
 */
public abstract class Progress {
    public abstract int getStatus(String pkid,String type);
    public abstract int returnProgress(String pkid,String type);
    public void assess(String pkid,String type){
        getStatus(pkid,type);
        returnProgress(pkid,type);
    }

}
