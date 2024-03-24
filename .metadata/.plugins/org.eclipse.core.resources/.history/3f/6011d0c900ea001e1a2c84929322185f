/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai11 {

	public static void nhap(PS ps) {
		ps.Nhap();
	}

	public static void main(String[] args) {
		ArrayList<PS> pss = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Mời bạn chọn chức năng:");
			System.out.println("1.Tinh tong");
			System.out.println("2.Lưu");
			System.out.println("Các số khác - Out");
			System.out.print("Lựa chọn của bạn:");
			n = sc.nextInt();
			if (n == 1) {
				PS s = new PS();
				System.out.println("Nhap phan so thu 1");
				nhap(s);
				pss.add(s);
				PS s1 = new PS();
				System.out.println("Nhap phan so thu 2");
				nhap(s1);
				pss.add(s1);
				PS kq = new PS();
				kq = s.cong(s1);
				pss.add(kq);
				System.out.println("Kết quả: " + kq.toString());
			}
			if (n == 2) {
				ghifile(pss, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong11\\phanso.txt");
			}

		} while (n == 1 || n == 2);
	}

	public static void ghifile(ArrayList<PS> pss, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			for (PS ps : pss) {
				bw.write(ps.toString());
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
