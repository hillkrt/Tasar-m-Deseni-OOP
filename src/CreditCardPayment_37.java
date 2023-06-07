// Credit card payment class
public class CreditCardPayment_37 implements PaymentOption_37 {

	    private String cardNumber;
	    private String expirationDate;
	    private String cvv;

	    public CreditCardPayment_37(String cardNumber, String expirationDate, String cvv) {
	        this.cardNumber = cardNumber;
	        this.expirationDate = expirationDate;
	        this.cvv = cvv;
	    }

	    public void pay(double amount) {
	        System.out.println("Credit card payment completed. Total amount: " + amount);
	    }
	}

