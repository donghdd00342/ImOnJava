/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2quylop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author DongHo
 */
public class Java2QuyLop {

     /**
      * @param args the command line arguments
      * @throws java.io.FileNotFoundException
      */
     public static void main(String[] args) throws FileNotFoundException, IOException {
	  Map<String, Student> stuMap = new HashMap<>();
	  // 1 - 2. ĐỌC FILE VÀ IN RA MÀN HÌNH
	  String readFile = "quylop.txt";
	  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(readFile), "UTF-8"));
	  Student sv;
	  String line;
	  try {
	       // đọc file unicode
	       // bỏ dòng đầu tiên
	       line = br.readLine();
	       // đọc từ dòng thứ 2
	       line = br.readLine();
	       while (line != null) {
		    // lấy thông tin
		    sv = Untilities.getInfo(line);
		    // in thông tin sv vưa lấy được từ file
		    Untilities.print(sv);
		    // 3. TÍNH TỔNG SỐ TIỀN
		    // kiểm tra trùng
		    if (stuMap.containsKey(sv.getMaSinhVien())) {
			 // nếu đã có thì cập nhật lại số tiền của sv hiện tại
			 sv.setSoTien(sv.getSoTien() + stuMap.get(sv.getMaSinhVien()).getSoTien());
			 // cập nhật xong (cộng dồn) thì thêm sv vào Map (ghi đè sv)
			 stuMap.put(sv.getMaSinhVien(), sv);
		    } else {
			 // nếu không có thì thêm bình thường
			 stuMap.put(sv.getMaSinhVien(), sv);
		    }
		    // đọc dòng tiếp theo
		    line = br.readLine();
	       }
	  } catch (IOException | ParseException e) {
	       System.err.println("Lỗi: " + e);
	  } finally {
	       br.close();
	  }
	  System.out.println("--------------------------------");
	  // 4. IN RA FILE "quylop2.txt"
	  String writeFile = "quylop2.txt";
	  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(writeFile), "UTF-8"));
	  stuMap.forEach((t, u) -> {
	       try {
		    bw.write(Untilities.writeLine(u));
		    bw.newLine();
	       } catch (IOException ex) {
		    System.err.println("Lỗi: " + ex);
	       }
	  });
	  bw.close();
	  System.out.println("Ghi file thành công!");
     }

}
