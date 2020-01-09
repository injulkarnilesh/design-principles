package SOLID.OPEN_CLOSED.example1.fix;

public class CheckoutProcess {
    
    private final Payment payment; 

    public CheckoutProcess(Payment payment) {
        this.payment = payment;
    }
    
    /*
    If payment method changes this class is not modified.
    */
    public void initiatePayment(ShoppingCart cart) {
        Double amount = cart.getTotal();
        this.payment.pay(amount);
    }

}