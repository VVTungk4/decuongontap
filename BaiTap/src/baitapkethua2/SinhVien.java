/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua2;

/**
 *
 * @author Vtung
 */
public class SinhVien {

    protected String maSinhVien;
    protected String hoTen;
    protected String ngaySinh;
    protected String gioiTinh;
    protected double diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diemTrungBinh = diemTrungBinh;
    }
     public void hienThi(){
         System.out.println(""+this.maSinhVien+"\t"+this.hoTen+"\t"+this.ngaySinh+"\t"+this.gioiTinh+"\t"+this.diemTrungBinh+"");
    }
    
}
