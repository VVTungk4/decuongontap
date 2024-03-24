package baitapdecuong7;

import java.util.Scanner;

public class ThisinhkhoiC extends Thisinh {
   private float dv,ds,dd;
   public Scanner sc = new Scanner(System.in);
   public ThisinhkhoiC() {
	   
   }
   public ThisinhkhoiC(float dv, float ds, float dd,String ht, String ns,String dc) {
	super(ht,ns,dc);
	this.dv = dv;
	this.ds = ds;
	this.dd = dd;
   }
   public float getDv() {
	  return dv;
   }
   public void setDv(float dv) {
	  this.dv = dv;
   }
   public float getDs() {
	  return ds;
   }
   public void setDs(float ds) {
	  this.ds = ds;
   }
   public float getDd() {
	  return dd;
   }
   public void setDd(float dd) {
	   this.dd = dd;
   }
   public void input() {
	   super.input();
	    System.out.println("Điểm văn: "); dv=sc.nextFloat();
		System.out.println("Điểm sử: "); ds= sc.nextFloat();
		System.out.println("Điểm địa: ");dd=sc.nextFloat();
	   
   }
   public void output() {
	   super.output();
	   System.out.printf("%15.2f | ",dv);
	   System.out.printf("%15.2f | ",ds);
	   System.out.printf("%15.2f | ",dd);
	   System.out.println("");
   }
   public String toString() {
	   return super.toString()+dv+" | "+ds+" | "+dd+"\n";
   }
   @Override
   public float tongdiem() {
	   return dv+ds+dd;
	}
   
   
   
}
