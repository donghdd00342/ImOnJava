/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.controller;

import assignment.model.Student;
import assignment.model.StudentModel;
import assignment.untils.Untils;
import assignment.view.View;

/**
 * Class này chứa các hàm thực hiện nhiệm vụ trong menu
 *
 * @author DongHo
 */
public class StudentsController {

//    |  1. Tạo mới sinh viên                  |
    /**
     * Hàm này thực hiện nhiệm vụ thêm mới sinh viên vào cơ sở dữ liệu Dữ liệu
     * được nhập vào từ người dùng
     */
    public static void addStudent() {
        Student student = new Student();
        boolean continueBoolean = true;
        while (continueBoolean) {
            System.out.println("Nhập vào mã số sinh viên: ");
            student.setMasv(Untils.getString(3));

            System.out.println("Nhập vào tên sinh viên: ");
            student.setName(Untils.getString(3));

            if (StudentModel.save(student)) {
                System.err.println("Đã thêm mới thành công!");
            } else {
                System.err.println("Có gì đó không đúng, vui lòng thử lại...");
            }

            continueBoolean = View.continueBoolean();
        }

    }
//    |  2. Tìm và sửa sinh viên theo mã số    |

    /**
     * Hàm này thực hiện nhiệm vụ sửa sinh viên theo mã số Người dùng sẽ nhập
     * vào mã số sinh viên để tìm sửa
     */
    public static void editStudent() {
        Student student = new Student();
        String masv;
        String name;
        int id;
        boolean continueBoolean = true;

        while (continueBoolean) {
            System.out.println("Nhập mã số SV muốn sửa: ");
            masv = Untils.getString(3);

            id = StudentModel.find(masv);

            if (id > 0) {
                System.out.println("Nhập vào mã số mới của sinh viên?: ");
                student.setMasv(Untils.getString(3));

                System.out.println("Nhập vào tên mới của sinh viên?: ");
                student.setName(Untils.getString(3));

                if (StudentModel.save(student, id)) {
                    System.out.println("------------- Sửa sinh viên thành công! ----------------");
                    System.out.println("- Mã số hiện tại: " + student.getMasv());
                    System.out.println("- Tên hiện tại: " + student.getName());
                    System.out.println("--------------------------------------------------------");
                } else {
                    System.err.println("Có gì đó không đúng, vui lòng thử lại...");
                }

            } else {
                System.err.printf("Không tìm thấy sinh viên có mã số %s", masv);
            }

            continueBoolean = View.continueBoolean();
        }

    }
//    |  3. Tìm và xóa sinh viên theo mã số    |

    /**
     * Hàm này thực hiện nhiệm vụ xóa sinh viên theo mã số Người dùng sẽ nhập
     * vào mã số sinh viên để tìm xóa
     */
    public static void deleteStudent() {
        Student student;
        String masv;
        int id;
        boolean continueBoolean = true;

        while (continueBoolean) {
            System.out.println("Nhập mã số SV muốn xóa: ");
            masv = Untils.getString(3);
            id = StudentModel.find(masv);

            if (id > 0) {
                if (View.confirmBoolean()) {
                    student = StudentModel.destroy(id);
                    if (student != null) {
                        System.out.println("------------- Xóa sinh viên thành công! ----------------");
                        System.out.println("- Mã số SV đã xóa: " + student.getMasv());
                        System.out.println("- Tên SV đã xóa: " + student.getName());
                        System.out.println("--------------------------------------------------------");
                    } else {
                        System.err.println("Có gì đó không đúng! không thể xóa sinh viên...");
                    }
                }
            } else {
                System.err.println("Không tìm thấy sinh viên có mã số: " + masv);
            }

            continueBoolean = View.continueBoolean();
        }

    }
//    |  4. Tìm thông tin sinh viên theo mã số |

    /**
     * Hàm này thực hiện nhiệm vụ tìm kiếm thông tin sinh viên Người dùng sẽ
     * nhập vào mã số sinh viên muốn tìm Nếu tìm thấy chương trình sẽ in ra
     * thông tin.
     */
    public static void searchStudent() {
        System.out.println("Nhập mã số SV muốn tìm: ");

    }
//    |  5. Hiển thị danh sách sinh viên       |

    /**
     * Hàm này thực hiện nhiệm vụ hiển thị toàn bộ danh sách sinh viên lấy trong
     * CSDL
     */
    public static void listStudent() {

    }

}
