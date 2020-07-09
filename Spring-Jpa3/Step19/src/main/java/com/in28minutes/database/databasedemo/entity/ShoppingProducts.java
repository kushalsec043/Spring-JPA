package com.in28minutes.database.databasedemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class ShoppingProducts
{
   @Id
   @Column(name="shid",unique=true,nullable=false)
   private int shid;
   
   @OneToOne 
   public Person person;
	 
   private String shname;
   private double shprice;
   private String shimage;
   
public ShoppingProducts(int shid, String shname, double shprice, String shimage) {
	super();
	this.shid = shid;
	this.shname = shname;
	this.shprice = shprice;
	this.shimage = shimage;
}
public ShoppingProducts() {
	super();
}
public int getShid() {
	return shid;
}
public void setShid(int shid) {
	this.shid = shid;
}
public String getShname() {
	return shname;
}
public void setShname(String shname) {
	this.shname = shname;
}
public double getShprice() {
	return shprice;
}
public void setShprice(double shprice) {
	this.shprice = shprice;
}
public String getShimage() {
	return shimage;
}
public void setShimage(String shimage) {
	this.shimage = shimage;
}
@Override
public String toString() {
	return "ShoppingCart [shid=" + shid + ", shname=" + shname + ", shprice=" + shprice + ", shimage=" + shimage + "]";
}   
}
