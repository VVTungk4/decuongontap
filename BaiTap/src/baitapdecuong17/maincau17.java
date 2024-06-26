/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class maincau17 {
	public static void main(String[] args) {
		ArrayList<Hocsinh> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("1. Nhập thông tin");
			System.out.println("2. Hiển thị thông tin");
			System.out.println("3. Đọc file");
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
				docfile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong17\\hocsinh.dat");
			}
		} while (n == 1 || n == 2 || n == 3);
	}

	public static void docfile(ArrayList<Hocsinh> ds, String path) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(path)));
			String l = br.readLine();
			while (l != null) {

				String[] a = l.split("\\&");
				Hocsinh hs = new Hocsinh();
				hs.setHt(a[0]);
				hs.setNs(a[1]);
				hs.setDc(a[2]);
				hs.setGt(a[3]);
				hs.setMhs(a[4]);
				hs.setLop(a[5]);
				hs.setDtk(Float.parseFloat(a[6]));
				ds.add(hs);
				l = br.readLine();
			}
			br.close();
			System.out.println("Thành công");
		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}
		for (Hocsinh d : ds) {
			d.hienthi();
		}
	}
}
