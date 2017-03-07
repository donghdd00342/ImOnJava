/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author DongHo
 */
public class HowAboutMap {

     public static void main(String[] args) {
	  Map<Integer, Dog> map = new HashMap<Integer, Dog>();
	  map.put(1, new Dog(1));
	  map.put(2, new Dog(2));
	  map.put(3, new Dog(3));
	  map.put(3, new Dog(6)); // ghi đè lên Dog(3)
	  // in ra
	  for (Map.Entry<Integer, Dog> entry : map.entrySet()) {
	       Integer key = entry.getKey();
	       Dog value = entry.getValue();
	       System.out.println(key + " - " + value);
	  }

	  /////////////
	  Set<Dog> s = new HashSet<Dog>();
	  s.add(new Dog(1, "aaa"));
	  s.add(new Dog(2, "2"));
	  s.add(new Dog(3, "33"));
	  s.add(new Dog(3, "Kitty"));
	  System.out.println(s);

     }
}
