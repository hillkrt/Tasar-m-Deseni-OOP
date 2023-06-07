// Simple product class
public class SimpleProduct_37 implements Product_37{
	

	    private String name;
	    private double price;
	    private String code;

	    public SimpleProduct_37(String name, double price, String code) {
	        this.name = name;
	        this.price = price;
	        this.code = code;
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void showProductDetails() {
	        System.out.println("Product Name: " + name);
	        System.out.println("Price: " + price + " TL");
	        System.out.println("Product Code: " + code);
	    }
	}

