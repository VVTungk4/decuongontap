/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong20;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public abstract class Sinhvien {
    protected String ma, ht, gt;
    protected Date ns = new Date();
    protected Float dtb;

    public Sinhvien() {
    }

    public Sinhvien(String ma, String ht, String gt, Float dtb) {
        this.ma = ma;
        this.ht = ht;
        this.gt = gt;
        this.dtb = dtb;
    }

    
    public void nhap(){
        System.out.println("Nhập mã sinh viên: ");
        this.ma  = new Scanner(System.in).nextLine();
        System.out.println("Nhập họ tên: ");
        this.ht = new Scanner(System.in).nextLine();
        System.out.print("Nhập ngày sinh:");
        int i = new Scanner(System.in).nextInt();
        System.out.print("Nhập tháng sinh:");
        int j = new Scanner(System.in).nextInt();
        System.out.println("Nhập năm sinh: ");
        int k = new Scanner(System.in).nextInt();
        this.ns.setDate(i);
        this.ns.setMonth(j-1);
        this.ns.setYear(k-1900);
        System.out.println("Nhập giới tính: ");
        this.gt = new Scanner(System.in).nextLine();
        System.out.println("Nhập điểm TB: ");
        this.dtb = new Scanner(System.in).nextFloat();
    }
    public void hienThi(){
        System.out.println(""+this.ma+"\t"+this.ht+"\t"+new SimpleDateFormat("dd/MM/yyyy").format(ns)+"\t"+this.gt+"\t"+this.dtb);  
    }
    abstract public int ktra();
    abstract public String toHienThi();
}