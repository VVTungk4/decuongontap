package baitapdecuong7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	// ghi file
	public static void File(ArrayList<Thisinh> ds) {
		try {
			BufferedWriter bw = new BufferedWriter(
					new FileWriter(new File("D:\\BaiTapJava\\BaiTap\\src\\baitapdecuong7\\Danhsach.txt")));
			for (Thisinh x : ds) {
				bw.write(x.toString());

			}
			bw.close();
			System.out.println("Thành công....");

		} catch (Exception e) {
			System.out.println("Thất bại....");
			e.printStackTrace();

		}

	}

	public static void main(String[] args) {
		ArrayList<Thisinh> ds = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Chương trình chính: ");
			System.out.println("1.Nhập vào sinh vien khối A");
			System.out.println("2.Nhập vào sinh vien khối C");
			System.out.println("3.Danh sách thí sinh trúng tuyển(tổng điểm>20)");
			System.out.println("4.Ghi danh sách ra file");
			System.out.println("5.Thoát chương trình");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				ThisinhkhoiA ts1 = new ThisinhkhoiA();
				ts1.input();
				ds.add(ts1);
				break;
			case 2:
				ThisinhkhoiC ts2 = new ThisinhkhoiC();
				ts2.input();
				ds.add(ts2);
				break;
			case 3:
				for (Thisinh x : ds) {
					if (x.tongdiem() > 20) {
						x.output();
					}
				}
				break;
			case 4:
				if (ds.isEmpty()) {
					System.out.println("Danh sách rỗng");
				} else {
					File(ds);
					System.out.println("Thành công");
				}
				break;
			case 5:
				return;
			default:
				System.out.println("Lựa chọn không hợp lệ: ");
			}
		}
	}
}
