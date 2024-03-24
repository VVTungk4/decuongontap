/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class maincau16 {
	public static void main(String[] args) {
		ArrayList<Hocsinh> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Chọn chức năng ");
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Hiển thị thông tin");
			System.out.println("3. Lưu thông tin");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				Hocsinh hs = new Hocsinh();
				hs.nhap();
				ds.add(hs);
			}
			if (n == 2) {
				for (Hocsinh d : ds) {
					d.hienthi();

				}
			}
			if (n == 3) {
				ghifile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong16\\hocsinh.dat");
			}
		} while (n == 1 || n == 2 || n == 3);
	}

	public static void ghifile(ArrayList<Hocsinh> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (Hocsinh hs : ds) {
				bw.write(hs.toString());
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
