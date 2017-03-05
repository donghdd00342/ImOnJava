/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author DongHo
 */
public class LinkedListTest {
     public static void main(String[] args) {
	  ArrayList arrayL = new ArrayList();
	  LinkedList linkedL = new LinkedList();
	  //////// kiểm tra hiệu suất thêm
	  // ArrayList
	  long start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       arrayL.add(i);
	  }
	  System.out.println("ArrayList's Time = "+ (System.currentTimeMillis() - start)); // 7
	  // LinkedList
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       linkedL.add(i);
	  }
	  System.out.println("LinkedList's Time = "+ (System.currentTimeMillis() - start)); // 3
	  ///////////////// kiểm tra hiệu suất đọc
	  // ArrayList
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       arrayL.get(i);
	  }
	  System.out.println("ArrayList's Time = "+ (System.currentTimeMillis() - start)); // 1
	  // LinkedList
	  start = System.currentTimeMillis();
	  for (int i = 0; i < 100000; i++) {
	       linkedL.get(i);
	  }
	  System.out.println("LinkedList's Time = "+ (System.currentTimeMillis() - start)); // 4148
     }
     
}
