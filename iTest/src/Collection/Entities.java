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

class Dog {
     public static void main(String[] args) {
	  Dog d1 = new Dog(0);
	  Dog d2 = new Dog(1, "aaa");
	  System.out.println(d2);
     }
     private int size;
     private String name;

     public Dog(int size) {
	  this.size = size;
     }

     public Dog(int size, String name) {
	  this.name = name;
	  this.size = size;
     }
     

     public int getSize() {
	  return size;
     }

     public void setSize(int size) {
	  this.size = size;
     }

     @Override
     public String toString() {
	  return "Dog{" + "size=" + size + ", name=" + name + '}';
     }

     @Override
     public int hashCode() {
	  int hash = 3;
	  return hash;
     }

     @Override
     public boolean equals(Object obj) {
	  return (obj instanceof Dog)?(this.getSize() == ((Dog)obj).getSize()):false;
     }
}

class Cat implements Comparable<Cat>{

     long size;

     public Cat(long foo) {
	  size = foo;
     }

     @Override
     public int hashCode() {
	  int hash = 3;
	  hash = 97 * hash + (int) (this.size ^ (this.size >>> 32));
	  return hash;
     }

     @Override
     public boolean equals(Object obj) {
	  return (obj instanceof Cat) ? this.size == ((Cat)obj).size : false;
     }

     @Override
     public int compareTo(Cat t) {
	  return (int) (this.size - t.size);
     }
}