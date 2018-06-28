package scm.arvato.web.arvato_webApp;


import java.util.ArrayList;
import java.util.List;

public class ProductsData {
	
	String mostExpensiveProduct ;
	String cheapsetProduct ;
	String mostPopularProduct;
	List<String> germanProducts ;
	List<String> chineseProducts;
	Boolean containsFragileProducts ;
	
	public ProductsData() {
		germanProducts = new ArrayList<String>();
		chineseProducts = new ArrayList<String>();
		containsFragileProducts = false;
		mostExpensiveProduct="" ;
		cheapsetProduct="" ;
		mostPopularProduct ="";
	}
	
	public static ProductsData analyze(List<Product> products) {
		ProductsData productsdata = new ProductsData();
		Product mostExpensive = products.get(0);
		Product cheapest = products.get(0);
		Product mostPopular= products.get(0);
		
		for (Product p : products) {
			if(p.getPrice() > mostExpensive.getPrice()) {
				mostExpensive = p ;
			}
			if(p.getTimesPurchased() > mostPopular.getTimesPurchased()) {
				mostPopular = p ;
			}
			if(p.getPrice() < cheapest.getPrice()) {
				cheapest = p ;
			}
			if(p.countryOfOrigin.equals("DE")) {
				productsdata.addGermanProduct(p.getName());
			}
			if (p.countryOfOrigin.equals("CN")) {
				productsdata.addChineseProduct(p.getName());
			}
			if(p.isFragile == true) {
				productsdata.setContainsFragileProducts(true); 
			}
		}
		
		productsdata.setCheapsetProduct(cheapest.getName());
		productsdata.setMostExpensiveProduct(mostExpensive.getName()); ;
		productsdata.setMostPopularProduct(mostPopular.getName()); ;
		return productsdata;		
	}
	/*-------------------------addGermanProduct()------------------------*/
	public void addGermanProduct(String germanProduct) {
		this.germanProducts.add(germanProduct);
	}
	/*-------------------------addGermanProduct()------------------------*/
	public void addChineseProduct(String chineseProduct) {
		this.chineseProducts.add(chineseProduct);
	}
	/*---------------------------toString---------------------------------*/
	@Override
	public String toString() {
		return "\nProductsData :\n {\nmostExpensiveProduct:  " + mostExpensiveProduct + "\ncheapsetProduct:  " + cheapsetProduct
				+ "\nmostPopularProduct:  " + mostPopularProduct +"\ngermanProducts:  " + germanProducts
				+ "\nchineseProducts:  " + chineseProducts + "\ncontainsFragileProducts:  " + containsFragileProducts + "\n}";
	}
	/*-------------------------Setters and Getters---------------------------*/
	public List<String> getGermanProduct() {
		return germanProducts;
	}

	public void setGermanProduct(List<String> germanProduct) {
		this.germanProducts = germanProduct;
	}

	public String getMostExpensiveProduct() {
		return mostExpensiveProduct;
	}

	public void setMostExpensiveProduct(String mostExpensiveProduct) {
		this.mostExpensiveProduct = mostExpensiveProduct;
	}

	public String getCheapsetProduct() {
		return cheapsetProduct;
	}

	public void setCheapsetProduct(String cheapsetProduct) {
		this.cheapsetProduct = cheapsetProduct;
	}

	public String getMostPopularProduct() {
		return mostPopularProduct;
	}

	public void setMostPopularProduct(String mostPopularProduct) {
		this.mostPopularProduct = mostPopularProduct;
	}

	public List<String> getChineseProducts() {
		return chineseProducts;
	}

	public void setChineseProducts(List<String> chineseProducts) {
		this.chineseProducts = chineseProducts;
	}

	public Boolean getContainsFragileProducts() {
		return containsFragileProducts;
	}

	public void setContainsFragileProducts(Boolean containsFragileProducts) {
		this.containsFragileProducts = containsFragileProducts;
	}


	
}




