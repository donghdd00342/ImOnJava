/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DongHo
 */
public class SortString {
     @SuppressWarnings("empty-statement")
     public static void main(String[] args) {
	  // cho một chuỗi các tên
	  String[] strName = {"Dong", "Phuc", "Anh Thu", "Dong", "Thanh Dat"};
	  // yêu cầu sắp xếp mảng chuỗi trên theo thứ tự tăng dần
	  // Cách 1: dùng Set
	  List<String> s = new ArrayList<String>();
	  for (int i = 0; i < strName.length; i++) {
	       s.add(strName[i]);	       
	  }
	  System.out.println("---------- Trước khi sắp xếp --------");
	  System.out.println(s);
	  System.out.println("---------- Sau khi sắp xếp --------");
	  Collections.sort(s);
	  System.out.println(s);
	  String[] b = new String[s.size()];
	  for (int i = 0; i < b.length; i++) {
	       b[i] = s.get(i);	       
	  }
	  System.out.println("In mảng mới : ----------");
	  for (int i = 0; i < b.length; i++) {
	       System.out.println(b[i]);
	       
	  }
     }
     
}
