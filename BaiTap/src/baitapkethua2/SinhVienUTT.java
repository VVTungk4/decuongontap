/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua2;

/**
 *
 * @author Vtung
 */
public class SinhVienUTT extends SinhVien {
    private String donVi;
    private double luong;

    public SinhVienUTT() {
    }

    public SinhVienUTT(String donVi, double luong) {
        this.donVi = donVi;
        this.luong = luong;
    }

    public SinhVienUTT(String donVi, double luong, String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, double diemTrungBinh) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.donVi = donVi;
        this.luong = luong;
    }
     public void hienThi(){
        super.hienThi();
        System.out.println(""+this.donVi+"\t"+this.luong+"");
        
    }
}
