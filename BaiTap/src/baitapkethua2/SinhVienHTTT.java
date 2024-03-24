/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapkethua2;

/**
 *
 * @author Vtung
 */
public class SinhVienHTTT extends SinhVien {
    private double hocPhi;

    public SinhVienHTTT() {
    }

    public SinhVienHTTT(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public SinhVienHTTT(double hocPhi, String maSinhVien, String hoTen, String ngaySinh, String gioiTinh, double diemTrungBinh) {
        super(maSinhVien, hoTen, ngaySinh, gioiTinh, diemTrungBinh);
        this.hocPhi = hocPhi;
    }
    public void hienThi(){
        super.hienThi();
        System.out.println(""+this.hocPhi+"");
        
    }
}
