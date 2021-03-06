package catchup20;

import java.sql.Date;

public class ProductBean {
 private int id;
 private String product_Name;
 private double price;
 private Date onboard_date;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProduct_Name() {
	return product_Name;
}
public void setProduct_Name(String product_Name) {
	this.product_Name = product_Name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Date getOnboard_date() {
	return onboard_date;
}
public void setOnboard_date(Date onboard_date) {
	this.onboard_date = onboard_date;
}
 
 
}
