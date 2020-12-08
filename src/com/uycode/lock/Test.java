package com.uycode.lock;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        RowLock rowLock = new RowLock();

        ArrayList<MyThread> list = new ArrayList<>();
        ArrayList<MyThread> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            list.add(new MyThread(rowLock, "A"));
        }

        for(int i = 0; i < 10; i++){
            list1.add(new MyThread(rowLock, "B"));
        }

        for(int i = 0; i < 10; i++){
            new Thread(list.get(i), i + "A").run();
            new Thread(list1.get(i), i + "B").run();
        }
    }
}
