package com.company;

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox=new Box(10,20,15);
        Box mybox2=new Box(3,6,9);

        double vol;


        vol=mybox.volume();
        System.out.print("Volume is "+vol);


        vol=mybox2.volume();
        System.out.print("Volume is "+vol);
    }
}
