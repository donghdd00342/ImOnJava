/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2quylop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DongHo
 */
public class Untilities {
     

     public static Student getInfo(String line) throws ParseException {
	  Student sv = new Student();
	  String pattern = "(A[0-9]{3,})([\\s\\t]{2,})([a-zA-Z\\s]+)([\\s\\t]{2,})([0-9\\.]+)([\\s\\t]{2,})([0-9/]+)";
	  Matcher m = Pattern.compile(pattern).matcher(line);
	  while (m.find()) {
	       sv.setMaSinhVien(m.group(1));
	       sv.setName(m.group(3));
	       sv.setSoTien(Float.valueOf(m.group(5)));
	       sv.setNgayDong(new SimpleDateFormat("dd/mm/yyyy").parse(m.group(7)));
	  }
	  return sv;
     }

     static void print(Student svObj) {
	  System.out.printf("%-10s%-20s%6.2f%15s\n", svObj.getMaSinhVien(), svObj.getName(), svObj.getSoTien(), new SimpleDateFormat("dd/mm/yyyy").format(svObj.getNgayDong()));
     }
     
     static String writeLine(Student svObj) {
	  return String.format("%-10s%-20s%6.2f%15s\n", svObj.getMaSinhVien(), svObj.getName(), svObj.getSoTien(), new SimpleDateFormat("dd/mm/yyyy").format(svObj.getNgayDong()));
     }
     
}
