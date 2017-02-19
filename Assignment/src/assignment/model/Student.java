/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.model;

/**
 * Class này định nghĩa lớp đối tượng sinh viên
 *
 * @author DongHo
 */
public class Student {

    private String masv;
    private String name;

    public Student() {
        this.masv = "";
        this.name = "";
    }

    public Student(String masv, String name) {
        this.masv = masv;
        this.name = name;
    }

    public String getMasv() {
        return masv;
    }

    public String getName() {
        return name;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public void setName(String name) {
        this.name = name;
    }

}
