/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collection;

/**
 *
 * @author DongHo
 */
public enum MyEnum {
     CAFE, TEA;
     private String name;

     public String getName() {
	  return name;
     }

     public void setName(String name) {
	  this.name = name;
     }

}

class Main {

     public static void main(String[] args) {
	  MyEnum.CAFE.setName("cafe");
	  MyEnum.TEA.setName("tea");
	  System.out.println(MyEnum.CAFE + " - " + MyEnum.TEA);
	  System.out.println(MyEnum.CAFE.getName() + " - " + MyEnum.TEA.getName());
     }
}
