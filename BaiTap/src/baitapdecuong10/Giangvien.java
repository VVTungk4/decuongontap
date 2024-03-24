/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong10;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Giangvien {
	private String mgv, dc, gt, khoa;

	public Giangvien() {
	}

	public Giangvien(String mgv, String dc, String gt, String khoa) {
		this.mgv = mgv;
		this.dc = dc;
		this.gt = gt;
		this.khoa = khoa;
	}

	public void nhap() {
		boolean check = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã giảng viên: ");
		mgv = sc.nextLine();
		System.out.println("Nhập địa chỉ: ");
		dc = sc.nextLine();
		System.out.println("Nhập giới tính: ");
		gt = sc.nextLine();

		do {

			System.out.println("Nhập khoa: ");
			khoa = sc.nextLine();
			switch (khoa) {
			case "đtvt":
				check = true;
				break;
			case "cntt":
				check = true;
				break;
			case "httt":
				check = true;
				break;
			case "cnm":
				check = true;
				break;
			case "cnpm":
				check = true;
				break;
			default:
				check = false;
				break;

			}

		} while (!check);
	}

	@Override
	public String toString() {
		return "Giangvien{" + "mgv=" + mgv + ", dc=" + dc + ", gt=" + gt + ", khoa=" + khoa + '}';
	}
}
