package baitapdecuong5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static SinhVienHTTT nhap() {
		SinhVienHTTT sv = new SinhVienHTTT();
		sv.nhap();
		return sv;
	}

	public static SinhVienUTT nhap1() {
		SinhVienUTT sv = new SinhVienUTT();
		sv.nhap();
		return sv;
	}

	public static void ghiFileHTTT(ArrayList<SinhVienHTTT> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (SinhVienHTTT nv : ds) {
				String line = nv.getMaSinhVien() + "\t" + nv.getHoTen() + "\t" + nv.getNgaySinh() + "\t"
						+ nv.getGioiTinh() + "\t" + nv.getDiemTrungBinh() + "\t" + nv.getHocPhi();
				// Ghi ra file
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			System.out.println("Ghi thành công");
		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}

	}

	public static void ghiFileUTT(ArrayList<SinhVienUTT> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (SinhVienUTT nv : ds) {
				String line = nv.getMaSinhVien() + "\t" + nv.getHoTen() + "\t" + nv.getNgaySinh() + "\t"
						+ nv.getGioiTinh() + "\t" + nv.getDiemTrungBinh() + "\t" + nv.getDonVi() + "\t" + nv.getLuong();
				// Ghi ra file
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			System.out.println("Ghi thành công");
		} catch (Exception e) {
			System.out.println("Thất bại");
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ArrayList<SinhVienHTTT> ds = new ArrayList<>();
		ArrayList<SinhVienUTT> ds1 = new ArrayList<>();
		int a = 0;
		int b = 0;
		int n;
		do {
			System.out.println("Mời chọn chức năng");
			System.out.println("nhấn 1-nhập sinh vien HTTT");
			System.out.println("nhấn 2-nhập sinh vien UTT");
			System.out.println("nhấn 3-lưu");
			System.out.println("nhấn các số khác thì thoát chương trình");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				ds.add(nhap());
				a = 1;
			}
			if (n == 2) {
				ds1.add(nhap1());
				b = 1;
			}
			if (n == 3) {
				if (a == 1)
					ghiFileHTTT(ds, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong5\\svhttt.dat");
				if (b == 1)
					ghiFileUTT(ds1, "D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong5\\svutt.dat");
			}

		} while (n == 1 || n == 2 || n == 3);
	}
}
