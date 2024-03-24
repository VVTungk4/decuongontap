/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong15;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chuyenvien extends Canbo {
     private String mn ;
    private float bl , hsl;

    public Chuyenvien() {
        super();
    }

    public Chuyenvien(String mn, float bl, float hsl) {
        super();
        this.mn = mn;
        this.bl = bl;
        this.hsl = hsl;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã ngạch: ");
        mn=sc.nextLine()   ;
        System.out.println("Nhập bậc lương: ");
        bl= sc.nextFloat();
        System.out.println("Nhập hệ số lương: ");
        hsl= sc.nextFloat();
    }
    public void hienthi()
    {
        super.hienthi();
        System.out.println("\t"+this.ns+"\t"+this.bl+"\t"+this.hsl);
    }

    @Override
    public String toString() {
        return super.toString()+ "Chuyenvien{" + "mn=" + mn + ", bl=" + bl + ", hsl=" + hsl + '}';
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public void setBl(float bl) {
        this.bl = bl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public void setNs(String ns) {
        this.ns = ns;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getMn() {
        return mn;
    }

    public float getBl() {
        return bl;
    }

    public float getHsl() {
        return hsl;
    }

    public String getHt() {
        return ht;
    }

    public String getNs() {
        return ns;
    }

    public String getDc() {
        return dc;
    }

    public String getGt() {
        return gt;
    }
}
