/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua1;

/**
 *
 * @author Vtung
 */
public class Student extends Person{
    private String maSinhVien;
    private String email;
    private double diemTongKet;

    public Student() {
    }

    public Student(String maSinhVien, String email, double diemTongKet) {
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }

    public Student(String maSinhVien, String email, double diemTongKet, String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maSinhVien = maSinhVien;
        this.email = email;
        this.diemTongKet = diemTongKet;
    }
     public void hienThi(){
        super.hienThi();
        System.out.println(""+this.maSinhVien+"\t"+this.email+"\t"+this.diemTongKet+"");
        
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    
    
    
}
