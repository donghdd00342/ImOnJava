/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author DongHo
 */
public class IOObjectFile {

     /**
      * Ghi đối tượng obj vào fileName, sử dụng try-catch-resouces ko cần
      * flush(); Serializable theo luồng nên append sẽ làm hỏng file, ta sẽ ghi
      * lại thằng chung nhất (bố của các thằng) là thăng Object
      *
      * @param obj
      * @param fileName
      */
     public synchronized static void saveObject(Object obj, String fileName) {
	  try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
	       oos.writeObject(obj);
	  } catch (Exception e) {
	       System.err.println("Lỗi: " + e);
	  }
     }

     /**
      * Đọc Object lưu trong fileName, sử dụng sử dụng try-catch-resouces để
      * java tự xử IO, ta sẽ đọc ra thằng chung nhất (bố của các thằng) là thăng
      * Object
      *
      * @param fileName
      * @return
      */
     public static Object readObject(String fileName) {
	  try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
	       return (Object) ois.readObject();
	  } catch (Exception e) {
	       System.err.println("Lỗi: " + e);
	       return null;
	  }
     }
}
