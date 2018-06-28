package scm.arvato.web.arvato_webApp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
//@JsonbAnnotation
public class Product {
	String name ;
	String countryOfOrigin;
	double price;
	Boolean isFragile;
	int timesPurchased;
	
	public Product() {
		this.name = "" ;
		this.countryOfOrigin = "";
		this.price = 0;
		this.isFragile = false;
		this.timesPurchased = 0;
	}
	
	public Product(String name, String country, double price, Boolean isFragile, int timePurchased) {
		this.name = name ;
		this.countryOfOrigin = country;
		this.price = price;
		this.isFragile = isFragile;
		this.timesPurchased = timePurchased;
	}

/*---------------------------------setters and getters-----------------------------------------*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Boolean getIsFragile() {
		return isFragile;
	}
	public void setIsFragile(Boolean isFragile) {
		this.isFragile = isFragile;
	}
	public int getTimesPurchased() {
		return timesPurchased;
	}
	public void setTimesPurchased(int timesPurchased) {
		this.timesPurchased = timesPurchased;
	}
	@Override
	public String toString() {
		return "\n {name:" + name + ", countryOfOrigin=" + countryOfOrigin + ", Price=" + price
				+ ", isFragile=" + isFragile + ", timesPurchased=" + timesPurchased + "}\n";
	}

	

}

