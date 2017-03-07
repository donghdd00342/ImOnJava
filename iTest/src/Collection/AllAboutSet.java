/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author DongHo
 */
public class AllAboutSet {

     public static void main(String[] args) {
	  Set<Cat> hs = new HashSet<Cat>();
	  Set<Cat> ts = new TreeSet<Cat>();
	  Set<Cat> lhs = new LinkedHashSet<Cat>();
	  /////// kiểm tra tôc độ add
	  // hs
	  long start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       hs.add(new Cat(i));
	  }
	  System.out.println("ADD's Time: HashSet = " + (System.currentTimeMillis() - start));
	  // ts
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       ts.add(new Cat(i));
	  }
	  System.out.println("ADD's Time: TreeSet = " + (System.currentTimeMillis() - start));
	  // lhs
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       lhs.add(new Cat(i));
	  }
	  System.out.println("ADD's Time: LinkedHashSet = " + (System.currentTimeMillis() - start));
	  //////////// kiểm tra tốc độ remove
	  System.out.println("--------- kiểm tra tốc độ remove ------------------");
	  // hs
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       hs.remove(new Cat(i));
	  }
	  System.out.println("ADD's Time: HashSet = " + (System.currentTimeMillis() - start));
	  // ts
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       ts.remove(new Cat(i));
	  }
	  System.out.println("ADD's Time: TreeSet = " + (System.currentTimeMillis() - start));
	  // lhs
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       lhs.remove(new Cat(i));
	  }
	  System.out.println("ADD's Time: LinkedHashSet = " + (System.currentTimeMillis() - start));
     }
}

//compile-single:
//run-single:
//ADD's Time: HashSet = 16
//ADD's Time: TreeSet = 47
//ADD's Time: LinkedHashSet = 15
//--------- kiểm tra tốc độ remove ------------------
//ADD's Time: HashSet = 16
//ADD's Time: TreeSet = 31
//ADD's Time: LinkedHashSet = 16
//BUILD SUCCESSFUL (total time: 1 second)