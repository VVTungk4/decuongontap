/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong2;

import java.util.Scanner;

/**
 *
 * @author Vtung
 */
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

	public void nhap() {
		System.out.print("Họ tên:");
		this.hoTen = new Scanner(System.in).nextLine();
		System.out.print("Ngày sinh:");
		this.ngaySinh = new Scanner(System.in).nextLine();
		System.out.print("Địa chỉ:");
		this.diaChi = new Scanner(System.in).nextLine();
		System.out.print("Giới tính:");
		this.gioiTinh = new Scanner(System.in).nextLine();
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

}
