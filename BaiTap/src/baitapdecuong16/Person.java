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
public class Person {
     public String ht ;
    public String ns ;
    public String dc ;
    public String gt ;

    public Person() {
    }

    public Person(String ht, String ns, String dc, String gt) {
        this.ht = ht;
        this.ns = ns;
        this.dc = dc;
        this.gt = gt;
    }
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        ht = sc.nextLine();
        System.out.println("Nhập ngày sinh: ");
        ns = sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        dc = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        gt = sc.nextLine();
    }
    public void hienthi()
    {
        System.out.print(""+this.ht +"\t"+this.ns +"\t"+this.dc +"\t"+this.gt);
    }

    @Override
    public String toString() {
        return "Person{" + "ht=" + ht + ", ns=" + ns + ", dc=" + dc + ", gt=" + gt + '}';
    }
}
