/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class NhapDanhSach {
    public static void main(String[] args) {
        ArrayList<Student> ds = new ArrayList<>();
        //đọc từ file
        try {
            BufferedReader br=new BufferedReader(new FileReader(new File("E:\\JAVA\\JAVA CO BAN\\BAI TAP\\Student.dat")));
            String line="";
            while((line=br.readLine())!=null){
            String[] a=line.split("\\$");
            Student sv = new Student();
            sv.setHt(a[0]);
            sv.setNs(a[1]);
            sv.setDc(a[2]);
            sv.setGt(a[3]);
            sv.setMa(a[4]);
            sv.setEmail(a[5]);
            sv.setDtk(Float.parseFloat(a[6]));
            ds.add(sv);
            }
            br.close();
            System.out.println("Đọc thành công");
        } catch (Exception e) {
            System.out.println("Thất bại");
            e.printStackTrace();
        }
        //In danh sách đã đọc được lên cônsolo
        for (Student d : ds) {
            d.hienThi();
        }
    }
    //Thiết kế phương thức nhập
  /*  public static Student nhap(){
        Student sv = new Student();
        sv.nhap();
    return sv;
    }
    //Thiết kế phương thức ghi dữ liệu ra file
    public static void ghiFile(ArrayList<Student> ds,String path){
        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(new File(path)));
            for (Student sv : ds) {
                String line=sv.getHt()+"\t"+sv.getNs()+"\t"+sv.getDc()
                        +"\t"+sv.getGt()+"\t"+sv.getMa()+"\t"
                        +sv.getEmail()+"\t"+sv.getDtk();
                //Ghi ra file
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            System.out.println("Ghi thành công");
        } catch (Exception e) {
            System.out.println("Thất bại");
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        ArrayList<Student> ds = new ArrayList<>();
        
        int n;
        do {   
        System.out.println("Mời chọn chức năng"); 
        System.out.println("nhấn 1-nhập");
        System.out.println("nhấn 2-lưu");
        System.out.println("nhấn các số khác thì thoát chưogn trình");
            n=new Scanner(System.in).nextInt();
            if(n==1)
                ds.add(nhap());
             if(n==2){
                 ghiFile(ds, "E:\\JAVA\\JAVA CO BAN\\BAI TAP\\sv.txt");
             }
                 
        } while (n==1||n==2);
    }*/
}
