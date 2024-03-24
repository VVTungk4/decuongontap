/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class maincau14 {
	public static void main(String[] args) {
		ArrayList<Chuyenvien> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("1.Nhập thông tin");
			System.out.println("2. hiển thị thông tin");
			System.out.println("3. Lưu thông tin");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				Chuyenvien cv = new Chuyenvien();
				cv.nhap();
				ds.add(cv);
			}
			if (n == 2) {
				for (Chuyenvien cv : ds) {
					cv.hienthi();
				}
			}
			if (n == 3) {
				ghifile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong14\\chuyenvien.dat");
			}
		} while (n == 1 || n == 2 || n == 3);
	}

	public static void ghifile(ArrayList<Chuyenvien> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (Chuyenvien cv : ds) {
				bw.write(cv.toString());
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
