package com.uycode.lock;

import java.util.concurrent.ConcurrentHashMap;

public class RowLock {
    private ConcurrentHashMap map = new ConcurrentHashMap();

    /**
     * 加锁
    * */
    public synchronized void lock(String id) throws Exception{
        // System.out.println("当前线程" + MyThread.currentThread().getName());

        while(map.containsKey(id)){
            wait();
        }
        map.put(id, "");
        //System.out.println("线程" + MyThread.currentThread().getName() + "拿到锁");
    }

    /**
     * 解锁
     * */
    public synchronized void unlock(String id) throws Exception{
        while(map.containsKey(id)){
            map.remove(id);
            // System.out.println("线程" + MyThread.currentThread().getName() + "释放");
            notifyAll();
        }
    }
}
