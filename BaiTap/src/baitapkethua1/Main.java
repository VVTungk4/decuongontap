/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua1;

import java.util.Scanner;

/**
 *
 * @author Vtung
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student[] students = new Student[n];
        
        

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("Mã sinh viên: ");
            String maSinhvien = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Điểm tổng kết: ");
            double diemTongket = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            students[i] = new Student(maSinhvien, email, diemTongket, hoTen, ngaySinh, diaChi, gioiTinh);
        }

        System.out.println("Danh sách sinh viên có điểm tổng kết <= 5:");
        for (Student student : students) {
            if (student.getDiemTongKet() <= 5) {
                student.hienThi();
                
            }
        }

        Student thiSinhCaoNhat = students[0];
        for (Student student : students) {
            if (student.getDiemTongKet()> thiSinhCaoNhat.getDiemTongKet()) {
                thiSinhCaoNhat = student;
            }
        }

        System.out.println("Sinh viên có điểm tổng kết cao nhất:");
        thiSinhCaoNhat.hienThi();

        scanner.close();
        
    }
}
