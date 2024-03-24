/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapdecuong11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class PS {

    public int tu, mau;

    public PS() {
    }

    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public PS cong(PS ps) {
        PS kq = new PS();
        kq.tu = tu * ps.mau + ps.tu * mau;
        kq.mau = mau * ps.mau;
        return kq;
    }

    public PS tru(PS ps) {
        PS kq = new PS();
        kq.tu = tu * ps.mau - ps.tu * mau;
        kq.mau = mau * ps.mau;
        return kq;
    }

    public PS nhan(PS ps) {
        PS kq = new PS();
        kq.tu = tu * ps.tu;
        kq.mau = mau * ps.mau;
        return kq;
    }

    public PS chia(PS ps) {
        PS kq = new PS();
        try {
            kq.tu = tu * ps.mau + ps.tu * mau;
            kq.mau = mau * ps.mau;
        } catch (Exception e) {
            System.out.println("Lỗi chia 2 phân số");
        }

        return kq;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap tu");
            tu = sc.nextInt();
            do{
                System.out.println("Nhap mau");
                mau = sc.nextInt();
            }while(mau == 0);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "PS{" + "tu=" + tu + ", mau=" + mau + '}';
    }
    
}
