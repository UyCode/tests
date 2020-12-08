package com.uycode.lock;

public class MyThread implements Runnable{
    private String id;
    private RowLock rowLock;

    public MyThread(RowLock rowLock, String id){
        this.rowLock = rowLock;
        this.id = id;
    }

    @Override
    public void run(){
        try{
            rowLock.lock(id);
            System.out.println("线程" + java.lang.Thread.currentThread().getName() + "拿到锁");
            System.out.println("******执行业务逻辑******");
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("线程" + java.lang.Thread.currentThread().getName() + "释放");
            try {
                rowLock.unlock(id);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
