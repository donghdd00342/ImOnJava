/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author DongHo
 */
public class LinkedListVSHashSet {
     // Đẩy các dấu đóng ngoặc vào stack đồng thời remove xâu con khi gặp dấu mở ngoặc

     public String removeTextInBracket(String text) {
	  int length = text.length();
	  int tempLength;
	  Stack<Integer> st = new Stack<Integer>();
	  for (int i = length - 1; i >= 0; i--) {
	       if (text.charAt(i) == ')') {
		    st.push(i);
		    continue;
	       }
	       if (text.charAt(i) == '(' && !st.isEmpty()) {
		    tempLength = text.length();
		    text = text.substring(0, i) + text.substring(st.pop() + 1);
		    updateStack(st, tempLength - text.length());
	       }
	  }
	  return text;
     }

// Update lại vị trí của các dấu đóng mở ngoặc khi độ dài xâu thay đổi.
     private static void updateStack(Stack<Integer> stack, int lengthSpan) {
	  int size = stack.size();
	  Integer temp;
	  for (int i = 0; i < size; i++) {
	       temp = stack.get(i);
	       stack.remove(i);
	       stack.add(i, temp - lengthSpan);
	  }
     }

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
	  
	  //////////// Regex ăn xâu kiểu greedy và lazy
	  String inputString = "Công ty (((CT))) trách nhiệm hữu hạn (TNHH)";
	  System.out.println(new LinkedListVSHashSet().removeTextInBracket(inputString));
     }

} // LinkedList: thêm 
