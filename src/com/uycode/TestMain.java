package com.uycode;

public class TestMain {
    public static void main(String... args) {
        if(args.length == 0){
            args = new String[5];
            args[0] = "Main Method Begins with Param of This String";
            System.out.println(args[0]);
        }
        else{
            System.out.println("No Args");
        }


    }
}