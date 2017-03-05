/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;

/**
 *
 * @author DongHo
 */
class ArrayListDemo {

     public static void main(String args[]) {
	  // tạo ArrayList<Integer> trống
	  ArrayList<Integer> listInt = new ArrayList<>();
	  // thêm 5 phần tử vào List
	  System.err.println("- size() = "+ listInt.size());
	  listInt.add(1);
	  listInt.add(1, 3);
	  listInt.add(5);
	  listInt.add(10);
	  // kiểm tra Empty
	  System.err.println("- size() = "+ listInt.size());
	  System.out.println(".isEmpty() = " + listInt.isEmpty()); // false
	  System.out.println(".contains(10) = " + listInt.contains(10)); // true
	  System.out.println(".toString() = " + listInt.toString()); // [1, 3, 5, 10]
	  // in ra màn hình với foreach thông thường
	  System.out.println("----------- bắt đầu in ---------------");
	  for (int in : listInt) {
	       System.out.println(in);
	  }
	  
	  System.out.println("----------- bắt đầu đổi giá trị ---------------");
	  // đổi giá trị một phần tử
	  listInt.set(0, 100);
	  // in ra màn hình
	  listInt.forEach((integer) -> {
	       System.out.println(integer);
	  });
	  System.err.println("- size() = "+ listInt.size());
	  // xóa một phân tử
	  System.out.println("----------- bắt đầu xóa phần tử ---------------");
	  listInt.remove(Integer.valueOf("50"));
	  // in ra màn hình
	  for (int i = 0; i < listInt.size(); i++) {
	       System.out.println(listInt.get(i));
	       
	  }
	  // xóa một phân tử
	  System.err.println("- size() = "+ listInt.size());
	  System.out.println("----------- Xóa phần tử tiếp ---------------");
	  listInt.remove(listInt.size()-1);
	  // in
	  listInt.forEach((t) -> {
	       System.out.println(t);
	  });
	  System.err.println("- size() = "+ listInt.size());
     }
}
