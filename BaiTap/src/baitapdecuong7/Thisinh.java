package baitapdecuong7;

import java.util.Scanner;

public abstract class Thisinh {
	protected String ht, ns, dc;

	public Thisinh() {

	}

	public Thisinh(String ht, String ns, String dc) {
		this.ht = ht;
		this.ns = ns;
		this.dc = dc;
	}

	public String getHt() {
		return ht;
	}

	public void setHt(String ht) {
		this.ht = ht;
	}

	public String getNs() {
		return ns;
	}

	public void setNs(String ns) {
		this.ns = ns;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Họ tên: ");
		ht = sc.nextLine();
		System.out.println("Ngày sinh: ");
		ns = sc.nextLine();
		System.out.println("Địa chỉ: ");
		dc = sc.nextLine();
		System.out.println("");
	}

	public void output() {
		System.out.printf("%15s | ", ht);
		System.out.printf("%15s | ", ns);
		System.out.printf("%15s | ", dc);
	}

	public String toString() {
		return ht + " | " + ns + " | " + dc + " | ";
	}

	public abstract float tongdiem();

}
