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
//class Student4 {
//
//    int id;
//    String name;
//
//    Student4(int i, String n) { // Constructor
//        id = i;
//        name = n;
//    }
//
//    void display() {
//        System.out.println(id + " " + name);
//    }
//
//    public static void main(String args[]) {
//        Student4 s1 = new Student4(111, "humty");
//        Student4 s2 = new Student4(222, "dumty");
//        s1.display();
//        s2.display();
//    }
//}
//class Student9 { // nạp chồng Constructor 
//
//    int id;
//    String name;
//    int age;
//
//    Student9(int i, String n) {
//        id = i;
//        name = n;
//    }
//
//    Student9(int i, String m, int a) {
//        id = i;
//        name = m;
//        age = a;
//    }
//
//    void display() {
//        System.out.println(id + " " + name + " " + age);
//    }
//
//    public static void main(String args[]) {
//        Student9 s1 = new Student9(111, "Hoang");
//        Student9 s2 = new Student9(222, "Thanh", 25);
//        s1.display();
//        s2.display();
//    }
//}
//class Student6 { // Copy Constructor
//
//    int id;
//    String name;
//
//    Student6(int i, String n) {
//        id = i;
//        name = n;
//    }
//
//    Student6(Student6 s) {
//        id = s.id;
//        name = s.name;
//    }
//
//    void display() {
//        System.out.println(id + " " + name);
//    }
//
//    public static void main(String args[]) {
//        Student6 s1 = new Student6(111, "Hoang");
//        Student6 s2 = new Student6(s1);
//        s1.display();
//        s2.display();
//    }
//}
// 1111111111111111
//class FreshJuice {
//
//    enum FreshJuiceSize {
////        Enums được giới thiệu bởi Java 5.0
////        Enums giới hạn số lượng các biến bởi cách định nghĩa trước.
////        Các biến trong danh sách được liệt kê gọi là enums.
//        SMALL, MEDIUM, LARGE
//    }
//    FreshJuiceSize size;
//}
//
//class FreshJuiceTest { // mặc đinh modifier là private
//
//    public static void main(String args[]) {
//        FreshJuice juice = new FreshJuice();
//        juice.size = FreshJuice.FreshJuiceSize.MEDIUM;
//        System.out.println("Size: " + juice.size);
//    }
//}
// 22222222222
enum FreshJuiceSize {
//        Enums được giới thiệu bởi Java 5.0
//        Enums giới hạn số lượng các biến bởi cách định nghĩa trước.
//        Các biến trong danh sách được liệt kê gọi là enums.
        SMALL, MEDIUM, LARGE
    }
//    FreshJuiceSize size;
class FreshJuice {

    
}

class FreshJuiceTest { // mặc đinh modifier là private

    public static void main(String args[]) {
//        FreshJuice juice = new FreshJuice();
        FreshJuiceSize juice = FreshJuiceSize.LARGE;
        System.out.println("Size: " + juice);
    }
}
