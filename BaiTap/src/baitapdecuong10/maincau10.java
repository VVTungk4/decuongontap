/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class maincau10 {
	public static void main(String[] args) {
		ArrayList<Giangvien> ds = new ArrayList<>();
		int n;
		do {
			System.out.println("Mời bạn chọn chức năng");
			System.out.println("1. Thêm");
			System.out.println("2.Xóa");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				Giangvien gv = new Giangvien();
				gv.nhap();
				ds.add(gv);
				ghifile(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong10\\giangvien.dat");
			}
			if (n == 2) {
				try {
					File copied = new File("D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong10\\giangvien.dat");
					File backup = new File("D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong10\\chua.dat");
					Files.copy(copied.toPath(), backup.toPath(), StandardCopyOption.REPLACE_EXISTING);
					copied.delete();
					System.out.println("Xóa file thành công");
				} catch (IOException e) {
					System.out.println("Xóa file thất bại");
				}
			}
		} while (n == 1 || n == 2);
	}

	public static void ghifile(ArrayList<Giangvien> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (Giangvien d : ds) {
				bw.write(d.toString());
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
