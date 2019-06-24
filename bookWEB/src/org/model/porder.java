package org.model;

public class porder {
	private Integer id;
	private String name;
	private String product;
	private Integer amount;
	private Integer sum;
	
	public porder() {}
	
	public porder(String name,String product,int amount) {
		this.name=name;
		this.product=product; //產品
		this.amount=amount; //數量
		
		//如果產品名稱為x 則 數量*???
		if(this.product.equals("A")) sum=amount*1000;
		if(this.product.equals("B")) sum=amount*1200;
		if(this.product.equals("C")) sum=amount*1500;
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getSum() {
		return sum;
	}
	public void setSum(Integer sum) {
		this.sum = sum;
	}
	
	
}
