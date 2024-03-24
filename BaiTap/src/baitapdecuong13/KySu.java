/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong13;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KySu extends Canbo{
    protected String ma;
    protected float bacluong, hsluong;

    public KySu() {
    }

    public KySu(String ma, float bacluong, float hsluong, String ht, String dc, String gt) {
        super(ht, dc, gt);
        this.ma = ma;
        this.bacluong = bacluong;
        this.hsluong = hsluong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public float getBacluong() {
        return bacluong;
    }

    public void setBacluong(float bacluong) {
        this.bacluong = bacluong;
    }

    public float getHsluong() {
        return hsluong;
    }

    public void setHsluong(float hsluong) {
        this.hsluong = hsluong;
    }

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
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

    @Override
    public void nhap() {
        super.nhap(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Nhập mã ngạch: ");
        this.ma = new Scanner(System.in).nextLine();
        System.out.println("Nhập bậc lương: ");
        this.bacluong = new Scanner(System.in).nextFloat();
        System.out.println("Nhập hệ số lương: ");
        this.hsluong = new Scanner(System.in).nextFloat();
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.print(this.ma+"\t"+this.bacluong+"\t"+this.hsluong);
    }
}
