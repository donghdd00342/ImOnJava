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
public class LinkedHashSetTest {
     public static void main(String[] args) {
	  LinkedHashSet lhs = new LinkedHashSet();
	  System.out.println("lhs.hashcode() = "+lhs.hashCode());
	  lhs.add(1);
	  System.out.println("lhs.hashcode() = "+lhs.hashCode());
	  lhs.add(9);
	  System.out.println("lhs.hashcode() = "+lhs.hashCode());
	  lhs.add(2);
	  System.out.println("lhs.hashcode() = "+lhs.hashCode());
	  lhs.add(8);
	  System.out.println("lhs.hashcode() = "+lhs.hashCode());
	  lhs.add(1);
	  
	  lhs.forEach((t) -> {
	       System.out.println(t);
	  });
	  /////////////
	  Set ts = new TreeSet();
	  Set hs = new HashSet();
     }
}
