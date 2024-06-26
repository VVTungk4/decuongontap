/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Vtung
 */
/*
 * a.Hãy định nghĩa class Person với các thuộc tính: Họ tên, ngày sinh, địa chỉ,
 * giới tính và các phương thức khởi tạo, hiển thị thông tin. b.Định nghĩa class
 * Student kế thừa từ Person, có thêm các thuộc tính: mã sinh viên, email, điểm
 * tổng kết và các phương thức khởi tạo, hiển thị thông tin. c.Thiết kế các
 * phương thức cho phép nhập các thông tin sinh viên như định nghĩa ở trên.
 * d.Khi người dùng Thêm sinh viên thì chương trình khởi tạo đối tượng sinh viên
 * với các giá trị thuộc tính lấy từ bàn phím người dùng nhập và hiển thị thông
 * tin lên màn hình console. e.Khi người dùng chọn chức năng Lưu dữ liệu thì ghi
 * toàn bộ thông tin vào file sinhvien.dat, sinh viên tự bắt lỗi đầu vào và bổ
 * sung menu chức năng nếu cần thiết.
 */

public class Main {

	public static Student nhap() {
		Student sv = new Student();
		sv.nhap();
		return sv;
	}

	// Thiết kế phương thức ghi dữ liệu ra file
	public static void ghiFile(ArrayList<Student> ds, String path) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File(path)));
			for (Student sv : ds) {
				String line = sv.getHoTen() + "\t" + sv.getNgaySinh() + "\t" + sv.getDiaChi() + "\t" + sv.getGioiTinh()
						+ "\t" + sv.getMaSinhVien() + "\t" + sv.getEmail() + "\t" + sv.getDiemTongKet();
				// Ghi ra filea
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
		ArrayList<Student> ds = new ArrayList<>();

		int n;
		do {
			System.out.println("Mời chọn chức năng");
			System.out.println("nhấn 1-nhập");
			System.out.println("nhấn 2-lưu");
			System.out.println("nhấn các số khác thì thoát chương trình");
			n = new Scanner(System.in).nextInt();
			if (n == 1) {
				ds.add(nhap());
			}

			if (n == 2) {
				ghiFile(ds, "D:\\LAPTRINHJAVA\\sv.txt");
			}

		} while (n == 1 || n == 2);
	}
}
