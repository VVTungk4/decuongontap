/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong20;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
	public static ArrayList<Sinhvien> ds = new ArrayList<>();

	public static void menu(ArrayList<Sinhvien> ds) {
		System.out.println("Mời bạn chọn chức năng: ");
		System.out.println("1.Nhập sinh viên");
		System.out.println("2.Lưu File");
		System.out.println("Nhập 1 ký tự bất kỳ để thoát chương trình.");
		int x = new Scanner(System.in).nextInt();
		switch (x) {
		case 1:
			NhapSinhVien(ds);
			menu(ds);
		case 2:
			luuFile(ds);
			menu(ds);
		default:
			return;
		}
	}

	public static void NhapSinhVien(ArrayList<Sinhvien> ds) {

		String s = new Scanner(System.in).nextLine();
		if (s.equalsIgnoreCase("CNM")) {
			SinhvienCNM svcnm = new SinhvienCNM();
			svcnm.nhap();
			ds.add(svcnm);
			svcnm.hienThi();
		} else if (s.equalsIgnoreCase("UTT")) {
			SinhvienUTT svutt = new SinhvienUTT();
			svutt.nhap();
			ds.add(svutt);
			svutt.hienThi();
		} else {
			System.out.println("Không hợp lệ.");
		}
	}

	public static void luuFile(ArrayList<Sinhvien> ds) {
		ArrayList<SinhvienCNM> svcnm = new ArrayList<>();
		ArrayList<SinhvienUTT> svutt = new ArrayList<>();
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(new File("D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong20\\sinhviencnm.dat")));
			BufferedWriter bw1 = new BufferedWriter(
					new FileWriter(new File("D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong20\\sinhvienutt.dat")));

			for (Sinhvien sv : ds) {
				if (sv.ktra() == 1) {
					bw.write(sv.toHienThi());
					bw.newLine();
				} else {
					bw1.write(sv.toHienThi());
					bw1.newLine();
				}
			}
			bw.close();
			bw1.close();
			System.out.println("Lưu thành công.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		menu(ds);
	}
}
