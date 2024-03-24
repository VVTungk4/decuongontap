/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua4;

import java.util.Scanner;

/**
 *
 * @author Vtung
 */
public class HoSo extends Nguoi {

    private String soDienThoai;
    private String maHoSo;

    public HoSo() {
    }

    public HoSo(String soDienThoai, String maHoSo, String hoTen, String gioiTinh) {

        this.soDienThoai = soDienThoai;
        this.maHoSo = maHoSo;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap gioi tinh: ");

        this.gioiTinh = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");

        this.soDienThoai = scanner.nextLine();
        System.out.println("Nhap ma ho so: ");

        this.maHoSo = scanner.nextLine();

    }

    public void hienThi() {
        super.hienThi();
        System.out.println("" + this.soDienThoai + "\n" + this.maHoSo + "\n");

    }

}
