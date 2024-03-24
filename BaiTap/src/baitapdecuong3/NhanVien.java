package baitapdecuong3;

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

	public NhanVien(String phongBan, double heSoLuong, double thamNien, double luongCoBan, String hoTen,
			String ngaySinh, String diaChi, String gioiTinh) {
		super(hoTen, ngaySinh, diaChi, gioiTinh);
		this.phongBan = phongBan;
		this.heSoLuong = heSoLuong;
		this.thamNien = thamNien;
		this.luongCoBan = luongCoBan;
	}

	double luongThucLinh() {
		return luongCoBan * heSoLuong * (1 + thamNien / 100);
	}

	public void hienThi() {
		super.hienThi();
		System.out.println(
				"" + this.phongBan + "\t" + this.heSoLuong + "\t" + this.thamNien + "\t" + this.luongCoBan + "");

	}

	public String getPhongBan() {
		return phongBan;
	}

	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getThamNien() {
		return thamNien;
	}

	public void setThamNien(double thamNien) {
		this.thamNien = thamNien;
	}

	public double getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

}
