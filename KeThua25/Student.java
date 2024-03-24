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
public class Student extends PerSon{
    private String ma,email;
    private float dtk;
    //Phương thức khởi tạo

    public Student() {
    }

    public Student(String ma, String email, float dtk, String ht, String ns, String dc, String gt) {
        super(ht, ns, dc, gt);
        this.ma = ma;
        this.email = email;
        this.dtk = dtk;
        
    }
    //Phương thức nhâph thông tin cho Student
    public void nhap(){
        super.nhap();
        System.out.print("Mã sv:");
        this.ma=new Scanner(System.in).nextLine();
        System.out.print("Email:");
        this.email=new Scanner(System.in).nextLine();
        System.out.print("Điểm :");
        this.dtk=new Scanner(System.in).nextFloat();
    }
    //Phương thức hiển thị thông tin
    public void hienThi(){
        super.hienThi();
        System.out.println("\t"+this.ma+"\t"+this.email+"\t"+this.dtk);
        
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getDtk() {
        return dtk;
    }

    public void setDtk(float dtk) {
        this.dtk = dtk;
    }
    
}
