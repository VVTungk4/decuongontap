package baitapdecuong7;

import java.util.Scanner;

public class ThisinhkhoiA extends Thisinh {
   private float dt,dl,dh;
   public Scanner sc = new Scanner(System.in);
   public ThisinhkhoiA() {
	   
   }
   public ThisinhkhoiA(float dt, float dl, float dh,String ht, String ns,String dc) {
	super(ht,ns,dc);
	this.dt = dt;
	this.dl = dl;
	this.dh = dh;
   }
   public float getDt() {
	  return dt;
   }
   public void setDt(float dt) {
	  this.dt = dt;
   }
   public float getDl() {
	  return dl;
   }
   public void setDl(float dl) {
	  this.dl = dl;
   }
   public float getDh() {
	  return dh;
   }
   public void setDh(float dh) {
	   this.dh = dh;
   }
   public void input() {
	   super.input();
	    System.out.println("Điểm toán: "); dt=sc.nextFloat();
		System.out.println("Điểm lý: "); dl= sc.nextFloat();
		System.out.println("Điểm hóa: ");dh=sc.nextFloat();
	   
   }
   public void output() {
	   super.output();
	   System.out.printf("%15.2f | ",dt);
	   System.out.printf("%15.2f | ",dl);
	   System.out.printf("%15.2f | ",dh);
	   System.out.println("");
   }
   public String toString() {
	   return super.toString()+dt+" | "+dl+" | "+dh+"\n";
   }
   @Override
   public float tongdiem() {
	   return dt+dl+dh;
   }
   
   
   
}
