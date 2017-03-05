/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashSet;

/**
 *
 * @author DongHo
 */
public class HashSetDemo {

     public static void main(String[] args) {
	  // tạo HashSet
	  HashSet hs = new HashSet();
	  // thêm phần tử cho HashSet
	  System.out.println("hs.hashCode() = " + hs.hashCode());
	  System.out.println("Số phần tử = " + hs.size());
	  hs.add(1);
	  System.out.println("hs.hashCode() = " + hs.hashCode());
	  hs.add('A');
	  System.out.println("hs.hashCode() = " + hs.hashCode());
	  hs.add("C");
	  System.out.println("hs.hashCode() = " + hs.hashCode());
	  hs.add("String");
	  System.out.println("hs.hashCode() = " + hs.hashCode());
	  hs.add(100.68);
	  System.out.println("hs.hashCode() = " + hs.hashCode());
	  // in HashSet
	  System.out.println("Sau khi thêm, Số phần tử = " + hs.size());
	  System.out.println(".toString() = " + hs);
	  hs.forEach((t) -> {
	       System.out.println(t);
	  });
	  // Xóa, thay đổi phần tử
	  System.out.println(hs.contains(Integer.valueOf(1)));
	  hs.remove(Integer.valueOf(1));
	  // in ra
	  System.out.println(".toString() = " + hs);
	  // hashCode
	  System.err.println(hs.hashCode());
     }
}
