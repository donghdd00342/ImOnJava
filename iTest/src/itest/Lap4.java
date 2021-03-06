package itest;

import java.util.LinkedHashSet;
import java.util.Set;

///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package itest;
//
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author DongHo
// */
////////////////////// multilThread
////class Main {
////
////    public static void main(String[] args) {
////        ThreadA tA = new ThreadA();
////        ThreadB tB = new ThreadB();
////        tA.start();
////        tB.start();
////    }
////}
////
////class ThreadA extends Thread {
////
////    @Override
////    public void run() {
////        System.out.println(ThreadB.a);
////    }
////
////}
////
////class ThreadB extends Thread {
////
////    static int a;
////
////    @Override
////    public void run() {
////        a = 5;
////    }
////
////}
///////////////////// waiting thread
////class ThreadA {
////
////    public static void main(String[] args) {
////        ThreadB b = new ThreadB();
////        b.start();
////
////        synchronized (b) {
////            try {
////                System.out.println("Bắt đầu chờ Thread B...");
////                b.wait();
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////
////            System.out.println("Tổng a + b = " + b.total);
////        }
////    }
////}
////
////class ThreadB extends Thread {
////
////    int total;
////
////    @Override
////    public void run() {
////        synchronized (this) {
////            System.out.println("Nhập số a = ");
////            int a = new Scanner(System.in).nextInt();
////            System.out.println("Nhập số b = ");
////            int b = new Scanner(System.in).nextInt();
////            total = a +b;
////            notify();
////        }
////    }
////}
////////////////// tiếp tục thread
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
//                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
//    }
//    
//}
class Dog {

     private int size;

     Dog(int size) {
	  this.size = size;
     }

     public int getSize() {
	  return size;
     }

     @Override
     public String toString() {
	  return "Dog{" + "size=" + size + '}';
     }

     @Override
     public int hashCode() {
	  int hash = 1;
	  return hash;
     }

     @Override
     public boolean equals(Object obj) {
	  return (obj instanceof Dog) ? (((Dog) obj).getSize() == this.size) : false;
     }

}

class A {

     public static void main(String[] args) {
	  Set<Dog> lhs = new LinkedHashSet<>();
	  // thêm
	  System.out.println("hashCode()= "+lhs.hashCode());
	  lhs.add(new Dog(1));
	  System.out.println("hashCode()= "+lhs.hashCode());
	  lhs.add(new Dog(5));
	  System.out.println("hashCode()= "+lhs.hashCode());
	  lhs.add(new Dog(3));
	  System.out.println("hashCode()= "+lhs.hashCode());
	  lhs.add(new Dog(1));
	  System.out.println("hashCode()= "+lhs.hashCode());
	  // in ra
	  lhs.forEach((t) -> {
	       System.out.println(t);
	  });
	  // remove
	  lhs.remove(new Dog(1));
	  System.out.println("Sau khi remove");
	  // in
	  lhs.forEach((t) -> {
	       System.out.println(t);
	  });
     }
}
