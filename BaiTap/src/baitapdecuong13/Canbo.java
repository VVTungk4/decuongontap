/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Canbo {
    protected String ht, dc, gt;
    protected Date ns = new Date();

    public Canbo() {
    }

    public Canbo(String ht, String dc, String gt) {
        this.ht = ht;
        this.dc = dc;
        this.gt = gt;
    }
    public void nhap(){
        System.out.println("Nhập họ tên: ");
        this.ht = new Scanner(System.in).nextLine();
        System.out.print("Nhập ngày sinh: ");
        int i = new Scanner(System.in).nextInt();
        System.out.print("Nhập tháng sinh: ");
        int j = new Scanner(System.in).nextInt();
        System.out.print("Nhập năm sinh: ");
        int k = new Scanner(System.in).nextInt();
        this.ns.setDate(i);
        this.ns.setMonth(j-1);
        this.ns.setYear(k-1900);
        System.out.println("Nhập địa chỉ: ");
        this.dc = new Scanner(System.in).nextLine();
        System.out.println("Nhập giới tính: ");
        this.gt = new Scanner(System.in).nextLine();
    }
    public void hienThi(){
        System.out.print(""+this.ht+"\t"+new SimpleDateFormat("dd/MM/yyyy").format(ns)+"\t"+this.dc+"\t"+this.gt);
    }
}