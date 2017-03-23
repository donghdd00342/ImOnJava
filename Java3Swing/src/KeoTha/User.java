/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeoTha;

/**
 *
 * @author DongHo
 */
public class User implements Table{
     private String account;
     private String password;
     private String phone;
     private String email;
     private String gender;
     private String favorite;
     private String note;

     public User(String account, String password, String phone, String email, String gender, String favorite, String note) {
	  this.account = account;
	  this.password = password;
	  this.phone = phone;
	  this.email = email;
	  this.gender = gender;
	  this.favorite = favorite;
	  this.note = note;
     }

     public String getAccount() {
	  return account;
     }

     public void setAccount(String account) {
	  this.account = account;
     }

     public String getPassword() {
	  return password;
     }

     public void setPassword(String password) {
	  this.password = password;
     }

     public String getPhone() {
	  return phone;
     }

     public void setPhone(String phone) {
	  this.phone = phone;
     }

     public String getEmail() {
	  return email;
     }

     public void setEmail(String email) {
	  this.email = email;
     }

     public String getGender() {
	  return gender;
     }

     public void setGender(String gender) {
	  this.gender = gender;
     }

     public String getFavorite() {
	  return favorite;
     }

     public void setFavorite(String favorite) {
	  this.favorite = favorite;
     }

     public String getNote() {
	  return note;
     }

     public void setNote(String note) {
	  this.note = note;
     }

     @Override
     public String toString() {
	  return "User{" + "account=" + account + ", password=" + password + ", phone=" + phone + ", email=" + email + ", gender=" + gender + ", favorite=" + favorite + ", note=" + note + '}';
     }

     @Override
     public String getTable() {
	  return GlobalConfig.getUSER_TABLE();
     }
     
}
