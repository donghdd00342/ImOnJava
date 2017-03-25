/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproperty;

/**
 *
 * @author DongHo
 */
import java.util.List;
import java.util.ArrayList;

// đối tượng quản lý Animal

class AnimalManager<T> {

     private List<T> animals;

     public void output() {
	  if (animals != null && !animals.isEmpty()) {
	       for (int i = 0; i < animals.size(); i++) {
		    System.out.println("Animal " + (i + 1) + "\t" + animals.get(i));
	       }
	  }
     }

     public void setAnimals(List<T> animals) {
	  this.animals = animals;
     }

     public List<T> getAnimals() {
	  if (animals == null) {
	       animals = new ArrayList<T>();
	  }
	  return this.animals;
     }
}
// Đối tượng Dog:

class Dog {

     private String name;

     public Dog(String name) {
	  this.name = name;
     }

     public String getName() {
	  return this.name;
     }

     public void setName(String name) {
	  this.name = name;
     }

     public String toString() {
	  return this.name;
     }

}
// Đối tượng Cat:

class Cat {

     private String name;

     public Cat(String name) {
	  this.name = name;
     }

     public String getName() {
	  return this.name;
     }

     public void setName(String name) {
	  this.name = name;
     }

     public String toString() {
	  return this.name;
     }

}

class TestAnimal{
    public static void main(String... args){
        AnimalManager<Dog> managerDog = new AnimalManager<Dog>();
//	// ko gán ra biến
//	managerDog.getAnimals().add(new Dog("Chó 1"));
//        managerDog.getAnimals().add(new Dog("Chó 2"));
//        managerDog.output();
	
	
	List<Dog> listDog = new ArrayList<>();
	
	listDog = managerDog.getAnimals();
        listDog.add(new Dog("Chó 1"));
        listDog.add(new Dog("Chó 2"));
        managerDog.output();
 
        System.out.println("/------------------------------------------------------/");
 
        AnimalManager<Cat> managerCat = new AnimalManager<Cat>();
//	// ko gán ra biến	
//        managerCat.getAnimals().add(new Cat("Mèo 1"));
//        managerCat.getAnimals().add(new Cat("Mèo 2"));
//        managerCat.output();
	
	List<Cat> listCat = new ArrayList<>();
	listCat = managerCat.getAnimals();
        listCat.add(new Cat("Mèo 1"));
        listCat.add(new Cat("Mèo 2"));
        managerCat.output();
    }
}
