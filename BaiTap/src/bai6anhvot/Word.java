/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6anhvot;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Word {
	protected String id, en, vn;

	public Word() {
	}

	public Word(String id, String en, String vn) {
		this.id = id;
		this.en = en;
		this.vn = vn;
	}

	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap id:");
		id = sc.nextLine();
		System.out.print("Nhap tu tieng anh:");
		en = sc.nextLine();
		System.out.print("Nhap nghia tieng viet:");
		vn = sc.nextLine();

	}

	public void xuat() {
		System.out.println(String.format("%-20s%-20s%-20s", id, en, vn));
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public void setVn(String vn) {
		this.vn = vn;
	}

	public String getEn() {
		return en;
	}

	public String getVn() {
		return vn;
	}
}
