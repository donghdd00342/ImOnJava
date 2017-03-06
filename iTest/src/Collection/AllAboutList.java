/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author DongHo
 */
public class AllAboutList {
     public static void main(String[] args) {
	  List<Cat> al = new ArrayList<Cat>();
	  List<Cat> ll = new LinkedList<Cat>();
	  List<Cat> v = new Vector<Cat>();
	  /////// kiểm tra tôc độ add
	  // hs
	  long start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       al.add(new Cat(i));
	  }
	  System.out.println("ADD's Time: ArrayList = " + (System.currentTimeMillis() - start));
	  // ts
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       ll.add(new Cat(i));
	  }
	  System.out.println("ADD's Time: LinkedList = " + (System.currentTimeMillis() - start));
	  // lhs
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       v.add(new Cat(i));
	  }
	  System.out.println("ADD's Time: Vector = " + (System.currentTimeMillis() - start));
	  //////////// kiểm tra tốc độ remove
	  System.out.println("--------- kiểm tra tốc độ remove ------------------");
	  // hs
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       al.remove(new Cat(i));
	  }
	  System.out.println("ADD's Time: ArrayList = " + (System.currentTimeMillis() - start));
	  // ts
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       ll.remove(new Cat(i));
	  }
	  System.out.println("ADD's Time: LinkedList = " + (System.currentTimeMillis() - start));
	  // lhs
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       v.remove(new Cat(i));
	  }
	  System.out.println("ADD's Time: Vector = " + (System.currentTimeMillis() - start));
     }
}
//compile-single:
//run-single:
//ADD's Time: ArrayList = 16
//ADD's Time: LinkedList = 0
//ADD's Time: Vector = 15
//--------- kiểm tra tốc độ remove ------------------
//ADD's Time: ArrayList = 1078
//ADD's Time: LinkedList = 16
//ADD's Time: Vector = 1094
//BUILD SUCCESSFUL (total time: 3 seconds)