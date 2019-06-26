package com.zb.demotest;

public class ThreadTest {
    public static void main(String[] arg) {
        final Bussiness bussiness = new Bussiness();
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("child start:");
                bussiness.child();
            }
        }).start();
        for (int i = 0; i < 3; i++) {
            System.out.println("father start:");
            bussiness.father();
        }
//        new Thread(() -> {
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).start();
    }

    static class Bussiness {
        private boolean flag = true;

        public synchronized void father() {
            while (flag) {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " main thread run loop " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag = true;
            notify();
        }

        public synchronized void child() {
            while (!flag) {
                try {
                    wait();
                } catch
                (Exception e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " child Thread run loop " + i);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag = false;
            notify();
        }
    }
}
