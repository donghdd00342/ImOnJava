/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeoTha;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author DongHo
 * @param <T>
 */
public class Model<T> {

     public static <T> void insert(T obj) throws SQLException {
	  StringBuilder columns = new StringBuilder();
	  StringBuilder values = new StringBuilder();
	  try {
	       Field[] fields = obj.getClass().getDeclaredFields();
	       String pre1 = "";
	       String pre2 = "'";
	       for (Field f : fields) {
		    f.setAccessible(true);
		    System.out.println(f.getType());
		    columns.append(pre1).append(f.getName());
		    // xử lý boolean
		    if (f.getType().toString().equals("boolean")) {
			 if (f.get(obj).toString().equals("true")) {
			      values.append(pre2).append("1");
			 } else {
			      values.append(pre2).append("0");
			 }
		    } else {
			 values.append(pre2).append(f.get(obj));
		    }
		    pre1 = ", ";
		    pre2 = "', '";
	       }
	  } catch (IllegalAccessException | IllegalArgumentException | SecurityException e) {
	       System.err.println("Lỗi: " + e);
	  }
	  values.append("'");
	  StringBuilder querry = new StringBuilder();
	  if ((obj instanceof Table) && (columns.length() != 0) && (values.length() != 0)) {
	       Table tb = (Table) obj;
	       String table = tb.getTable();
	       querry.append("INSERT INTO ").append(table).append(" (").append(columns).append(") VALUES(").append(values).append(");");
	  } else {
	       System.err.println("Model không thể làm việc với đối tượng truyền vào!");
	  }
//	  System.out.println(querry);
	  // Thực thi querry ở đây ....
	  Statement stt = DAO.getConnection().createStatement();
	  stt.execute(querry.toString());
	  System.out.println("Thêm thành công!");
     }

     // Model.delete(Obj);
     public static <T> void delete(T obj, int id) throws SQLException {
	  StringBuilder querry = new StringBuilder();
	  if ((obj instanceof Table) && (id >= 0)) {
	       Table tb = (Table) obj;
	       String table = tb.getTable();
	       querry.append("DELETE FROM ").append(table).append(" WHERE id=").append(id);
	  } else {
	       System.err.println("Model không thể làm việc với đối tượng truyền vào!");
	  }
	  System.out.println(querry);
	  Statement stt = DAO.getConnection().createStatement();
	  stt.execute(querry.toString());
	  System.out.println("Thêm thành công!");
     }
}
