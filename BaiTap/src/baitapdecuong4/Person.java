package baitapdecuong4;

public class Person {
	protected String hoTen;
	protected String ngaySinh;
	protected String diaChi;
	protected String gioiTinh;

	public Person() {
	}

	public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.gioiTinh = gioiTinh;
	}

	public void hienThi() {
		System.out.println("" + this.hoTen + "\t" + this.ngaySinh + "\t" + this.diaChi + "\t" + this.gioiTinh + "");
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

}
