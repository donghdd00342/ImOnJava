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
//enum FreshJuiceSize {
////        Enums được giới thiệu bởi Java 5.0
////        Enums giới hạn số lượng các biến bởi cách định nghĩa trước.
////        Các biến trong danh sách được liệt kê gọi là enums.
//        SMALL, MEDIUM, LARGE
//    }
////    FreshJuiceSize size;
//class FreshJuice {
//
//    
//}
//
//class FreshJuiceTest { // mặc đinh modifier là private
//
//    public static void main(String args[]) {
////        FreshJuice juice = new FreshJuice();
//        FreshJuiceSize juice = FreshJuiceSize.LARGE;
//        System.out.println("Size: " + juice);
//    }
//}
// Heap & Stack Memory
//class Memory { // bỏ public vì khác tên file
//
//    public static void main(String[] args) { // 1. Khởi tạo Thread và gọi main, một khối bộ nhớ được tạo trong Stack cho hàm main().
//        int i=1; // 2. biến local lưu trong stack của hàm main
//        Object obj = new Object(); // 3. Đối tượng Object() khởi tạo sẽ lưu trong Heap và biến obj tham chiếu sẽ lưu trong Stack của main()
//        Memory mem = new Memory(); // 4. Đối tượng Memory() khởi tạo lưu trong Heap và biến mem tham chiếu lưu trong Stack của main()
//        mem.foo(obj); // 5. Hàm foo() được gọi và một khối bộ nhớ trong Stack khác sẽ được cấp cho foo()
//    }
//
//    private void foo(Object param) { // 6. hàm foo() có param tham chiếu đến Object() được lưu trong Stack của foo()
//        String str = param.toString(); // 7. biến local str lưu trong Stack của foo() và tham chiếu đến đối tượng StringPool trong Heap
//        System.out.println(str);
//    } // hàm foo() kết thúc sẽ trả lại vùng nhớ Stack cho JVM
//}  // Chương trình thực hiện xong hàm main() kết thúc và trả lại vùng nhớ cho JVM và trương trình kết thúc

// String pool
class StringConcatenationExample {

    public static void main(String[]args){

        String str1 = "Cat"; // Tạo đối tượng trong StringPool: str1 lưu trong stack của main() tham thiếu đến đối tượng StringPool("Cat")

        String str2 = "Cat"; // Tạo đối tượng trong StringPool: str2 lưu trong stack của main() tham thiếu đến đối tượng StringPool("Cat") là cùng một đối tượng giống với str1 (không tạo mới)

        String str3 = new String("Cat"); // str3 lưu ở stack của main() và tham chiếu đến một đối tượng string được tạo mới khác nằm ở Heap (không phải StringPool) khác với StringPool("Cat")

        System.out.println(str1 == str2); // true vì cùng tham chiếu đến StringPool("Cat")

        System.out.println(str1 == str3); // false vì tham chiếu đến 2 đối tượng khác nhau (là StringPool("Cat") và String("Cat"))

    } // StringPool vẫn là bất biến immutable vì cùng trỏ đến StringPool("Cat"), nếu thay đổi str1 sẽ làm thay đổi str2

} // StringBuilder (SE7) được sử dụng để tạo chuỗi có thể thay đổi (chuỗi dạng mutable)