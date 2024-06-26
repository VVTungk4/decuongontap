/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong18;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Canbo extends Person{
    private String pb;
    private Float hsl , lcb , thuong , phat ;

    public Canbo() {
        super();
    }

    public Canbo(String pb, Float hsl, Float lcb, Float thuong, Float phat) {
        super();
        this.pb = pb;
        this.hsl = hsl;
        this.lcb = lcb;
        this.thuong = thuong;
        this.phat = phat;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        boolean isCheck = false;
        do {
            System.out.println("Nhập phòng ban: ");
            pb= sc.nextLine();
            if(pb.equals("đào tạo"))
            {
                isCheck = true;
            }
            else if (pb.equals("tổ chức cán bộ")) {
                isCheck = true;
            }
            else if (pb.equals("văn phòng khoa cntt")) {
                isCheck = true;
            }
            else isCheck = false;
        } while (!isCheck);
        System.out.println("Nhập hệ số lương: ");
        hsl= sc.nextFloat();
        System.out.println("Nhập lương cơ bản: ");
        lcb= sc.nextFloat();
        System.out.println("Nhập thưởng: ");
        thuong=sc.nextFloat();
        System.out.println("Nhập phạt: ");
        phat= sc.nextFloat();
    }
    public float luongthuclinh()
    {
        return lcb * hsl + thuong - phat;
    }
    public void hienthi()
    {
        super.hienthi();
        System.out.println("\t"+this.pb+"\t"+this.hsl+"\t"+this.lcb+"\t"+this.thuong+"\t"+this.phat+"\t"+luongthuclinh());
    }

    @Override
    public String toString() {
        return super.toString()+ "Canbo{" + "pb=" + pb + ", hsl=" + hsl + ", lcb=" + lcb + ", thuong=" + thuong + ", phat=" + phat + '}';
    }
    
}
