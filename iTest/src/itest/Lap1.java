///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package itest;
//
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Import;
// * @author DongHo
// */
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
//public class Itest {
//
//    public static void main(String args[]) {
//        for (int i = 0; i < args.length; i++) {
//            System.out.println("args[" + i + "]: "
//                    + args[i]);
//        }
//    }
//}
////////////// truyền số lượng tham số tùy chọn với var-args
//class VarargsDemo {
//
//    public static void main(String[] args) {
//        // Goi phuong thuc voi bien args  
//        printMax(34, 3, 3, 2, 56.5);
//        System.out.println("----------------");
//        printMax(new double[]{1, 2, 3});
//    }
//
//    public static void printMax(double... numbers) {
//        if (numbers.length == 0) {
//            System.out.println("Khong co tham so nao duoc truyen");
//            return;
//        }
//
//        double result = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > result) {
//                result = numbers[i];
//            }
//        }
//        System.out.println("Gia tri max la " + result);
//    }
//}
//////// Overloading để in danh sách mảng các loại dữ liệu // truyền tham số khác kiểu, thiếu tham số ....
//class MainClass {
//   public static void printArray(Integer[] inputArray) {
//      for (Integer element : inputArray){
//         System.out.printf("%s ", element);
//         System.out.println();
//      }
//   }
//   public static void printArray(Double[] inputArray) {
//      for (Double element : inputArray){
//         System.out.printf("%s ", element);
//         System.out.println();
//      }
//   }
//   public static void printArray(Character[] inputArray) {
//      for (Character element : inputArray){
//         System.out.printf("%s ", element);
//         System.out.println();
//      }
//   }
//   public static void main(String args[]) {
//      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
//      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4,
//      5.5, 6.6, 7.7 };
//      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
//      System.out.println("Array integerArray contains:");
//      printArray(integerArray); // không chèn trưc tiếp giá trị mảng vào đươc
//      System.out.println("\nArray doubleArray contains:");
//      printArray(doubleArray);
//      System.out.println("\nArray characterArray contains:");
//      printArray(characterArray);
//   }
//}
/////////////// Tháp hà nội ĐỆ QUY với Java
//class MainClass {
//
//    public static void main(String[] args) {
//        int nDisks = 5;
//        doTowers(nDisks, 'A', 'B', 'C');
//    }
//
//    public static void doTowers(int topN, char from,
//            char inter, char to) {
//        if (topN == 1) {
//            System.out.println("Disk 1 from "
//                    + from + " to " + to);
//        } else {
//            doTowers(topN - 1, from, to, inter);
//            System.out.println("Disk "
//                    + topN + " from " + from + " to " + to);
//            doTowers(topN - 1, inter, from, to);
//        }
//    }
//}
///////////////// Tính Fibonacci ĐẸ QUY vơi Java
//class MainClass {
//
//    public static long fibonacci(long number) {
//        if ((number == 0) || (number == 1)) {
//            return number;
//        } else {
//            return fibonacci(number - 1) + fibonacci(number - 2);
//        }
//    }
//
//    public static void main(String[] args) {
//        for (int counter = 0; counter <= 10; counter++) {
//            System.out.printf("Fibonacci of %d is: %d\n",
//                    counter, fibonacci(counter));
//        }
//    }
//}
////////////// Tính Giai Thừa (factorial) dùng ĐỆ QUY với Java
//class MainClass {
//
//    public static void main(String args[]) {
//        for (int counter = 0; counter <= 10; counter++) {
//            System.out.printf("%d! = %d\n", counter,
//                    factorial(counter));
//        }
//    }
//
//    public static long factorial(long number) {
//        if (number <= 1) {
//            return 1;
//        } else {
//            return number * factorial(number - 1);
//        }
//    }
//}
/////////////// Overloading main()without static
//class Overloading1 {
//
//    public void main(int a) {
//        System.out.println(a);
//    }
//
//    public static void main(String args[]) {
//        System.out.println("Phuong thuc main() duoc trieu hoi");
//        new Overloading1().main(10);
//    }
//}
//////////// Type Promotion : byte-short-int-long-float-double (kiểu nhỏ bị kiểu lớn ăn)
///////// MƠ HỒ VÌ KIỂU NGUYÊN THỦY KHÔNG PHẢI LÀ OBJECT ĐỂ KIỂM TRA THỰC TẾ???
//class OverloadingCalculation1 {
//
//    void sum(int a, long b) {
//        Object b1 = new Object();
//        b1 = b;
//        System.out.println(b1.getClass().getName());
//    }
//
//    void sum(int a, int b, int c) {
//        System.out.println("int b = " + b);
//    }
//
//    public static void main(String args[]) {
//        OverloadingCalculation1 obj = new OverloadingCalculation1();
//        obj.sum(20, 20); //Bây giờ int literal thu hai se đươc promote thành long  
//        obj.sum(20, 20, 20);
//
//    }
//}
////////////////
//class OverloadingCalculation2 {
//
//    void sum(int a, int b) {
//        System.out.println("phuong thuc int arg duoc trieu hoi");
//    }
//
//    void sum(long a, long b) {
//        System.out.println("phuong thuc long arg duoc trieu hoi");
//    }
//
//    public static void main(String args[]) {
//        OverloadingCalculation2 obj = new OverloadingCalculation2();
//        obj.sum(20, 20); //Bay gio phuong thuc int arg sum() duoc trieu hoi  
//    }
//}
// Từ khóa this có thể được sử dụng để tham chiếu biến instance của lớp hiện tại (lưỡng nghĩa giữa biến instance và tham số)
//Vi du ve tu khoa this trong Java khi tham số trùng tên với biến instance
//class Student11{  
//    int id;  
//    String name;  
//      
//    Student11(int id,String name){  
//    this.id = id;  // biến instance giống tham số nên sẽ bị hiểu là biến local
//    this.name = name;  
//    }  
//    void display(){System.out.println(id+" "+name);}  
//    public static void main(String args[]){  
//    Student11 s1 = new Student11(111,"Hoang");  
//    Student11 s2 = new Student11(222,"Thanh");  
//    s1.display();  
//    s2.display();  
//}  
//}  
/////////
//Chuong trinh vi du loi goi this() constructor (constructor chaining)  
//class Student13 {
//
//    int id;
//    String name;
//
//    Student13() {
//        System.out.println("Constructor mac dinh duoc goi");
//    }
//
//    Student13(int id, String name) {
//        this(); //no duoc su dung de goi constructor cua lop hien tai. và phải là dòng lệnh dầu tiên trong 
//        this.id = id;
//        this.name = name;
//    }
//
//    void display() {
//        System.out.println(id + " " + name);
//    }
//
//    public static void main(String args[]) {
//        Student13 e1 = new Student13(111, "Hoang");
//        Student13 e2 = new Student13(222, "Thanh");
//        e1.display();
//        e2.display();
//    }
//}
//////////// truyền tham số this trong contructor (HẠI NÃO...)
//class B {
//
//    A4 obj;
//
//    B(A4 obj) {
//        System.out.println("ĐÂY LÀ CONTRUCTOR CỦA B");
//        System.out.println("TRONG instance B có 1 biến obj là instance A4 và nó sẽ được gán = tham số truyền vào contructor B (tức là obj = a)");
//        this.obj = obj;
//    }
//
//    void display() {
//        System.out.println("Đây là câu lệnh trong hàm display()");
//        System.out.println("Vì obj = a cùng thuộc A4 nên obj.data = a.data = "+obj.data); //su dung thanh vien du lieu cua lop A4  
//    }
//}
//
//class A4 {
//
//    int data = 10;
//
//    A4() {
//        System.out.println("1.biến a thuộc A4 được khởi tạo và a.data = "+ this.data);
//        System.out.println("2.khởi tạo biến b thuộc B trong contructor A4");
//        B b = new B(this);
//        System.out.println("3.gọi hàm display() của b vừa tạo.");
//        b.display();
//    }
//
//    public static void main(String args[]) {
//        A4 a = new A4();
//    }
//}
//////// Từ khóa this có thể được sử dụng để trả về instance của lớp hiện tại
//class A5 {
//
//    void m() {
//        System.out.println(this);//in ra cung tham chieu ID  
//    }
//
//    public static void main(String args[]) {
//        A5 obj = new A5();
//        System.out.println(obj);//in tham chieu ID  
//
//        obj.m();
//        
//        // Thử NaN
//        System.out.println("NaN = " + 0.0/0.0);
//        System.out.println("-Inf = " + -1.0/0.0);
//    }
//}
/////////// KẾ THỪA IS-A
/// Java không hỗ trợ đa kế thừa (kế thừa từ nhiều lớp) vì nếu các lớp được kế thừa có phương thức giống nhau thì tại class con khi gọi sẽ xảy ra tính lưỡng nghĩa và ngôn ngữ sẽ phức tạp, vậy nên java ko hỗ trợ đa kế thừa trong class và sẽ báo lỗi khi complie
//class Employee {
//
//    protected float salary = 40000;
//}
//
//class Programmer extends Employee {
//
//    protected int bonus = 10000;
//
//    public static void main(String args[]) {
//        Programmer p = new Programmer();
//        System.out.println("Luong Lap trinh vien la:" + p.salary);
//        System.out.println("Bonus cua Lap trinh vien la:" + p.bonus);
//        Math.addExact(0, 0);
//    }
//}
//////////// QUAN HỆ HAS-A
//class Operation { // chứa các phép tính toán
//
//    int square(int n) { // tính bình phương
//        return n * n;
//    }
//}
//
//class Circle {
//
//    Operation op; //quan hệ HAS-A  
//    double pi = 3.14;
//
//    double area(int radius) { // method tính diện tích hình tròn với tham số radius truyền vào
//        op = new Operation();
//        int rsquare = op.square(radius); //tai su dung code (vi du: uy quyen cho loi goi phuong thuc).  
//        return pi * rsquare;
//    }
//}
//
//class test {
//
//    public static void main(String args[]) {
//        Circle c = new Circle();
//        double result = c.area(5);
//        System.out.println(result);
//    }
//}
//////// HAS-A
//class Address {
//
//    String city, state, country;
//
//    public Address(String city, String state, String country) {
//        this.city = city;
//        this.state = state;
//        this.country = country;
//    }
//
//}
//
//class Emp {
//
//    int id;
//    String name;
//    Address address;
//
//    public Emp(int id, String name, Address address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
//
//    void display() {
//        System.out.println(id + " " + name);
//        System.out.println(address.city + " " + address.state + " " + address.country);
//    }
//
//    public static void main(String[] args) {
//        Address address1 = new Address("hanoi", "HN", "vietnam");
//        Address address2 = new Address("hadong", "HN", "vietnam");
//
//        Emp e = new Emp(111, "hoang", address1);
//        Emp e2 = new Emp(112, "thanh", address2);
//
//        e.display();
//        e2.display();
//
//    }
//}
//////////////// Một interface có thể kế thừa từ một interface khác
//interface A {
//
//    public void a();
//}
//
//interface B {
//
//    public void b();
//}
//
//interface C extends A, B {
//
//    public void c();
//}
//
//class D implements C {
//
//    @Override
//    public void c() {
//        System.out.println("c()");
//    }
//
//    @Override
//    public void a() {
//        System.out.println("a()");
//    }
//
//    @Override
//    public void b() {
//        System.out.println("b()");
//    }
//    public void d(){
//        System.out.println("d()");
//    }
//
//}
//
//class main {
//
//    public static void main(String... args) {
//        A a = new D();
//        a.a();
//        B b = (B) a;
//        b.b();
//        C c = (C) a;
//        System.out.println("--------------------------");
//        c.a();
//        c.b();
//        c.c();
//        System.out.println("--------------------------");
//        D d = (D) a;
//        d.a();
//        d.b();
//        d.c();
//        d.d();
//
//    }
//}
///////////////////// lớp lồng trong lớp
//class Outer {
//
//    int outer_x = 100;
//
//    void test() {
//        Inner inner = new Inner();
//        inner.display_x();
//    }
//
//    class Inner { // có thể truy xuất trực tiếp biến đối tượng của lớp Outer
//
//        int inner_y = 10;
//
//        void display_x() {
//            System.out.println("display: outer_x = " + outer_x);
//        }
//    }
//
//    void display_y() { // không thể truy xuất biến đối tượng của lớp Inner
////        System.out.println("display: inner_y = " + inner_y); // Error
//    }
//}
//
//class InnerClassDemo {
//
//    public static void main(String args[]) {
//        Outer outer = new Outer();
//        outer.test();
//    }
//}
/////////////////////lớp trừu tượng và Interface trong Java
////Tao interface ma co 4 phuong thuc  
//interface A {
//
//    void a();//theo mac dinh, public va abstract  
//
//    void b();
//
//    void c();
//
//    void d();
//}
//
////Tao lop abstract ma cung cap trinh trien khai cua mot phuong thuc cua A interface  
//abstract class B implements A {
//
//    @Override
//    public void c() {
//        System.out.println("Toi la C");
//    }
//}
//
////Tao lop con cua lop abstract, bay gio chung ta can cung cap trinh trien khai cho cac phuong thuc con lai  
//class M extends B {
//
//    @Override
//    public void a() {
//        System.out.println("Toi la a");
//    }
//
//    @Override
//    public void b() {
//        System.out.println("Toi la b");
//    }
//
//    @Override
//    public void d() {
//        System.out.println("Toi la d");
//    }
//}
//
////Tao mot lop Test ma goi cac phuong thuc cua A interface  
//class Test5 {
//
//    public static void main(String args[]) {
//        A a = new M();
//        a.a();
//        a.b();
//        a.c();
//        a.d();
//    }
//}
///////////// static & final
//class A {
//
//    public final B b = new B();
//}
//
//class B {
//
//    public static int a = 1;
//    
//    public String str = "Hellow";
//}
//
//class main {
//
//    public static void main(String[] args) {
//        A a = new A();
//        B b = new B();
//        // a.b = b; //cannot assign a value to final variable b
//        System.out.println("Trước khi thay đổi: a.b.str = " + a.b.str);
//        a.b.a = 100;
//        a.b.str = "Anh Đông ệp zai!";
//        System.out.println("--------------------------------------");
//        System.out.println("Sau khi thay đổi: a.b.a = " + B.a);
//        System.out.println("Sau khi thay đổi: a.b.str = " + a.b.str);
//    }
//}
///////////////// ghi đè Access Modifier
//class A {
//    protected void method() {
//        System.out.println("in A");
//    }
//}
//class B extends A {
//    @Override
//    public void method() {
//        System.out.println("in B extends A");
//    }
//}
//class C {
//    void c(){
//        
//    }
//}
//class D extends C {
//    @Override
//    void c(){ // không thể private
//        
//    }
//}
///////// tham trị tham chiếu
//class A {
//
//    String str = "Anh Dong";
//
//    public static void changeString(A a) {
//        a.str += " by Ho Dong!";
//    }
//
//    public static void main(String[] args) {
//        A a = new A();
//        System.out.println("Trước khi đổi: " + a.str);
//        a.changeString(a);
//        System.out.println("Sau khi đổi: " + a.str);
//    }
//}
/////////////// date & time
//import java.util.Date;
//
//class DateDemo {
//
//    public static void main(String args[]) {
//        // khoi tao mot doi tuong Date
//        Date date = new Date();
//
//        // hien thi date va time boi su dung toString()
//        System.out.println(date.toString()); // Tue Feb 28 15:54:10 ICT 2017
//    }
//}
//////// sử dụng SimpleDateFormat
//
//import java.util.*;
//import java.text.*;
//
//class DateDemo {
//
//    public static void main(String args[]) {
//
//        Date dNow = new Date();
//        SimpleDateFormat ft
//                = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//
//        // Date hien tai: Tue 2017.02.28 at 03:59:06 PM ICT
//        System.out.println("Date hien tai: " + ft.format(dNow));
//        //Tue 2017.02.28 at 04:13:55 PM ICT
//        System.out.println(new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz").format(new Date()));
//        try {
//            Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2017-02-28");
//            // Tue Feb 28 00:00:00 ICT 2017
//            System.out.println(date);
//        } catch (ParseException ex) {
//            System.err.println("Có lỗi! " + ex);
//        }
//    }
//}
////////// sleep và time
//
//import java.util.*;
//
//class SleepDemo {
//
//    public static void main(String args[]) {
//        try {
//            System.out.println(new Date() + "\n");
//            Thread.sleep(5 * 60 * 10);
//            System.out.println(new Date() + "\n");
//        } catch (InterruptedException e) {
//            System.out.println("Nhan mot exception!");
//        }
//    }
//}
//////// đo lượng thời gian
//import java.util.*;
//
//class DiffDemo {
//
//    public static void main(String args[]) {
////        try {
////            long start = System.currentTimeMillis();
////            System.out.println(new Date() + "\n");
////            Thread.sleep(300);
////            System.out.println(new Date() + "\n");
////            long end = System.currentTimeMillis();
////            long diff = end - start;
////            System.out.println("Khac nhau la : " + diff);
////        } catch (InterruptedException e) {
////            System.out.println("Nhan mot exception!");
////        }
//        // GregorianCalendar
//        GregorianCalendar calendar = new GregorianCalendar();
//        System.out.println(calendar);
//    }
//}
///////////////// Regular Expression
//class main {
//    public static void main(String[] args) {
//        System.out.println(Pattern.matches("\\A([^@\\s]+)@((?:[a-z0-9]+\\.)+[a-z]{2,})\\z", "Dong@phuc.com.edu.vnn"));
//    }
//}
//// StringPool - KHÔNG PHẢI RÁC...
//class main {
//
//    public static void change(String str) {
//        str += " by DONGHO.";
//    }
//
//    public static void main(String[] args) {
//        String str1 = "123";
//        String str2 = "12"+"3";
//        if (str1 != str2) {
//            System.out.println("Bằng");
//        } else {
//            System.out.println("KHÔNG PHẢI RÁC...");
//        }
//    }
//}
///////////////////////////////// clone() hoặc có contructor để sao chép (nhưng sẽ tốn tài nguyên hớn clone)
//class A implements Cloneable {
//
//    int a = 1;
//    int b = 2;
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public static void main(String[] args) {
//        A a1 = new A();
////        A a2 = a1;
//        A a2 = new A(); a2 = a1;
////        try {
////            a2 = (A)a1.clone();
////        } catch (CloneNotSupportedException ex) {
////            System.err.println("Looix gi g=do");
////        }
//        a2.a = 100;
//        if (a1 == a2) {
//            System.out.println("Tham chiếu cùng đối tượng");
//        } else {
//            System.out.println("KHÔNG tham chiếu cùng đối tượng");
//        }
//        System.out.println(a1.a);
//    }
//}
/////////// String
//class Testimmutablestring {
//
//    public static void main(String args[]) {
//        String s = "Anh Dong";
//        s.concat(" Đệp Zai"); //phuong thuc concat() phu them vao cuoi chuoi  
//        System.out.println(s);//se in Anh Dong vì string la immutable  
//    }
//}
//////////// Chuỗi con trong Java
//
//class A {
//
//    public static void main(String[] args) {
//        String str = "0123456789";
//        System.out.println("length = " + str.length());
//        System.out.println(str.substring(1));
//        System.out.println("." + str.substring(0, 0) + ".");
//
//        String s1 = "Java la mot ngon ngu lap trinh. Java la mot nen tang. Java la mot hon dao.";
//        String replaceString = s1.replace("Java", "HaLong");//thay the tat ca su xuat hien cua "Java" thanh "HaLong"    
//        System.out.println(replaceString);
//        System.out.println(s1);
//        
//        StringBuffer strBf = new StringBuffer();
//    }
//}
//////// StringBuffer

//class Test {
//
//	public static void main(String args[]) {
//		StringBuffer sb = new StringBuffer("Test");
//		sb.append(" String Buffer");
//		System.out.println(sb);
//		System.out.println(sb.append(1.0));
//	}
//}
//////// capacity = (old_capacity*2)+2
//class Main {
//
//	public static void main(String args[]) {
//		StringBuffer sb = new StringBuffer();
//		System.out.println(sb.capacity());//mac dinh la 16  
//		sb.append("Hello");
//		System.out.println(sb.capacity());//bay gio la 16  
//		sb.append("Java la mot ngon ngu lap trinh manh me");
//		System.out.println(sb.capacity());//bay gio la (16*2)+2=34 vi du cua cong thuc (oldcapacity*2)+2  
//	}
//}
///// Kiểm tra hiệu suất của lớp String và StringBuffer trong Java
//class Test1 {
//
//	public static String concatWithString() {
//		String t = "Java";
//		for (int i = 0; i < 10000; i++) {
//			t = t + ".";
//		}
//		return t;
//	}
//
//	public static String concatWithStringBuffer() {
//		StringBuffer sb = new StringBuffer("Java");
//		for (int i = 0; i < 10000; i++) {
//			sb.append(".");
//		}
//		return sb.toString();
//	}
//
//	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();
//		concatWithString();
//		System.out.println("Thoi gian tieu ton boi noi chuoi voi String: " + (System.currentTimeMillis() - startTime) + "ms");
//		startTime = System.currentTimeMillis();
//		concatWithStringBuffer();
//		System.out.println("Thoi gian tieu ton boi noi chuoi voi StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
//	}
//}
//////// equals
//class A {
//
//	public static void main(String[] args) {
//		String sb1 = "123";
////		String sb2 = "123";
////		StringBuilder sb2 = new StringBuilder("123");
//		//String sb = "";
//		if (sb1.equals(sb2)) {
//			System.out.println("Bằng");
//		} else {
//			System.out.println("Không Bằng");
//		}
//	}
//}
//class returntest {
//
//	public static void main(String... args) {
//
//		String name1 = "Test";
//		String s = new String("Test");
//		StringBuilder sb = new StringBuilder("Test");
//
//		System.out.println(name1.equals(sb)); //false
//		System.out.println(name1.equals(s));  //true
//		System.out.println(s.equals(sb));     // false
//		System.out.println(s.equals(name1));  //true
//	}
//
//}
//////// Kiểm tra hiệu suất của lớp StringBuffer và StringBuilder (nghe đồn là StringBulder hiệu suất hơn nhưng thấy tương đương
//class ConcatTest {
//
//	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();
//		StringBuffer sb = new StringBuffer("Java");
//		for (int i = 0; i < 100000; i++) {
//			sb.append("Vietjack");
//		}
//		System.out.println("Thoi gian tieu ton boi StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
//		startTime = System.currentTimeMillis();
//		StringBuilder sb2 = new StringBuilder("Java");
//		for (int i = 0; i < 100000; i++) {
//			sb2.append("Vietjack");
//		}
//		System.out.println("Thoi gian tieu ton boi StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
//	}
//}
//////////////// TestMultipleCatchBlock1
//class TestMultipleCatchBlock1{  
//  public static void main(String args[]){  
//   try{  
//    int a[]=new int[5];  
//    a[5]=30/0;  
//   }  
//   catch(Exception e){System.out.println("Task chung duoc hoan thanh");} // chung trước bị lỗi  
//   catch(ArithmeticException e){System.out.println("Task1 duoc hoan thanh");}  // riêng
//   catch(ArrayIndexOutOfBoundsException e){System.out.println("Task2 duoc hoan thanh");} // riêng đã gồm trong chung  
//   System.out.println("Phan code con lai...");  
// }  
//}  
//class TestFinallyBlock1 {
//
//	public static void main(String args[]) {
//		try {
//			int data = 25 / 0;
//			System.out.println(data);
//		} catch (NullPointerException e) {
//			System.out.println(e);
//		} finally {
//			System.out.println("Khoi finally luon luon duoc thuc thi");
//		}
//		System.out.println("Phan code con lai...");
//		System.g
//	}
//}
////////////////////
//class TestThrow1 {
//
//	static void validate(int tuoi) {
//		if (tuoi < 18) {
//			throw new ArithmeticException("Khong hop le");
//		} else {
//			System.out.println("Chao mung ban den bo phieu");
//		}
//	}
//
//	public static void main(String args[]) {
//		try {
//			validate(13);
//
//		} catch (Exception e) {
//			System.err.println("Lỗi gì đó, vui lòng kiểm tra lại");
//		}
//		System.out.println("Phan code con lai...");
//	}
//}
/////////////
class ExceptionThrow {

	char[] charArray = new char[]{'c', 'e', 'a', 'b', 'd'};

	void checkArray() throws ABException {
		for (int i = 0; i < charArray.length; i++) {
			switch (charArray[i]) {
				case 'a':
					throw new ABException();
				case 'b':
					throw new ABException();// creating the instance of the
				// exception anticipated
				default:
					System.out.println(charArray[i] + " is not A or a B");

			}
		}
	}

	public static void main(String[] args) throws ABException {
		ExceptionThrow et = new ExceptionThrow();

		try {
			et.checkArray();
		} catch (ABException ab) {
			System.err.println(ab.getMessage() + " An exception did actually occur");
		} finally {
			System.out.println("This block will always execute");
		}

	}
}

class ABException extends Exception {
}
