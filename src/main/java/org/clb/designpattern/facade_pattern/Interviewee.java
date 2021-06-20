package org.clb.designpattern.facade_pattern;

/**
 * @Description
 * @Classname Interviewee
 * @Date 2021/6/11 9:16
 * @Author clb
 */
public class Interviewee {

    public Integer EQlevel;
    public Integer IQlevel;
    private CurriculumVitae cv;

    public Interviewee(Integer EQlevel, Integer IQlevel) {
        this.EQlevel = EQlevel;
        this.IQlevel = IQlevel;
    }

    public Interviewee(Integer EQlevel, Integer IQlevel, CurriculumVitae cv) {
        this.EQlevel = EQlevel;
        this.IQlevel = IQlevel;
        this.cv = cv;
    }

    public CurriculumVitae getCv() {
        return cv;
    }

    public void setCv(CurriculumVitae cv) {
        this.cv = cv;
    }

    public Integer getEQlevel() {
        return EQlevel;
    }

    public void setEQlevel(Integer EQlevel) {
        this.EQlevel = EQlevel;
    }

    public Integer getIQlevel() {
        return IQlevel;
    }

    public void setIQlevel(Integer IQlevel) {
        this.IQlevel = IQlevel;
    }

}
