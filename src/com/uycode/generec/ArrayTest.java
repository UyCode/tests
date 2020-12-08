package com.uycode.generec;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        /*List<String> stringList = new ArrayList<>();

        List<Integer> integerList = new LinkedList<>();

        Object[] objects = stringList.toArray();

        objects[0] = integerList;*/
        

        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3

        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5

        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //







    }
}
