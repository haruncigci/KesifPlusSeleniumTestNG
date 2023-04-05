package com.tayfa.utilities;

public class ReusableMethods {

    public static void sleep(int milisecand){
        try {
                Thread.sleep(milisecand);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }


}
