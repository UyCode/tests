package com.uycode.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Hyper
 */
public class ReduceTest {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("test");
        stringList.add("test1");
        stringList.add("test2");

        String last = stringList.stream().reduce((first, second)->first).orElse(null);
        System.out.println(last);
    }


}
