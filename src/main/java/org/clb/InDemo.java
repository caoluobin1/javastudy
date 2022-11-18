package org.clb;

public class InDemo {
    private Integer out =1;

    public InRDemo getInRDemo(){
        return new InRDemo();
    }
    class InRDemo{
        private Integer in =2;
        public void setOut(Integer a){
            out=a;
        }
    }

    public static void main(String[] args) {
        InDemo demo= new InDemo();
        InRDemo inRDemo = demo.getInRDemo();
        inRDemo.setOut(10);
        System.out.println(demo.out);
    }
}
