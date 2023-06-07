import java.util.List;
import java.util.Scanner;
//Online shopping facade class
public class OnlineShoppingFacade_37 {
	
	    private UserAuthentication_37 userAuthentication;
	    private ProductCatalog_37 productCatalog;
	    private ShoppingCart_37 shoppingCart;
	    private Scanner scanner;

	    public OnlineShoppingFacade_37() {
	        userAuthentication = new UserAuthentication_37();
	        productCatalog = new ProductCatalog_37();
	        shoppingCart = new ShoppingCart_37();
	        scanner = new Scanner(System.in);
	    }

	    public void startShopping() {
	        // User authentication
	        boolean isAuthenticated = false;
	        while (!isAuthenticated) {
	            System.out.print("Enter your username: ");
	            String username = scanner.nextLine();
	            System.out.print("Enter your password: ");
	            String password = scanner.nextLine();

	            isAuthenticated = userAuthentication.authenticate(username, password);

	            if (!isAuthenticated) {
	                System.out.println("Invalid username or password. Please try again.");
	            }
	        }

	        // Show product list
	        List<Product_37> productList = productCatalog.getProductList();
	        System.out.println("Products:");
	        for (Product_37 product : productList) {
	            product.showProductDetails();
	            System.out.println("--------------------");
	        }

	        // Product selection
	        System.out.print("Which product do you want? (Enter the product code): ");
	        String productCode = scanner.nextLine();
	        Product_37 selectedProduct = null;
	        for (Product_37 product : productList) {
	            if (product.getCode().equals(productCode)) {
	                selectedProduct = product;
	                break;
	            }
	        }

	        if (selectedProduct != null) {
	            shoppingCart.addProduct(selectedProduct);
	        } else {
	            System.out.println("Invalid product code. Exiting the program.");
	            return;
	        }

	        // Get address information
	        System.out.print("Neighborhood: ");
	        String neighborhood = scanner.nextLine();
	        System.out.print("Street: ");
	        String street = scanner.nextLine();
	        System.out.print("Door Number: ");
	        String doorNumber = scanner.nextLine();
	        Address_37 address = new Address_37(neighborhood, street, doorNumber);

	        // Payment selection
	        System.out.print("Select a payment method (1-Cash, 2-Credit Card): ");
	        int paymentOption = scanner.nextInt();
	        scanner.nextLine(); // Read the empty line

	        PaymentOption_37 paymentStrategy = null;
	        if (paymentOption == 1) {
	            paymentStrategy = new CashOnDeliveryPayment_37();
	        } else if (paymentOption == 2) {
	            System.out.print("Card Number: ");
	            String cardNumber = scanner.nextLine();
	            System.out.print("Expiration Date: ");
	            String expirationDate = scanner.nextLine();
	            System.out.print("CVV: ");
	            String cvv = scanner.nextLine();
	            paymentStrategy = new CreditCardPayment_37(cardNumber, expirationDate, cvv);
	        } else {
	            System.out.println("Invalid payment option. Exiting the program.");
	            return;
	        }

	        // Payment process
	        double totalPrice = shoppingCart.getTotalPrice();
	        paymentStrategy.pay(totalPrice);

	        // Order confirmation
	        System.out.println("Your order has been confirmed.");

	        // End the program
	        System.exit(0);
	    }
	}

