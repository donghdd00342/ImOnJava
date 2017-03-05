/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author DongHo
 */
public class LinkedListVSHashSet {

     public static void main(String[] args) {
	  LinkedList ll = new LinkedList();
	  HashSet hs = new HashSet();

	  // LinkedList
	  long start = System.currentTimeMillis();
	  for (int i = 0; i < 10000; i++) {
	       ll.add(i);
	  }
	  System.out.println("ADD: LinkedList's time = " + (System.currentTimeMillis() - start)); // 1
	  // HashSet
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 10000; i++) {
	       hs.add(i);
	  }
	  System.out.println("ADD: HashSet's time = " + (System.currentTimeMillis() - start)); // 3

	  System.out.println("------------------------------- bắt đầu xóa --------------------------");
	  // LinkedList
	  start = System.currentTimeMillis();
	  Iterator iterLL = ll.iterator();
	  int i = 0;
	  while (iterLL.hasNext()) {
	       ll.remove(Integer.valueOf(i));
	       i++;
	  }
	  System.out.println("REMOVE: LinkedList's time = " + (System.currentTimeMillis() - start)); // 1
	  // HashSet
	  start = System.currentTimeMillis();
	  for (int j = 0; j < 10000; j++) {
	       hs.remove(j);
	  }
	  System.out.println("REMOVE: HashSet's time = " + (System.currentTimeMillis() - start)); // 3
     }

} // LinkedList: thêm 
