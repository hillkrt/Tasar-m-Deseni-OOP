import java.util.ArrayList;
import java.util.List;
//Composite product class
public class CompositeProduct_37 implements Product_37{
	
	    private String name;
	    private String code;
	    private List<Product_37> subProducts;

	    public CompositeProduct_37(String name, String code) {
	        this.name = name;
	        this.code = code;
	        this.subProducts = new ArrayList<>();
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        double totalPrice = 0.0;
	        for (Product_37 product : subProducts) {
	            totalPrice += product.getPrice();
	        }
	        return totalPrice;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void addProduct(Product_37 product) {
	        subProducts.add(product);
	    }

	    public void showProductDetails() {
	        System.out.println("Composite Product Name: " + name);
	        System.out.println("Composite Product Code: " + code);
	        System.out.println("Subproducts:");
	        for (Product_37 product : subProducts) {
	            product.showProductDetails();
	            System.out.println("--------------------");
	        }
	    }
	}

