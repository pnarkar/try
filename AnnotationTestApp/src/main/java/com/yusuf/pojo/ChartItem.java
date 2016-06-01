package com.yusuf.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="cartTable")
public class ChartItem {
	@Id
	@GeneratedValue
	@Column(name = "cartId1", unique = true, nullable = false)
	private long cartId;
	@Column(name="quantity")
	private long Quantity;
	@Column(name="orderStatus")
	private long orderStatus;
	
	public long getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(long orderStatus) {
		this.orderStatus = orderStatus;
	}
	@Column(name="price")
	private long price;
	
	@Column(name="total")
	private long total;
	
	
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productID")
	private Product product;
//	@ManyToOne(fetch = FetchType.LAZY)
//	private ShoppingCart sc;
//	
	
	@JoinColumn(name="id")
    private long Shoppingcart;

	
	public ChartItem()
	{
		
	}
	public ChartItem(long Quantity)
	{
		this.Quantity=Quantity;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public ChartItem( long Quantity, Product product,long shoppingcart,long price,long orderStatus,long total)
	{
	
		this.Quantity=Quantity;
		this.product=product;
		this.Shoppingcart=shoppingcart;
		this.price=price;
		this.orderStatus=orderStatus;
		this.total=total;
		
	}
	
	public long getCartId() {
		return cartId;
	}
	public void setCartId(long cartId) {
		this.cartId = cartId;
	}
	public long getQuantity() {
		return Quantity;
	}
	public void setQuantity(long quantity) {
		Quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public long getShoppingcart() {
		return Shoppingcart;
	}
	public void setShoppingcart(long shoppingcart) {
		Shoppingcart = shoppingcart;
	}
//	
//	public ShoppingCart getSc() {
//		return sc;
//	}
//	public void setSc(ShoppingCart sc) {
//		this.sc = sc;
//	}
	
	
	
}
