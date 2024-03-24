/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong12;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class maincau12 {
	public static void main(String[] args) {
		ArrayList<Kysu> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Chọn chức năng bạn muốn thực hiện: ");
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Hiển thị thông tin");
			System.out.println("3. Lưu dữ liệu");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				Kysu ks = new Kysu();
				ks.nhap();
				ds.add(ks);
			}
			if (n == 2) {
				for (Kysu ks : ds) {
					ks.hienthi();
				}

			}
			if (n == 3) {
				ghifile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong12\\kisu.dat");
			}
		} while (n == 1 || n == 2 || n == 3);
	}

	public static void ghifile(ArrayList<Kysu> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (Kysu ks : ds) {
				bw.write(ks.toString());
				bw.newLine();
			}
			bw.close();
			System.out.println("Thành công");
		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}

	}

}
