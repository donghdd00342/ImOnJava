/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproperty;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DongHo
 */
public class GenericSort {
 
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> intArray = new ArrayList<Integer>();
        ArrayList <String> stringArray = new ArrayList<String>();
        System.out.print("Enter number of element of the integer array: ");
        int nint = new Scanner(System.in).nextInt();
        System.out.print("Enter number of element of the string array: ");
        int nstring = new Scanner(System.in).nextInt();
        System.out.println("==============Enter integer array=============");
        for(int i = 0; i < nint; i ++)
        {
            int tmp = new Scanner(System.in).nextInt();
            intArray.add(tmp);
        }
        System.out.println("==============Enter string array=============");
        for(int i = 0; i < nstring; i ++)
        {
            String tmp = new Scanner(System.in).nextLine();
            stringArray.add(tmp);
        }
        Sort(intArray);
        Sort(stringArray);
        System.out.println("========================");
        System.out.println("\nThe integer array after sorting: ");
        printArray(intArray);
        System.out.println("===========================");
        System.out.println("\nThe string array after sorting: ");
        printArray(stringArray);
    }
    public static <T extends Comparable<T>> void Sort (ArrayList <T> arr){
        for(int i = 0; i < arr.size() - 1; i ++)
            for(int j = i+1; j < arr.size(); j++)
            {
                if(arr.get(i) .compareTo(arr.get(j))< 0){
                    T tmp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, tmp);
                }
            }
 
 
    }
    public static <T> void printArray(ArrayList <T> arr){
        for(int i = 0; i < arr.size(); i ++){
            System.out.print(arr.get(i) + "   ");
        }
        System.out.println();
    }

}
