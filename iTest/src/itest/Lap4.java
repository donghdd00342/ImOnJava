/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itest;

import java.util.Scanner;

/**
 *
 * @author DongHo
 */
//////////////////// multilThread
//class Main {
//
//    public static void main(String[] args) {
//        ThreadA tA = new ThreadA();
//        ThreadB tB = new ThreadB();
//        tA.start();
//        tB.start();
//    }
//}
//
//class ThreadA extends Thread {
//
//    @Override
//    public void run() {
//        System.out.println(ThreadB.a);
//    }
//
//}
//
//class ThreadB extends Thread {
//
//    static int a;
//
//    @Override
//    public void run() {
//        a = 5;
//    }
//
//}
/////////////////// waiting thread
class ThreadA {

    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        b.start();

        synchronized (b) {
            try {
                System.out.println("Bắt đầu chờ Thread B...");
                b.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Tổng a + b = " + b.total);
        }
    }
}

class ThreadB extends Thread {

    int total;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Nhập số a = ");
            int a = new Scanner(System.in).nextInt();
            System.out.println("Nhập số b = ");
            int b = new Scanner(System.in).nextInt();
            total = a +b;
            notify();
        }
    }
}
