/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua3;
 
import java.util.Scanner;

/**
 *
 * @author Vtung
 */
public class Main {

    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        NhanVien[] nhanViens = new NhanVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.print("Họ tên: ");
            String hoTen = scanner.nextLine();
            System.out.print("Ngày sinh: ");
            String ngaySinh = scanner.nextLine();
            System.out.print("Địa chỉ: ");
            String diaChi = scanner.nextLine();
            System.out.print("Giới tính: ");
            String gioiTinh = scanner.nextLine();
            System.out.print("phong ban: ");
            String phongBan = scanner.nextLine();
            System.out.print("Hệ số lương: ");
            double heSoLuong = scanner.nextDouble();
            System.out.print("Thâm niên: ");
            double thamNien = scanner.nextDouble();
            System.out.print("Lương cơ bản: ");
            double luongCoBan = scanner.nextDouble();
            scanner.nextLine(); // consume newline
             
            nhanViens[i] = new NhanVien(phongBan, heSoLuong, thamNien, luongCoBan, hoTen, ngaySinh, diaChi, gioiTinh);
        }
        for (int i = 0; i < n; i++) {
           nhanViens[i].hienThi();
        }
        scanner.close();
        
    }

}
