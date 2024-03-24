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
public class SinhvienUTT extends Sinhvien{
    protected String donvi;
    protected Float luong;

    public SinhvienUTT() {
    }

    public SinhvienUTT(String donvi, Float luong, String ma, String ht, String gt, Float dtb) {
        super(ma, ht, gt, dtb);
        this.donvi = donvi;
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public Date getNs() {
        return ns;
    }

    public void setNs(Date ns) {
        this.ns = ns;
    }

    public Float getDtb() {
        return dtb;
    }

    public void setDtb(Float dtb) {
        this.dtb = dtb;
    }
    
    @Override
    public void nhap() {
        super.nhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhập đơn vị: ");
        this.donvi = new Scanner(System.in).nextLine();
        System.out.println("Nhập lương: ");
        this.luong = new Scanner(System.in).nextFloat();
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print(this.donvi+"\t"+this.luong);
    }

    @Override
    public int ktra() {
        return 2;
    }

    @Override
    public String toHienThi() {
        return this.ma+"\t"+this.ht+"\t"+new SimpleDateFormat("dd/MM/yyyy").format(ns)+"\t"+this.gt+"\t"+this.dtb + "\t" + this.donvi+"\t"+this.luong;
    }
}
