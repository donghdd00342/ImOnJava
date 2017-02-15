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
//class StringConcatenationExample {
//
//    public static void main(String[]args){
//
//        String str1 = "Cat"; // Tạo đối tượng trong StringPool: str1 lưu trong stack của main() tham thiếu đến đối tượng StringPool("Cat")
//
//        String str2 = "Cat"; // Tạo đối tượng trong StringPool: str2 lưu trong stack của main() tham thiếu đến đối tượng StringPool("Cat") là cùng một đối tượng giống với str1 (không tạo mới)
//
//        String str3 = new String("Cat"); // str3 lưu ở stack của main() và tham chiếu đến một đối tượng string được tạo mới khác nằm ở Heap (không phải StringPool) khác với StringPool("Cat")
//
//        System.out.println(str1 == str2); // true vì cùng tham chiếu đến StringPool("Cat")
//
//        System.out.println(str1 == str3); // false vì tham chiếu đến 2 đối tượng khác nhau (là StringPool("Cat") và String("Cat"))
//
//    } // StringPool vẫn là bất biến immutable vì cùng trỏ đến StringPool("Cat"), nếu thay đổi str1 sẽ làm thay đổi str2
//
//} // StringBuilder (SE7) được sử dụng để tạo chuỗi có thể thay đổi (chuỗi dạng mutable)
// Static method
//class Student {
//
//    int rollno; // mỗi sinh viên có rollno và tên khác nhau, chỉ có tên trường giống nhau -> sử dụng static để tiết kiệm bộ nhớ
//    String name;
//    static String college = "BKHN"; // college chỉ được gọi 1 lần khi nạp class Student (static college thuộc object của class Student
//
//    static void change() { // chỉ static method mới có thể thay đổi biến static
//        college = "APTECH"; // thuộc tính static được chia sẻ tới tất cả đối tượng
//    }
//
//    Student(int r, String n) { // contructor
//        rollno = r;
//        name = n;
//    }
//
//    void display() {
//        System.out.println(rollno + " " + name + " " + college);
//    }
//
//    public static void main(String args[]) {
//        Student.change(); // gọi hàm thay đổi theo tên Class mà không cần tạo đối tượng (vì được chia sẻ)
//        Student s1 = new Student(111, "Nguyen Van A");
//        Student s2 = new Student(222, "Nguyen Van B");
//        Student s3 = new Student(333, "Nguyen Van C");
//        s1.display();
//        s2.display();
//        s3.display();
//    }
//}
// Static Variable
//class Counter {
//
//    static int count = 0; // 2. static int sẽ lưu trong Heap cùng Objet Counter() khi được khởi tạo (thành phần thuộc Object Class Counter()) do vậy chỉ cấp phát bộ nhớ một lần
//    // 1. sẽ bắt đầu lấy bộ nhớ khi khởi tạo instance (và nằm trong instance luôn vì nó là biến instance
//
//    Counter() { // contractor: nhiệm vụ là tăng biến count (instance variable) lên một đơn vị.
//        count++; // tăng count lên một đơn vị
//        System.out.println(count); // in ra màn hình giá trị biến count
//    }
//
//    public static void main(String args[]) {
//
//        Counter c1 = new Counter(); // khởi tạo instance c1 từ protype Counter ...
//        Counter c2 = new Counter(); // ...đối tượng Counter() của c1 được lưu ở Heap và c1 tham chiếu đên nó được lưu ở Stack của main()
//        Counter c3 = new Counter(); // ...sau khi khởi tạo (cấp phát bộ nhớ) xong thì contructor sẽ chạy và tăng biến count (thuộc c1 trong Stack) lên một đơn vị
//        // 1. vì Object Counter() lưu trong Heap chỉ là "bản mẫu" và instance varible lưu trong Stack nên sẽ in ra: 1,1,1 / mỗi dòng
//        // 2. Vì được lưu trong Heap cùng Class Counter()(là thành phần của Object class) nên chỉ cấp bộ nhớ một lần khi gọi class -> do vậy kết quả in ra là: 1,2,3 / mỗi dòng
//
//    }
//}
////// Kiểm tra hiệu suât của For
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;
//
//class ForLoopPerformanceTest
//{
//    private static List<Integer> list = new ArrayList<>();
//    private static long startTime;
//    private static long endTime;
//    static
//    {
//        for(int i=0; i < 10000000; i++)
//        {
//            list.add(i);
//        }
//    }
//    @SuppressWarnings("unused")
//			
//			
//			
//    public static void main(String[] args)
//    {
//        //Loại 1: hiệu suất thấp nhất vì mỗi vòng lặp đều tạo ra một iterator và gọi phương thức iterator.get(), xử lý này chiếm tài nguyên và thời gian thực hiện 
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(Integer i : list)
//        {
//            //
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Vòng lặp for :: " + (endTime - startTime) + " ms");
//
//        //Loại 2: phương thức size() được gọi mỗi lần lặp vì thế hiệu suất sẽ giảm đi. Mặc dù JVM đã tối ưu lời gọi phương thức này như lời gọi nội tuyến(inline), nó ý nghĩa như phương thức getter thông thường
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int j = 0; j < list.size() ; j++)
//        {
//            //
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Dùng collection.size() :: " + (endTime - startTime) + " ms");
//
//        //Loại 3: khởi tạo nhanh, kiểm tr điều kiện nhanh, nếu không tăng j++ thì còn nhanh nữa :D
//        startTime = Calendar.getInstance().getTimeInMillis();
//        int size = list.size();
//        for(int j = 0; j < size ; j++)
//        {
//            //System.out.println(j);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Dùng [int size = list.size(); int j = 0; j < size ; j++] :: " + (endTime - startTime) + " ms");
//
//        //Loại 4: tuy có gọi size() trong lúc khởi tạo nhưng chỉ gọi 1 lần nên tốc độ không ảnh hưởng nhiều
//        startTime = Calendar.getInstance().getTimeInMillis();
//        for(int j = list.size()-1; j >=0 ; j--)
//        {
//            //System.out.println(j);
//        }
//        endTime = Calendar.getInstance().getTimeInMillis();
//        System.out.println("Dùng [int j = list.size()-1; j >=0 ; j--] :: " + (endTime - startTime) + " ms");
//    }
//} // 44ms - 4ms (??!!!)- 5ms - 4ms: túm lại là nên xử lý theo cách 3
//------- 10/2/2017
// supper() được gọi ngầm trong contractor con - Bất cứ một class nào đều extand từ class tổ tiên Object
///// gọi phương thức có return
//class ExampleMinNumber {
//
//    public static void main(String[] args) {
//        int a = 11;
//        int b = 6;
//        int c = minFunction(a, b);
//        System.out.println("Gia tri nho nhat = " + minFunction(a, b));
//    }
//
//    /**
//     * Tra ve gia tri nho nhat cua hai so
//     */
//    public static int minFunction(int n1, int n2) {
//        int min;
//        if (n1 > n2) {
//            min = n2;
//        } else {
//            min = n1;
//        }
//
//        return min;
//    }
//}
////// procedure
//class ExampleVoid {
//
//    public static void main(String[] args) {
//        methodRankPoints(255.7);
//    }
//
//    public static void methodRankPoints(double points) {
//        if (points >= 202.5) {
//            System.out.println("Rank:A1");
//        } else if (points >= 122.4) {
//            System.out.println("Rank:A2");
//        } else {
//            System.out.println("Rank:A3");
//        }
//    }
//}
// vi du de trao doi gia tri cua hai so
//class Test {
//
//    public static void main(String[] args) {
//        int a = 30;
//        int b = 45;
//
//        System.out.println("Truoc khi trao doi, gia tri cua a = "
//                + a + " va b = " + b);
//
//        // Trieu hoi phuong thuc hamTraoDoi
//        hamTraoDoi(a, b);
//        System.out.println("\n**Bay gio, Truoc va Sau khi trao doi, cac gia tri se giong nhu nhau o day**:");
//        System.out.println("Sau khi trao doi, a = "
//                + a + " va b = " + b);
//        System.out.println("Kết luận là: truyền tham số kiểu tham trị thì giá trị biến truyền không bị ảnh hưởng");
//    }
//
//    public static void hamTraoDoi(int a, int b) {
//
//        System.out.println("Truoc khi trao doi (ben trong phuong thuc) , a = " + a
//                + " va b = " + b);
//        // trao doi gia tri cua hai so
//        int c = a;
//        a = b;
//        b = c;
//
//        System.out.println("Sau khi trao doi (ben trong phuong thuc), a = " + a
//                + " va b = " + b);
//    }
//}
////////// Ví dụ Overloading
//class ExampleOverloading {
//
//    public static void main(String[] args) {
//        int a = 11;
//        int b = 6;
//        double c = 7.3;
//        double d = 9.4;
//        int result1 = minFunction(a, b);
//        // cung ten ham voi tham so khac nhau
//        double result2 = minFunction(c, d);
//        System.out.println("Gia tri nho nhat = " + result1);
//        System.out.println("Gia tri nho nhat = " + result2);
//    }
//
//    // cho integer
//    public static int minFunction(int n1, int n2) {
//        int min;
//        if (n1 > n2) {
//            min = n2;
//        } else {
//            min = n1;
//        }
//
//        return min;
//    }
//    // cho double
//
//    public static double minFunction(double n1, double n2) {
//        double min;
//        if (n1 > n2) {
//            min = n2;
//        } else {
//            min = n1;
//        }
//
//        return min;
//    }
//}
////////// Thử commend-line
public class Itest {

    public static void main(String args[]) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: "
                    + args[i]);
        }
    }
}
