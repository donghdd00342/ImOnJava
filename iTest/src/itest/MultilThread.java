/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itest;

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
//class ThreadA {
//
//    public static void main(String[] args) {
//        ThreadB b = new ThreadB();
//        b.start();
//
//        synchronized (b) {
//            try {
//                System.out.println("Bắt đầu chờ Thread B...");
//                b.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println("Tổng a + b = " + b.total);
//        }
//    }
//}
//
//class ThreadB extends Thread {
//
//    int total;
//
//    @Override
//    public void run() {
//        synchronized (this) {
//            System.out.println("Nhập số a = ");
//            int a = new Scanner(System.in).nextInt();
//            System.out.println("Nhập số b = ");
//            int b = new Scanner(System.in).nextInt();
//            total = a +b;
//            notify();
//        }
//    }
//}
//////////////// tiếp tục thread
//class A {
//
//    public static void main(String[] args) {
//        B b1 = new B();
//        B b2 = new B();
//        b1.start();
//        b2.start();
//
//    }
//}
//
//class B extends Thread {
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println("i = " + i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//                System.err.println("Có lỗi! " + ex);
//            }
//
//        }
//    }
//
//}
/////////////// synchronized
class User {

    int balance = 1000;

    public synchronized void rut(int money) {
        if (money > this.balance) {
            try {
                System.err.println("Không có đủ tiền để rút!");
                System.err.println("Bắt đầu chờ nạp tiền...");
                wait();
            } catch (InterruptedException ex) {
                System.err.println("Có lỗi gì đó: " + ex);
            }
        }
        System.out.println("Số dư: " + this.balance);
        this.balance -= money;
        System.out.println("Sau khi RÚT Số dư: " + this.balance);
    }

    public synchronized void gui(int money) {
        System.out.println("Số dư: " + this.balance);
        this.balance += money;
        System.out.println("Sau khi GỬI Số dư: " + this.balance);
        System.out.println("Bắt đầu kích hoạt Thread đang chờ gửi tiền...");
        notifyAll();
    }

    public static void main(String[] args) {
        User u = new User();
        Thread guiTien = new Thread() {
            @Override
            public void run() {
                u.gui(800);
            }
        };
        Thread rutTien = new Thread() {
            @Override
            public void run() {
                u.rut(1500);
            }
        };
        // test
        rutTien.start();
        guiTien.start();
    }
}
