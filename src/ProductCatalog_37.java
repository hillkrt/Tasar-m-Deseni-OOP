import java.util.ArrayList;
import java.util.List;
// Product catalog class
public class ProductCatalog_37 {


	    private List<Product_37> productList;

	    public ProductCatalog_37() {
	        productList = new ArrayList<>();
	        initializeProductList();
	    }

	    private void initializeProductList() {
	        // Create products here and add them to the productList
	    	Product_37 product1 = new SimpleProduct_37("Computer 1", 10.0, "1");
	    	Product_37 product2 = new SimpleProduct_37("Camera 2", 20.0, "2");
	    	Product_37 product3 = new SimpleProduct_37("Shose 3", 30.0, "3");

	    	CompositeProduct_37 compositeProduct = new CompositeProduct_37("Composite Product", "100");
	        compositeProduct.addProduct(product1);
	        compositeProduct.addProduct(product2);
	        compositeProduct.addProduct(product3);

	        productList.add(product1);
	        productList.add(product2);
	        productList.add(product3);
	        productList.add(compositeProduct);
	    }

	    public List<Product_37> getProductList() {
	        return productList;
	    }
	}
