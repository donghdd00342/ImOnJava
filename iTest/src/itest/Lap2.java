/////*
//// * To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// */
//package itest;
////
////import java.util.Scanner;
////
/////**
//// *
//// * @author DongHo
//// */
////public class Lap2 {
////
////    /**
////     * @param args the command line arguments
////     */
//////    public static void main(String[] args) {
////        /*/ BEGIN - Tự động ép kiểu
////        int i = 10;
////        double x = 3.6;
////        double k;
////        
////        System.out.println("i = " + i);
////        System.out.println("x = " + x);
////        
////        System.out.println("(float)i = " + (float)i);
////        System.out.println("(int)x = " + (int)x);
////
////        // Không ép được khác loại. VD: String <> int
////
////        k = i + x;
////        System.out.println("i + x = " + k);
////        System.out.println("(int)(i + x) = " + (int)k);
////        
////        k = i * x;
////        System.out.println("i * x = " + k);
////        
////        k = i - x;
////        System.out.println("i - x = " + k);
////        
////        k = x - i;
////        System.out.println("x - i = " + k);
////        
////        k = i / x;
////        System.out.println("i / x = " + k);
////        System.out.println("i / (int)x = " + (i/(int)x));
////        
////        k = x / i;
////        System.out.println("x / i = " + k);
////        // END - Tự động ép kiểu */
////        // ??? for (int i = 1,  j = 100;  i <= 100, j > 0;  i = i+1, j = j-1) {System.out.println(i + j);}
////        /* int total = 0;
////        for (int square=1, grains = 1; square <= 64; square++) {
////          grains *= 2;
////          if (grains <= 0) {
////            System.out.println("Error: Overflow");
////            break;
////          }
////          total += grains;
////          System.out.print(total + "\t  ");
////          if (square % 4 == 0) System.out.println();
////        } 
////        System.out.println("All done!"); */
////
////        // khởi tạo > kiểm tra điều kiện > thực thi > tăng biến đếm > kiểm tra điều kiện > thực thi...
////        /* iloop: for (int i=1; i < 3; i++) {
////            for (int j=1; j < 4; j++) {
////              if (j == 2) break iloop;
////              System.out.println(i + ", " + j);
////            }
////        }*/
//// /*
////        int[] arrInt = new int[6];
////        
////        arrInt[0] = 1;
////        arrInt[1] = 2;
////        arrInt[2] = 3;
////        arrInt[3] = 4;
////        arrInt[4] = 5;
////        arrInt[5] = 6;
////        
////        for (int i = 0; i < arrInt.length; i++) {
////            int j = arrInt[i];
////            System.out.println("arrInt["+i+"]"+" = "+arrInt[i]);
////        }        
////        /////////////////////////////////
////        
////        float[] squares;
////        squares = new float[101];
////
////        for (int i=0; i <= 100; i++) {
////           squares[i] = i*i;
////        }
////        for (int i = 0; i < squares.length; i++) {
////            float square = squares[i];
////            System.out.println("squares["+i+"] = "+squares[i]);            
////        }
////        ///////////////////////////////////*/
//// /*
////        int arr1[] = {0, 1, 2, 3, 4, 5};
////        int arr2[] = {5, 10, 20, 30, 40, 50};
////        // copy 2 số từ mảng 1 bắt đầu từ vị trí 0 vào mảng 2
////        System.arraycopy(arr1, 0, arr2, 3, 2);
////        System.out.print("array2 = "); // In không xuống dòng
////        System.out.print(arr2[0] + " ");
////        System.out.print(arr2[1] + " ");
////        System.out.print(arr2[2] + " ");
////        System.out.print(arr2[3] + " ");
////        System.out.print(arr2[4] + " ");
////        System.out.print(arr2[5] + " ");
////        ///////////////////////////////
////
////        // Ma trận với đường chéo = 1.0        
////        double[][] id = new double[4][4];
////        System.out.println();
////        for (int row = 0; row < 4; row++) {
////            for (int col = 0; col < 4; col++) {
////                if (row != col) {
////                    id[row][col] = 0.0;
////                } else {
////                    id[row][col] = 1.0;
////                }
////                System.out.print(id[row][col] + " ");
////            }
////            System.out.println();
////        }
////         */
//////        StringBuilder sb = new StringBuilder("Hello ");
//////        sb.append("Java");//bay gio chuoi ban dau bi thay doi  
//////        System.out.println(sb);//in ra ket qua la Hello Java
//////        StringBuilder sb = new StringBuilder("Hello ");
//////        sb.insert(1, "Java");//bay gio chuoi ban dau bi thay doi  
//////        System.out.println(sb);//in ra ket qua la HJavaello
//////
//////        StringBuilder sb = new StringBuilder("Hello");
//////        sb.deleteCharAt(0);
//////        System.out.println(sb);//in ra ket qua la Hlo
//////    } // END - main
////
////    
////} // END - class
////    /////////// supper()
////class Vehicle {
////
////    Vehicle() {
////        System.out.println("Vehicle duoc tao");
////    }
////}
////
////class Bike6 extends Vehicle {
////
////    int speed;
////
////    Bike6(int speed) {
////        this.speed = speed;
////        System.out.println(speed);
////    }
////
////    public static void main(String args[]) {
////        Bike6 b = new Bike6(10);
////    }
////}
//////////// super.method
////class Person {
////
////    void message() {
////        System.out.println("Chao mung");
////    }
////}
////
////class Student16 extends Person {
////
////    @Override
////    void message() {
////        System.out.println("Chao mung ban den voi java");
////    }
////
////    void display() {
////        message();//se trieu hoi phuong thuc message() cua lop hien tai  
////        super.message();//se trieu hoi phuong thuc message() cua lop cha  
////    }
////
////    public static void main(String args[]) {
////        Student16 s = new Student16();
////        s.display();
////    }
////}
/////// Instance Initializer Block hay Constructor được triệu hồi trước nhất?
////class Bike8 {
////
////    int speed;
////
////    Bike8() {
////        System.out.println("constructor duoc trieu hoi");
////    }
////
////    static { // static sẽ triệu hồi 1 lần khi khởi tạo đối tượng (nó nẳm ở Obj???)
////        System.out.println("instance initializer block duoc trieu hoi");
////    }
////
////    public static void main(String args[]) {
////        Bike8 b1 = new Bike8();
////        Bike8 b2 = new Bike8();
////    }
////}
////class A {
////
////    A() {
////        System.out.println("constructor cua lop cha duoc trieu hoi");
////    }
////}
////
////class B2 extends A {
////
////    B2() {
////        super();
////        System.out.println("constructor cua lop con duoc trieu hoi");
////    }
////
////    {
////        System.out.println("instance initializer block duoc trieu hoi");
////    }
////
////    public static void main(String args[]) {
////        B2 b = new B2();
////    }
////}
//////////// biến static final int
////class A {
////
////    static final int data;//bien static final trong  
////
////    static {
////        data = 50;
////    }
////
////    public static void main(String args[]) {
////        System.out.println(A.data);
////    }
////}
//////////// Upcasting
////class Bike {
////
////    void run() {
////        System.out.println("dang chay");
////    }
////}
////
////class Splender extends Bike {
////
////    @Override
////    void run() {
////        System.out.println("chay an toan voi 60km");
////    }
////    
////    void talk() {
////        System.out.println("Bike không có gì để mà  nói!");
////    }
////
////    public static void main(String args[]) {
////        Bike b = new Splender();//day la upcasting
////    }
////}
///////////// đa hình tại runtime
////class Bank {
////class Bike {
////
////    int speedlimit = 90;
////}
////
////class Honda3 extends Bike {
////
////    int speedlimit = 150;
////
////    public static void main(String args[]) {
////        Bike obj = new Honda3();
////        System.out.println(obj.speedlimit);//90  
////    }
////}
///////////////////////// đa hình runtime
////class Animal {
////
////    void eat() {
////        System.out.println("Animal eat");
////    }
////}
////
////class Dog extends Animal {
////
////    @Override
////    void eat() {
////        System.out.println("Dog extends Animal eat");
////    }
////}
////
////class BabyDog extends Dog {
////
////    void eat() {
////        System.out.println("BabyDog extends Dog eat:uong sua");
////    }
////
////    public static void main(String args[]) {
////        Animal a1, a2, a3;
////        a1 = new Animal();
////        a2 = new Dog();
////        a3 = new BabyDog();
////
////        a1.eat();
////        a2.eat();
////        a3.eat();
////    }
////}
////class Animal {
////
////    void eat() {
////        System.out.println("animao dang an...");
////    }
////}
////
////class Dog extends Animal {
////
////    @Override
////    void eat() {
////        System.out.println("dog dang an...");
////    }
////}
////
////class BabyDog1 extends Dog {
////
////    @Override
////    void eat() {
////        System.out.println("...... dang an...");
////    }
////
////    public static void main(String args[]) {
////        Animal a = new BabyDog1();
////        a.eat();
////    }
////}
////class Animal {
////
////    void eat() {
////        System.out.println("animal dang an...");
////    }
////}
////
////class Dog extends Animal {
////
////    @Override
////    void eat() {
////        System.out.println("dog dang an...");
////    }
////
////    public static void main(String args[]) {
////        Animal a = new Dog();
////        a.eat();
////    }
////}
////class Dog {
////
////    private void eat() {
////        System.out.println("dog dang an...");
////    }
////
////    public static void main(String args[]) {
////        Dog d1 = new Dog();
////        d1.eat();
////    }
////}
////class Animal {
////}
////
////class Dog1 extends Animal {//Dog ke thua Animal  
////
////    public static void main(String args[]) {
//////        Dog1 d = null;
////        Dog1 d = new Dog1();
////        System.out.println("d.getClass() = " + d.getClass());
////        System.out.println(d instanceof Dog1);//true  
////        System.out.println(new Dog1() instanceof Dog1);//true  
////    }
////}
/////////// downcasting với instanceof
////class Animal {
////}
////
////class Dog3 extends Animal {
////
////    static void method(Animal a) {
////        if (a instanceof Dog3) {
////            Dog3 d = (Dog3) a; //day la downcasting  
////            System.out.println("Bay gio downcasting duoc thuc hien");
////        }
////    }
////
////    public static void main(String[] args) {
////        Animal a = new Dog3();
////        Dog3.method(a);
////    }
////
////}
////class Animal {
////}
////
////class Dog4 extends Animal {
////
////    static void method(Animal a) {
////        Dog4 d = (Dog4) a;//Day la downcasting  
////        System.out.println("downcasting duoc thuc hien");
////    }
////
////    public static void main(String[] args) {
////        Animal a = new Dog4();
////        Dog4.method(a);
////    }
////}
////interface Printable {
////}
////
////class A implements Printable {
////
////    public void a() {
////        System.out.println("Phuong thuc a Class A");
////    }
////}
////
////class B implements Printable {
////
////    public void b() {
////        System.out.println("Phuong thuc b Class B");
////    }
////}
////
////class Call {
////
////    void invoke(Printable p) { //Day la upcasting  
////        if (p instanceof A) {
////            A a = (A) p;//Day la Downcasting   
////            a.a();
////        }
////        if (p instanceof B) {
////            B b = (B) p;//Day la Downcasting   
////            b.b();
////        }
////
////    }
////}//Phan cuoi cua lop Call 
////
////class Test4 {
////
////    public static void main(String args[]) {
////        Printable p = new B();
////        Call c = new Call();
////        c.invoke(p);
////    }
////}
////////////////// Upcasting & Downcasting
////class A {
///// abstract
////abstract class A {
////
////    private String name;
////    private String email;
////
////    A(String name, String email) {
////        this.name = name;
////        this.email = email;
////    }
////
////    public void setName(String name) {
////        this.name = name;
////    }
////
////    public void setEmail(String email) {
////        this.email = email;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public String getEmail() {
////        return email;
////    }
////
////    public abstract int run(int speed);
////}
////
////class B extends A {
////    public B(){
////        super(null, null);
////    }
////
////    public B(String name, String email) {
////        super(name, email);
////    }
////
////    int a;
////    boolean b;
////
////    public void run() {
////        System.out.println("Đây là run method in Class B");
////    }
////
////    @Override // covariant
////    public int run(int speed) {
////        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
////    }
////
////}
////
////class main {
////    public static void main(String[] args) {
////        B b = new B("Dong", "dong@phuc.com");
////        System.out.println(b.getName());
////        System.out.println(b.getEmail());
////    }
////}
//////////////// abstract & upcasting
//// lop truu tuong Shape
////abstract class Shape {
////
////    int a = 10;
////
////    abstract void draw();
////}
////
////class Rectangle extends Shape {
////
////    @Override
////    void draw() {
////        System.out.println("Ve hinh chu nhat");
////    }
////}
////
////class Circle extends Shape {
////
////    @Override
////    void draw() {
////        System.out.println("Ve hinh tron");
////    }
////}
////
////class Main {
////
////    public static void main(String args[]) {
////        Shape s = new Circle();
////        s.draw();
////        System.out.println("a = " + s.a);
////    }
////}
/////////////////// interface, abstract, extends...
//// mot interface A
////interface A {
////    int a = 100;
////
////    void a();
////
////    void b();
////
////    abstract void c();
////
////    void d();
////}
////
////// lop truu tuong B ke thua interface A  
////abstract class B implements A {
//////trong vi du nay, lop truu tuong B co the chi cung cap trinh trien khai phuong thuc c()
////
//////    public void c() {
//////        System.out.println("Toi la C");
//////    }
////}
////
////// lop M ke thua lop truu tuong B  
////class M extends B {
////
////// bat buoc phai trien khai cac phuong thuc a(), b(), c()
////    public void a() {
////        System.out.println("Toi la a");
////    }
////
////    public void b() {
////        System.out.println("Toi la b");
////    }
////
////    public void d() {
////        System.out.println("Toi la d");
////    }
////}
////
////// lop Test5 chua phuong thuc main()  
////class Test5 {
////
////    public static void main(String args[]) {
////        A a = new M();
////        a.a();
////        a.b();
////        a.c();
////        a.d();
////        System.out.println("a of A = "+ a.a);
////    }
////}
///////////// overiding
////class A {
////    A a(){ // không thể ghi đè static
////        System.out.println("a() of A");
////        return null;
////    }
////}
////class B extends A {
////    @Override
////    B a(){ // method ghi đè phải cùng tên, cùng tham số, cùng kiểu trả về hoặc convariant
////        System.out.println("a() of B extends A");
////        return null;
////    }
////}
////class Main {
////    public static final void main(String[] args) {
////        A a = new B(); // upcasting
////        B b = (B)a; // downcasting
////        b.a();
////    }
////}
//////////// instanceof
////class A {
////}
////
////class B extends A {
////}
////
////class C extends B {
////}
////
////class D extends C {
////}
////
////class E {
////}
////
////class main {
////
////    public static void main(String[] args) {
////        A a = new B(); // upcassting = true, true, false, false
//////        A a = new A(); // true, false, false, false
////        System.out.println("a instanceof A = " + (a instanceof A));
////        System.out.println("a instanceof B = " + (a instanceof B));
////        System.out.println("a instanceof B = " + (a instanceof C));
////        System.out.println("a instanceof B = " + (a instanceof D));
//////        System.out.println(d instanceof E); // ??? không có false!!
////    }
////}
/////////////////////////////////
////class Animal {
////}
////
////class Dog2 {
////}
////
////class Dog3 extends Animal {
////
////    static void method(Animal a) {
////        if (a instanceof Dog3) {
////            Dog3 d = (Dog3) a; // downcasting  
////            System.out.println("Bay gio downcasting duoc thuc hien");
////        } else {
////            System.err.println("a instanceof Dog3 = " + (a instanceof Dog3));
////        }
////    }
////
////    public static void main(String[] args) {
////        Animal a = new Animal(); // upcasting
//////        Dog3 d = (Dog3) a; // downcasting  
//////        Dog3.method(a);
//////        Dog2.test(a);
////        System.err.println("Dog2: a instanceof Dog3 = " + (a instanceof Dog3));
////    }
////
////}
////////////////// hiểu rõ hơn về Upcasting và downcasting
////class A {
////    
////}
////class B extends A {
////    
////}
////class main {
////    public static void main(String[] args) {
////        A a = new B(); // up
////        B b = (B) a; // down
////        // ------------------------
////        A a1 = new A();
////        B b1 = (B) a1; // lỗi tại runtime
////    }
////}
//////////////// đa kế thừa interface
////interface A {
////    int a = 100;
////    void run();
////}
////
////interface B {
////
////    void run(); // không bị lưỡng nghĩa vì người dùng cuối sẽ định nghĩa BODY
////
////    void talk();
////}
////
////interface C extends A, B {
////
////    void fly();
////}
////
////class Test implements C {
////
////    @Override
////    public void fly() {
////        System.out.println("fly");
////    }
////
////    @Override
////    public void run() {
////        System.out.println("run");
////    }
////
////    @Override
////    public void talk() {
////        System.out.println("talk");
////    }
////
////    //---------------------- TEST-----
////    public static void main(String[] args) {
////        A a = new Test(); // up
////        a.run(); // a of A
////        System.out.println("a = "+ a.a);
////        B b = (B) a; // down
////        b.talk(); // b of B
////    }
////
////}
////////////////// enum
////enum Week {
////    THUHAI, THUBA, THUTU, THUNAM, THUSAU, THUBAY, CHUNHAT;
////}
////class main {
////    public static void main(String[] args) {
////        Week w = Week.CHUNHAT;
////        Week[] arrW = Week.values();
////        for (Week week : arrW) {
////            System.out.println(week);
////        }
////    }
////}
//////////////////////////// ghi đè toString trong enum
////enum Currency {
////
////    VND, USD, EURO;
////
////    @Override
////    public String toString() {
////        if (this == VND) {
////            return "Dong---------";
////        } else if (this == USD) {
////            return "Dola----------";
////        }
////        return super.toString();
////    }
////
////    public static void main(String[] args) {
////        Currency money = Currency.USD;
////
////        System.out.println("Money " + money);
////        System.out.println("Money " + money.toString());
////        System.out.println("VND " + Currency.VND);
////        System.out.println("EURO " + Currency.EURO);
////    }
////}
/////////////////////////// trừu tượng trong enum
////enum Color {
////
////    RED("red") {
////        @Override
////        public String getHexCode() {
////            return "#ff0000";
////        }
////    },
////    GREEN("green") {
////        @Override
////        public String getHexCode() {
////            return "#00ff00";
////        }
////    },
////    BLUE("blue") {
////        @Override
////        public String getHexCode() {
////            return "#0000ff";
////        }
////    };
////
////    private String name;
////
////    Color(String name) {
////        this.name = name;
////    }
////
////    public String getName() {
////        return name;
////    }
////
////    public abstract String getHexCode();
////
////}
////
/////////// tiếp tục chơi với Exception
//class E1 extends Exception {
//     
//}
//class E2 extends E1 {
//     
//}
//class E3 extends E2 {
//     
//}
//class Test {
//     public static void main(String[] args) {
//	  try {
//	       throw new E1();
//	  } catch (E3 e) {
//	       System.err.println("Là E3");
//	  } catch (E2 e) {
//	       System.err.println("Là E2");
//	  } catch (E1 e) {
//	       System.err.println("Là E1");
//	  }
//	  System.out.println(new Object().toString());
//     }
//}