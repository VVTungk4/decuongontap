/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class maincau15 {
	public static void main(String[] args) {
		ArrayList<Chuyenvien> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("1.Nhập thông tin");
			System.out.println("2. Hiển thị thông tin");
			System.out.println("3. Đọc File");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				Chuyenvien cv = new Chuyenvien();
				cv.nhap();
				ds.add(cv);
			}
			if (n == 3) {
				docfile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong15\\chuyenvien.dat");
			}
		} while (n == 1 || n == 2 || n == 3);
	}

	public static void docfile(ArrayList<Chuyenvien> ds, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			String l = br.readLine();
			while (l != null) {
				String[] a = l.split("\\$");
				Chuyenvien cv = new Chuyenvien();
				cv.setHt(a[0]);
				cv.setNs(a[1]);
				cv.setDc(a[2]);
				cv.setGt(a[3]);
				cv.setMn(a[4]);
				cv.setBl(Float.parseFloat(a[5]));
				cv.setHsl(Float.parseFloat(a[6]));
				ds.add(cv);
			}

			br.close();
			System.out.println("Thành công");

		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}
		for (Chuyenvien d : ds) {
			d.hienthi();
		}
	}
}
