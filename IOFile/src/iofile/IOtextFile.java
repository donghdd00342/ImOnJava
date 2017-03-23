/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iofile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DongHo
 */
public class IOtextFile {

     /**
      * Ghi file văn bản, đầu vào là String sử dụng BufferedWrite, tự xử lý
      * xuống dòng trong stringInput nếu append
      *
      * @param stringInput
      * @param fileName
      * @param append
      * @throws IOException
      */
     public synchronized static void save(String stringInput, String fileName, boolean append) throws IOException {
	  FileWriter fw;
	  if (append) {
	       fw = new FileWriter(fileName, append);
	  } else {
	       fw = new FileWriter(fileName);
	  }
	  try (BufferedWriter bw = new BufferedWriter(fw)) {
	       bw.write(stringInput);
	       bw.flush();
	  } catch (Exception e) {
	       System.err.println("Lỗi: " + e);
	  }
     }

     /**
      * Ghi file văn bản, đầu vào là mảng char[] sử dụng BufferedWrite, tự xử lý
      * xuống dòng trong stringInput nếu append
      *
      * @param charArrayInput
      * @param fileName
      * @param append
      * @throws IOException
      */
     public synchronized static void save(char[] charArrayInput, String fileName, boolean append) throws IOException {
	  FileWriter fw;
	  if (append) {
	       fw = new FileWriter(fileName, append);
	  } else {
	       fw = new FileWriter(fileName);
	  }
	  try (BufferedWriter bw = new BufferedWriter(fw)) {
	       bw.write(charArrayInput);
	       bw.flush();
	  } catch (Exception e) {
	       System.err.println("Lỗi: " + e);
	  }
     }

     /**
      * Đọc file văn bản sử dụng BufferedWrite, đoc theo dòng
      * @param fileName
      * @return
      * @throws FileNotFoundException
      * @throws IOException 
      */
     public static String read(String fileName) throws FileNotFoundException, IOException {
	  StringBuilder sb = new StringBuilder();
	  String str;
	  BufferedReader br = new BufferedReader(new FileReader(fileName));
	  while ((str = br.readLine()) != null) {
	       sb.append(str).append("\n");
	  }
	  return sb.toString();
     }
}
