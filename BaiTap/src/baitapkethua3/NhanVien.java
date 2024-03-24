/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua3;

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

    public NhanVien(String phongBan, double heSoLuong, double thamNien, double luongCoBan, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.heSoLuong = heSoLuong;
        this.thamNien = thamNien;
        this.luongCoBan = luongCoBan;
    }
    
    public double luongThucLinh(){
        return luongCoBan*(1 + thamNien/100);
    }
     public void hienThi(){
        super.hienThi();
        System.out.println(""+this.phongBan+"\n"+this.heSoLuong+"\n"+this.thamNien+"\n"+this.luongCoBan+"");
        
    }
    

}
