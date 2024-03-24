/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua25;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class PerSon {
    protected String ht,ns,dc,gt;
    //Phương thức khởi tạo
    public PerSon(){
    }
    public PerSon(String ht,String ns,String dc,String gt){
        this.ht=ht;
        this.ns=ns;
        this.dc=dc;
        this.gt=gt;
    }
    public void nhap(){
        System.out.print("Họ tên:");
        this.ht=new Scanner(System.in).nextLine();
        System.out.print("ngày sinh:");
        this.ns=new Scanner(System.in).nextLine();
        System.out.print("Địa chỉ:");
        this.dc=new Scanner(System.in).nextLine();
        System.out.print("Giới tính:");
        this.gt=new Scanner(System.in).nextLine();
    }
    //Phương thức hiển thị thông tin
public void hienThi(){
    System.out.print(""+this.ht+"\t"+this.ns+"\t"+this.dc+"\t"+this.gt);
    
}

    public String getHt() {
        return ht;
    }

    public void setHt(String ht) {
        this.ht = ht;
    }

    public String getNs() {
        return ns;
    }

    public void setNs(String ns) {
        this.ns = ns;
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

}

