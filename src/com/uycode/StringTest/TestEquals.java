package com.uycode.StringTest;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestEquals {
    public static void main(String[] args) {
        String str = "string instance";
        String str1 = new String("String Object instance");
        final double epsilon_ = 0.001;
        final double ε= 0.0001;
        String 字符串1 = "Hello";
        String 字符串2 = "Hello";
        if(字符串1 == 字符串2) {
            System.out.println(true);
        }
        double double_x = 0.00002;
        if(Math.abs(double_x - 0) < epsilon_) {
            System.out.println("true");
        }
    }

    /*public boolean equalsTest(Object anObject) {
        if(this == anObject) {
            return true;
        }
        if(anObject instanceof String) {
            String anotherString = (String) anObject;
            int n = value.length;
            if(n == anotherString.value.length) {
                char v1[] = value;
                char v2[] = anotherString.value;
                int i = 0;
                while(n-- != 0) {
                    if(v1[i] != v2[i]) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }*/

   /* Comparator comparator = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return o1.toString().compareTo(o2.toString());
        }
    };*/


}
