/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2quylop;

import java.util.Date;

/**
 *
 * @author DongHo
 */
public class Student {

     private String maSinhVien;
     private String name;
     private float soTien;
     private Date ngayDong;

     public String getMaSinhVien() {
	  return maSinhVien;
     }

     public String getName() {
	  return name;
     }

     public float getSoTien() {
	  return soTien;
     }

     public Date getNgayDong() {
	  return ngayDong;
     }

     public void setMaSinhVien(String maSinhVien) {
	  this.maSinhVien = maSinhVien;
     }

     public void setName(String name) {
	  this.name = name;
     }

     public void setSoTien(float soTien) {
	  this.soTien = soTien;
     }

     public void setNgayDong(Date ngayDong) {
	  this.ngayDong = ngayDong;
     }

     @Override
     public String toString() {
	  return "SinhVien{" + "maSinhVien=" + maSinhVien + ", name=" + name + ", soTien=" + soTien + ", ngayDong=" + ngayDong + '}';
     }
}
