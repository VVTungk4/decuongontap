package baitapdecuong5;

import java.util.Scanner;

public class SinhVienHTTT extends SinhVien {
	private double hocPhi;

	public SinhVienHTTT() {
	}

	public SinhVienHTTT(double hocPhi) {
		super();
		this.hocPhi = hocPhi;
	}

	public double getHocPhi() {
		return hocPhi;
	}

	public void setHocPhi(double hocPhi) {
		this.hocPhi = hocPhi;
	}

	public void hienThi() {
		super.hienThi();
		System.out.println("" + hocPhi + "");
	}

	public void nhap() {
		super.nhap();
		System.out.println("hoc phi: ");
		this.hocPhi = new Scanner(System.in).nextDouble();

	}
}
