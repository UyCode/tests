package com.uycode;

public class RandNum {

    public static void main(String[] args) {


        for(int i = 0; i < 10; i++){
            String rand =String.valueOf((Math.random()*100));
            System.out.println(rand);
        }

    }
}
