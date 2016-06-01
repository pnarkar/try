package com.yusuf.pojo;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="sellertable")
@PrimaryKeyJoinColumn(name="userId")
@DiscriminatorValue("Seller")
public class Seller extends User {
	@Column(name="Sellertype")
	private String SellerType;
	@Column(name="SellerAddress")
	private String SellerAddress;
	
	public Seller()
	{
		
	}
	public Seller(String SellerType, String SellerAddress)
	{
		this.SellerAddress=SellerAddress;
		this.SellerType=SellerType;
	}
	public String getSellerType() {
		return SellerType;
	}
	public void setSellerType(String sellerType) {
		SellerType = sellerType;
	}
	public String getSellerAddress() {
		return SellerAddress;
	}
	public void setSellerAddress(String sellerAddress) {
		SellerAddress = sellerAddress;
	}
	

}
