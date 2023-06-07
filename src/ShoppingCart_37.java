import java.util.ArrayList;
import java.util.List;
// Shopping cart class
public class ShoppingCart_37 {

	    private List<Product_37> products;

	    public ShoppingCart_37() {
	        products = new ArrayList<>();
	    }

	    public void addProduct(Product_37 product) {
	        products.add(product);
	    }

	    public void showCartDetails() {
	        if (products.isEmpty()) {
	            System.out.println("Your cart is empty.");
	        } else {
	            System.out.println("Products in your cart:");
	            for (Product_37 product : products) {
	                product.showProductDetails();
	                System.out.println("--------------------");
	            }
	        }
	    }

	    public double getTotalPrice() {
	        double totalPrice = 0.0;
	        for (Product_37 product : products) {
	            totalPrice += product.getPrice();
	        }
	        return totalPrice;
	    }
	}

