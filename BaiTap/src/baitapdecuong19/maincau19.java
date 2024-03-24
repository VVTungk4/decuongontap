/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong19;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class maincau19 {
	public static void main(String[] args) {
		ArrayList<Canbo> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Hiển thị thông tin");
			System.out.println("3. Đọc file");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				Canbo cb = new Canbo();
				cb.nhap();
				ds.add(cb);
			}
			if (n == 2) {
				for (Canbo d : ds) {
					d.hienthi();

				}
			}
			if (n == 3) {
				docfile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong19\\canbo.dat");
			}
		} while (n == 1 || n == 2 || n == 3);
	}

	public static void docfile(ArrayList<Canbo> ds, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			String l = br.readLine();
			while (l != null) {
				String[] a = l.split("\\*");
				Canbo cb = new Canbo();
				cb.setHt(a[0]);
				cb.setNs(a[1]);
				cb.setDc(a[2]);
				cb.setGt(a[3]);
				cb.setPb(a[4]);
				cb.setHsl(Float.parseFloat(a[5]));
				cb.setLcb(Float.parseFloat(a[6]));
				cb.setThuong(Float.parseFloat(a[7]));
				cb.setPhat(Float.parseFloat(a[8]));
				ds.add(cb);
				l = br.readLine();
			}
			br.close();
			System.out.println("Thành công");
		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}
		for (Canbo d : ds) {
			d.hienthi();
		}
	}
}
