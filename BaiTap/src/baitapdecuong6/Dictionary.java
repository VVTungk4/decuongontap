package baitapdecuong6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Dictionary {

	public static void nhaptu(ArrayList<Word> tudien) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số lượng từ muốn thêm: ");
		int n = scanner.nextInt();
		if (tudien.size() < 11) {
			do {
				System.out.print("Vui lòng nhập lại: ");
				n = scanner.nextInt();
			} while (n < 11);
		}
		scanner.nextLine(); // bỏ dòng trống
		for (int i = 0; i < n; i++) {
			System.out.println("Từ thứ " + (i + 1));

			System.out.print("Nhập id: ");
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhập từ: ");
			String en = scanner.nextLine();
			System.out.print("Nhập nghĩa: ");
			String vn = scanner.nextLine();
			Word word = new Word(id, en, vn);

			tudien.add(word);
		}
	}

	public static void timkiem(ArrayList<Word> tudien, String tu) {
		Collections.sort(tudien, new Comparator<Word>() {
			@Override
			public int compare(Word w1, Word w2) {
				return w1.getEn().compareToIgnoreCase(w2.getEn());
			}
		});
		int left = 0;
		int right = tudien.size() - 1;
		boolean found = false;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			String currentWord = tudien.get(mid).getEn();
			if (currentWord.equalsIgnoreCase(tu)) {
				tudien.get(mid).hienThi();
				found = true;
				break;
			} else if (currentWord.compareToIgnoreCase(tu) < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (!found) {
			Word word = new Word();
			System.out.println("Thêm từ này vào từ điển.");
			System.out.print("Nhập id: ");
			Scanner scanner = new Scanner(System.in);
			int id = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Nhập nghĩa: ");
			String vn = scanner.nextLine();
			word.setId(id);
			word.setEn(tu);
			word.setVn(vn);
			tudien.add(word);
		}
	}

	public static void menu(ArrayList<Word> tudien) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("1.Thêm từ mới.");
			System.out.println("2.Tìm kiếm.");
			System.out.println("Ấn bất kì nút khác để thoát chương trình.");
			System.out.print("Lựa chọn: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				nhaptu(tudien);
				break;
			case 2:
				if (tudien.isEmpty()) {
					System.out.println("Từ điển trống!");
				} else {
					System.out.print("Nhập từ bạn muốn tra: ");
					String tu = scanner.nextLine();
					timkiem(tudien, tu);
				}
				break;
			default:
				return;
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Word> tudien = new ArrayList<>();
		menu(tudien);
	}
}
