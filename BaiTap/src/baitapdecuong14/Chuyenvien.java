/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong14;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Chuyenvien extends Canbo{
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
        System.out.println(""+this.ns+"\t"+this.bl+"\t"+this.hsl);
    }

    @Override
    public String toString() {
        return super.toString()+ "Chuyenvien{" + "mn=" + mn + ", bl=" + bl + ", hsl=" + hsl + '}';
    }
    
}
