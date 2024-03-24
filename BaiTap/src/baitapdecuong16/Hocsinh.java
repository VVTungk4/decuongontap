/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong16;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Hocsinh extends Person {
    private String mhs , lop ;
    private float dtk;

    public Hocsinh() {
        super();    
    }

    public Hocsinh(String mhs, String lop, float dtk) {
        super();
        this.mhs = mhs;
        this.lop = lop;
        this.dtk = dtk;
    }
    public void nhap()
    {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã học sinh: ");
        mhs= sc.nextLine();
        System.out.println("Nhập lớp: ");
        lop = sc.nextLine();
        System.out.println("Nhập điểm tổng kết: ");
        dtk=sc.nextFloat();
    }
    public void hienthi()
    {
        super.hienthi();
        System.out.println("\t"+this.mhs+"\t"+this.lop+"\t"+this.dtk);
    }

    @Override
    public String toString() {
        return super.toString()+ "Hocsinh{" + "mhs=" + mhs + ", lop=" + lop + ", dtk=" + dtk + '}';
    }
    
}
