/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author DongHo
 */
public class TreeSetTest {
     public static void main(String[] args) {
	  TreeSet<Integer> trS = new TreeSet();
	  // thêm
	  trS.add(1);
	  trS.add(9);
	  trS.add(2);
	  trS.add(1);
	  trS.add(3);
	  trS.forEach((t) -> {
	       System.out.println(t);
	  });
	  System.out.println(trS.comparator());
	  
     }
     
}
