package org.clb.designpattern.facade_pattern;

/**
 * @Description
 * @Classname FacadeTest
 * @Date 2021/6/11 9:22
 * @Author clb
 */
public class FacadeTest {

    public static void main(String[] args) {
        Interviewee interviewee = new Interviewee(7, 4, new CurriculumVitae("Íõ¶şÂé", 8));
        Company company = new Company();
        company.receive(interviewee);
    }

}
