/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong2;

import java.util.Scanner;

/**
 *
 * @author Vtung
 */
public class NhanVien extends Person {
    private String phongBan;
    private double heSoLuong;
    private double thamNien;
    private double luongCoBan;

    public NhanVien() {
    }

    public NhanVien(String phongBan, double heSoLuong, double thamNien, double luongCoBan) {
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }

    public NhanVien(String phongBan, double heSoLuong, double thamNien, double luongCoBan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }
    double luongThucLinh(){
        return luongCoBan*heSoLuong*(1+thamNien/100);
    }
    public void hienThi(){
        super.hienThi();
        System.out.println("" + this.phongBan + "\t" + this.heSoLuong + "\t" + this.thamNien + "\t" + this.luongCoBan + "");

    }
    public void nhap(){
        super.nhap();
        System.out.print("Phong ban:");
        this.phongBan=new Scanner(System.in).nextLine();
        System.out.print("He so luong:");
        this.heSoLuong=new Scanner(System.in).nextDouble();
        System.out.print("Tham nien:");
        this.thamNien=new Scanner(System.in).nextDouble();
        System.out.print("Luong co ban:");
        this.luongCoBan=new Scanner(System.in).nextDouble();
        
    }

    public String getPhongBan() {
        return phongBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getThamNien() {
        return thamNien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
    
    
    
}
