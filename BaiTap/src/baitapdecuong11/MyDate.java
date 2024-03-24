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
public class MyDate {

    public int date, month, year;

    public MyDate() {
    }

    public MyDate(int date, int month, int year) {
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public MyDate(MyDate myDate) {
        date = myDate.date;
        month = myDate.month;
        year = myDate.year;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate{" + date + "/" + month + "/" + year + '}';
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap year:");
            year = sc.nextInt();
            if (year < 0) {
                throw new Exception("Lỗi nhập year");
            }
            System.out.println("Nhap month");
            month = sc.nextInt();
            if (month < 0 || month > 12) {
                throw new Exception("Lỗi nhập tháng");
            }
            System.out.println("Nhap date");
            date = sc.nextInt();
            if (date < 0) {
                throw new Exception("Lỗi nhập date");
            }
            switch (month) {
                case 1:
                case 3: case 5: case 7: case 8: case 11:case12:
                    if (date > 31) {
                        throw new Exception("Lỗi nhập date quá sô ngay cua thang " + month);
                    }
                    break;
                case 2:
                    if((year % 4 == 0 && date > 29) ||(year % 4 != 0 && date > 28 ))
                    {
                        throw new Exception("Lỗi nhập date quá sô ngay cua thang " + month);
                    }
                    break;
                case 4:case 6:case 9:case 10:
                    if (date > 30) {
                        throw new Exception("Lỗi nhập date quá sô ngay cua thang " + month);
                    }
                    break;               
                default:
                    throw new AssertionError();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        myDate.Nhap();
        System.out.println(myDate.toString());
    }
}
