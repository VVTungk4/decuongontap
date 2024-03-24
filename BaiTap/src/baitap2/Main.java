package baitap2;

import java.util.Scanner;

// Giao diện Shape
interface Shape {
	void input();

	void display();

	double area();

	double perimeter();
}

// Lớp HinhChuNhat kế thừa giao diện Shape
class HinhChuNhat implements Shape {
	private String color;
	private double length;
	private double width;

	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mau ve:");
		color = scanner.nextLine();
		System.out.println("Nhap chieu dai:");
		length = scanner.nextDouble();
		System.out.println("Nhap chieu rong:");
		width = scanner.nextDouble();
	}

	@Override
	public void display() {
		System.out.println("Mau ve: " + color);
		System.out.println("Chieu dai: " + length);
		System.out.println("Chieu rong: " + width);
		System.out.println("Dien tich: " + area());
		System.out.println("Chu vi: " + perimeter());
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return 2 * (length + width);
	}
}

// Lớp HinhTron kế thừa giao diện Shape
class HinhTron implements Shape {
	private String color;
	private double radius;

	@Override
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap mau ve:");
		color = scanner.nextLine();
		System.out.println("Nhap ban kinh:");
		radius = scanner.nextDouble();
	}

	@Override
	public void display() {
		System.out.println("Mau ve: " + color);
		System.out.println("Ban kinh: " + radius);
		System.out.println("Dien tich: " + area());
		System.out.println("Chu vi: " + perimeter());
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
}

public class Main {
	public static void main(String[] args) {
		// Test HinhChuNhat
		HinhChuNhat hinhChuNhat = new HinhChuNhat();
		System.out.println("Nhap thong tin cho hinh chu nhat:");
		hinhChuNhat.input();
		System.out.println("Thong tin hinh chu nhat:");
		hinhChuNhat.display();

		// Test HinhTron
		HinhTron hinhTron = new HinhTron();
		System.out.println("Nhap thong tin cho hinh tron:");
		hinhTron.input();
		System.out.println("Thong tin hinh tron:");
		hinhTron.display();
	}
}