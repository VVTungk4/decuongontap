/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong9;

import java.util.Scanner;

public class Book {
	private String id;
	private String authors, title, category;

	public Book() {
	}

	public Book(String id, String authors, String title, String category) {
		this.id = id;
		this.authors = authors;
		this.title = title;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAuthors() {
		return authors;
	}

	public void setAuthors(String authors) {
		this.authors = authors;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void nhap() {
		System.out.print("Nhập id: ");
		id = new Scanner(System.in).nextLine();
		System.out.print("Nhập tác giả: ");
		authors = new Scanner(System.in).nextLine();
		System.out.print("Nhập tiêu đề: ");
		title = new Scanner(System.in).nextLine();
		System.out.print("Nhập thể loại: ");
		do {
			category = new Scanner(System.in).nextLine();
			if (category.equalsIgnoreCase("Tạp chí") || category.equalsIgnoreCase("KHXH")
					|| category.equalsIgnoreCase("KHTN") || category.equalsIgnoreCase("Luận văn")) {
				System.out.print("Vui lòng nhập lại: ");
			}
		} while (category.equalsIgnoreCase("Tạp chí") || category.equalsIgnoreCase("KHXH")
				|| category.equalsIgnoreCase("KHTN") || category.equalsIgnoreCase("Luận văn"));
	}

	public String hienThi() {
		return id + "\t" + authors + "\t" + title + "\t" + category;
	}
}
