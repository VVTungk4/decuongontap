/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
	public static void menu(ArrayList<KySu> ds) {
		System.out.println("\n" + "Chọn chức năng: ");
		System.out.println("1.Nhập thông tin kỹ sư.");
		System.out.println("2.Đọc File.");
		System.out.println("3.Hiển thị.");
		System.out.println("Thoát chương trình.");
		int x = new Scanner(System.in).nextInt();
		switch (x) {
		case 1:
			NhapThongTin(ds);
			menu(ds);
		case 2:
			docFile(ds);
			menu(ds);
		case 3:
			hienThiThongTin(ds);
			menu(ds);
		default:
			return;
		}
	}

	public static void NhapThongTin(ArrayList<KySu> ds) {
		KySu ks = new KySu();
		ks.nhap();
		ds.add(ks);
	}

	public static void hienThiThongTin(ArrayList<KySu> ds) {

		System.out.println("\t-----DANH SÁCH THÔNG TIN KỸ SƯ-----");
		for (KySu ks : ds) {
			ks.hienThi();
		}
	}

	public static void docFile(ArrayList<KySu> ds) {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File("D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong13\\kysu.dat")));
			String line = "";
			while ((line = br.readLine()) != null) {
				String[] a = line.split("\\#");
				KySu ks = new KySu();
				ks.setHt(a[0]);
				ks.setNs(new SimpleDateFormat("dd/MM/yyyy").parse(a[1]));
				ks.setDc(a[2]);
				ks.setGt(a[3]);
				ks.setMa(a[4]);
				ks.setBacluong(Float.parseFloat(a[5]));
				ks.setHsluong(Float.parseFloat(a[6]));
				ds.add(ks);
			}
			br.close();
			System.out.println("Đọc File thành công.");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Đọc thất bại.");
		}
		for (KySu ks : ds) {
			ks.hienThi();
		}
	}

	public static void main(String[] args) {
		ArrayList<KySu> ds = new ArrayList<>();
		menu(ds);
	}
}
