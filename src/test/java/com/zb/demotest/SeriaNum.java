package com.zb.demotest;

/**
 * ThreadLocal操作，为每个线程的局部变量设置一个序列号
 */
public class SeriaNum {
    private static int serNum=0;
    private static ThreadLocal tl=new ThreadLocal(){
        protected synchronized Object initialValue(){
            return new Integer(serNum++);
        }
    };
    public static int get(){
        return ((Integer) tl.get()).intValue();
    }
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            new Thread("thread"+i){
                public void run(){
                    System.out.println(Thread.currentThread().getName()+"="+SeriaNum.get());
                }
            }.start();
        }
    }
}
