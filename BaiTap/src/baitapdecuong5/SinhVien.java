package baitapdecuong5;

import java.util.Scanner;

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

	public void hienThi() {
		System.out.println("" + this.maSinhVien + "\t" + this.hoTen + "\t" + this.ngaySinh + "\t" + this.ngaySinh + "\t"
				+ gioiTinh + "\t" + diemTrungBinh + "\t");
	}

	public void nhap() {
		System.out.println("ma sinh vien: ");
		this.maSinhVien = new Scanner(System.in).nextLine();
		System.out.println("ho ten: ");
		this.hoTen = new Scanner(System.in).nextLine();
		System.out.println("ngay sinh: ");
		this.ngaySinh = new Scanner(System.in).nextLine();
		System.out.println("gioi tinh: ");
		this.gioiTinh = new Scanner(System.in).nextLine();
		System.out.println("diem trung binh: ");
		this.diemTrungBinh = new Scanner(System.in).nextDouble();
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

}
