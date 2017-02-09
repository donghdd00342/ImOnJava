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
////////////////////////////////////////////////////////////////////////////////
//public class Itest {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
//    
//}
////////////////////////////////////////////////////////////////////////////////
//class Student3 { // Constructor mặc định
//
//    float id;
//    String name;
//
//    void display() {
//        System.out.println(id + " " + name);
//    }
//
//    public static void main(String args[]) {
//        Student3 s1 = new Student3();
//        Student3 s2 = new Student3();
//        s1.display();
//        s2.display();
//    }
//}
class Student4 {

    int id;
    String name;

    Student4(int i, String n) { // Constructor
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student4 s1 = new Student4(111, "humty");
        Student4 s2 = new Student4(222, "dumty");
        s1.display();
        s2.display();
    }
}
