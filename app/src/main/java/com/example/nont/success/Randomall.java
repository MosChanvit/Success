package com.example.nont.success;

import java.util.Random;

/**
 * Created by Lenovo on 12/16/2016.
 */

public class Randomall {

    int Mscore = 0;

    public static String random1() {
        int random = (int) (1 + (Math.random() * 5));
        String r1=Integer.toString(random);
        return r1;
    }
    public static String random2() {
        int random = (int) (1 + (Math.random() * 5));
        String r1=Integer.toString(random);
        return r1;
    }
    public static String random3() {
        int random = (int) (1 + (Math.random() * 5));
        String r1=Integer.toString(random);
        return r1;
    }
    public static  String randomOper(){
        Random ran=new Random();
        String str[]={"+","-"};
        int ran1 = ran.nextInt(str.length);
        String strran= str[ran1];
        return strran;
    }
    public static  String randomOper2(){
        Random ran=new Random();
        String str[]={"+","-"};
        int ran1 = ran.nextInt(str.length);
        String strran= str[ran1];
        return strran;
    }

    public static String random11() {
        int random = (int) (1 + (Math.random() * 9));
        String r1=Integer.toString(random);
        return r1;
    }
    public static String random22() {
        int random = (int) (1 + (Math.random() * 9));
        String r1=Integer.toString(random);
        return r1;
    }
    public static String random33() {
        int random = (int) (1 + (Math.random() * 9));
        String r1=Integer.toString(random);
        return r1;
    }



}
