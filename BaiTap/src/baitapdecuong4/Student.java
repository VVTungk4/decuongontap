package baitapdecuong4;

public class Student extends Person {
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

	public Student(String maSinhVien, String email, double diemTongKet, String hoTen, String ngaySinh, String diaChi,
			String gioiTinh) {
		super(hoTen, ngaySinh, diaChi, gioiTinh);
		this.maSinhVien = maSinhVien;
		this.email = email;
		this.diemTongKet = diemTongKet;
	}

	public void hienThi() {
		super.hienThi();
		System.out.println("" + this.maSinhVien + "\t" + this.email + "\t" + this.diemTongKet + "");

	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDiemTongKet(double diemTongKet) {
		this.diemTongKet = diemTongKet;
	}

}
