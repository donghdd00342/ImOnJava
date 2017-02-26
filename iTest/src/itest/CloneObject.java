///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package itest;
//
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author DongHo
// */
//class Student18 implements Cloneable {
//
//    int rollno;
//    String name;
//
//    Student18(int rollno, String name) {
//        this.rollno = rollno;
//        this.name = name;
//    }
//
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//
//    public static void main(String args[]) {
//        try {
//            Student18 s1 = new Student18(101, "hoang");
//
//            Student18 s2 = (Student18) s1.clone();
//
//            System.out.println(s1.rollno + " " + s1.name);
//            System.out.println(s2.rollno + " " + s2.name);
//
//        } catch (CloneNotSupportedException c) {
//        }
//
//    }
//}
////////////// clone object
//
//class A implements Cloneable {
//
//    int a;
//    String str;
//
//    A(int a, String str) {
//        this.a = a;
//        this.str = str;
//    }
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}
//// test
//class main {
//    public static void main(String[] args) {
//        A a1 = new A(84, "DONG");
//        try {
//            A a2 = (A) a1.clone();
//        } catch (CloneNotSupportedException ex) {
//            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//}