/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DongHo
 */
public class Temp {
//     public static void main(String[] args) {
//	  Set hs = new HashSet();
//	  hs.add(1);
//	  hs.add(9);
//	  hs.add(8);
//	  hs.add(5);
//	  hs.add(1);
//	  hs.add(2);
//	  hs.forEach((t) -> {
//	       System.out.println(t);
//	  });
//	  
//     }

//     public static void main(String[] args) {
//	  // TODO code application logic here
//	  int[] a = {1, 3, 5, 7, 9, 10, 13};
//	  int[] b = {3, 4, 5, 6, 8, 9, 13, 17, 20};
//
//	  Set<Integer> hs = new HashSet<Integer>();
//	  for (int i = 0; i < a.length; i++) {
//	       hs.add(a[i]);
//	  }
//	  for (int i = 0; i < b.length; i++) {
//	       hs.add(b[i]);
//	  }
//	  // in
//	  hs.forEach((t) -> {
//	       System.out.println(t);
//	  });
//     }
     
     public static void main(String[] args) {
	  Set<Cat> hs = new HashSet<Cat>();
	  hs.add(new Cat(1));
	  hs.add(new Cat(8));
	  hs.add(new Cat(6));
	  hs.add(new Cat(2));
	  hs.add(new Cat(2));
	  hs.add(new Cat(3));
	  hs.add(new Cat(0));
	  hs.forEach((t) -> {
	       System.out.println(t);
	  });
     }
}
class Cat implements Comparable<Cat>{
     int size;

     public Cat(int size) {
	  this.size = size;
     }

     @Override
     public String toString() {
	  return "Cat{" + "size=" + size + '}';
     }

     @Override
     public int compareTo(Cat t) {
	  return this.size - t.size;
     }
     
}
/// ????