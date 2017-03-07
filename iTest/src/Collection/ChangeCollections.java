/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.ArrayList;
import java.util.Arrays;
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
public class ChangeCollections {

     public static void main(String[] args) {
	  // cho một mảng chuỗi
	  String[] strName = {"Dong", "Phuc", "Anh Thu", "Dong", "Thanh Dat"};
	  // tạo các loại Collection từ mảng trên
	  // First: chuyển mảng sang dạng List
	  /////////////////////////////////////////////// LIST
	  List<String> myList = Arrays.asList(strName);
	  // 1. ArrayList
	  List<String> al = new ArrayList<>(myList);
	  // in
	  System.out.println("ArrayList = " + al); // [Dong, Phuc, Anh Thu, Dong, Thanh Dat]
	  // 2. Vector
	  List<String> vt = new Vector<>(myList);
	  // in
	  System.out.println("Vector = " + vt);
	  // 3. LinkedList
	  List<String> ll = new LinkedList<>(myList);
	  // in
	  System.out.println("LinkedList = " + ll); // [Dong, Phuc, Anh Thu, Dong, Thanh Dat]
	  //ll = new LinkedList<>(al);
	  // in
	  //System.out.println(ll); // [Dong, Phuc, Anh Thu, Dong, Thanh Dat]
	  
	  /////////////////////////////////////////////// SET
	  // 4. HashSet
	  Set<String> hs = new HashSet<>(myList);
	  System.out.println("HashSet = " + hs);
	  // 5. TreeSet
	  Set<String> ts = new TreeSet<>(myList);
	  System.out.println("TreeSet = " + ts);
	  // 6. LinkedHashSet
	  Set<String> lhs = new LinkedHashSet<>(myList);
	  System.out.println("LinkedHashSet = " + lhs);

     }
}
