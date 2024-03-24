package bai6chatgpt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Dictionary {

	public static void nhaptu(ArrayList<Word> tudien) {
		System.out.print("Nhập số lượng từ muốn thêm: ");
		int n = new Scanner(System.in).nextInt();
		if (n < 1) {
			do {
				System.out.print("Vui lòng nhập lại: ");
				n = new Scanner(System.in).nextInt();
			} while (n < 1);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Từ thứ " + (i + 1));
			Word sv = new Word();
			System.out.print("Nhập id: ");
			int x = new Scanner(System.in).nextInt();
			System.out.print("Nhập từ: ");
			String y = new Scanner(System.in).next();
			System.out.print("Nhập nghĩa: ");
			String z = new Scanner(System.in).next();
			sv.setId(x);
			sv.setEn(y);
			sv.setVn(z);
			tudien.add(sv);
		}

	}

	public static void timkiem(ArrayList<Word> tudien, String tu) {
		Collections.sort(tudien, new Comparator<Word>() {
			@Override
			public int compare(Word o1, Word o2) {
				return o1.getEn().compareToIgnoreCase(o2.getEn());
			}
		});
		int l = 0;
		int r = tudien.size() - 1; // Sửa lỗi chỉ số
		boolean c = false;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (tudien.get(mid).getEn().equalsIgnoreCase(tu)) {
				tudien.get(mid).hienThi();
				c = true;
				break; // Tìm thấy từ, thoát khỏi vòng lặp
			}
			if (tudien.get(mid).getEn().compareToIgnoreCase(tu) < 0) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		if (!c) {
			Word sv = new Word();
			System.out.println("Thêm từ này vào từ điển.");
			System.out.print("Nhập id: ");
			int x = new Scanner(System.in).nextInt();
			System.out.print("Nhập nghĩa: ");
			String z = new Scanner(System.in).next();
			sv.setId(x);
			sv.setEn(tu);
			sv.setVn(z);
			tudien.add(sv);
		}
	}

	public static void menu(ArrayList<Word> tudien) {
		System.out.println("1.Thêm từ mới.");
		System.out.println("2.Tìm kiếm.");
		System.out.println("3.Thoát chương trình.");
		System.out.print("Lựa chọn: ");
		int x = new Scanner(System.in).nextInt();
		switch (x) {
		case 1:
			nhaptu(tudien);
			menu(tudien);
			break; // Thêm break để kết thúc case
		case 2:
			if (tudien.isEmpty()) {
				System.out.println("Từ điển trống!");
				menu(tudien);
			}
			System.out.print("Nhập từ bạn muốn tra: ");
			String tu = new Scanner(System.in).next();
			timkiem(tudien, tu);
			menu(tudien);
			break; // Thêm break để kết thúc case
		case 3:
			System.out.println("Thoát chương trình.");
			break; // Thêm lựa chọn thoát
		default:
			System.out.println("Lựa chọn không hợp lệ.");
			menu(tudien);
		}
	}

	public static void main(String[] args) {
		ArrayList<Word> tudien = new ArrayList<>();
		menu(tudien);
	}
}
