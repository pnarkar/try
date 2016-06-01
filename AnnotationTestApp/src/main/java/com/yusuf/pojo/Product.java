package com.yusuf.pojo;

import java.util.HashSet;
import java.util.Set;

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

//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
@Table(name="producttable")
public class Product {
	@Column(name="productname")
	private String productname;
	@Column(name="productprice")
	private String productprice;
	@Column(name="productDescription")
	private String productDescription;
	@Column(name="sellerQuantity")
	private long sellerQuantity;
	
	 
	public long getSellerQuantity() {
		return sellerQuantity;
	}
	public void setSellerQuantity(long sellerQuantity) {
		this.sellerQuantity = sellerQuantity;
	}
	@Column(name="productImage")
	    private String photoName;
	    
	     public String getPhotoName() {
	        return photoName;
	    }
	    public void setPhotoName(String photoName) {
	        this.photoName = photoName;
	    }
	    private CommonsMultipartFile  photo;
	    
	
	public CommonsMultipartFile getPhoto() {
			return photo;
		}
		public void setPhoto(CommonsMultipartFile photo) {
			this.photo = photo;
		}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId")
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Set<ChartItem> getCartItem() {
		return cartItem;
	}
	public void setCartItem(Set<ChartItem> cartItem) {
		this.cartItem = cartItem;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="productID", unique = true, nullable = false)
	private long productID;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="product")
	private Set<ChartItem> cartItem = new HashSet<ChartItem>();
	
	 Product()
	{
		
	}
	 public Product(long productID)
	 {
		 this.productID=productID;
	 }
	public Product(String productname,String productprice,String productDescription,String photoName,long sellerQuantity)
	{
		this.productname=productname;
		this.photo=photo;
		this.productprice=productprice;
		this.productDescription=productDescription;
		this.cartItem = new HashSet<ChartItem>();
		this.photoName=photoName;
		this.sellerQuantity=sellerQuantity;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public long getProductID() {
		return productID;
	}
	public void setProductID(long productID) {
		this.productID = productID;
	}
	

}
