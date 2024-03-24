package baitapdecuong5;

import java.util.Scanner;

public class SinhVienUTT extends SinhVien {
	private String donVi;
	private double luong;

	public SinhVienUTT() {
	}

	public SinhVienUTT(String donVi, double luong) {
		super();
		this.donVi = donVi;
		this.luong = luong;
	}

	public void hienThi() {
		super.hienThi();
		System.out.println("" + donVi + "\t" + luong + "\t");
	}

	public void nhap() {
		super.nhap();
		System.out.println("don vi: ");
		this.donVi = new Scanner(System.in).nextLine();
		System.out.println("luong: ");
		this.luong = new Scanner(System.in).nextDouble();

	}

	public String getDonVi() {
		return donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

}
