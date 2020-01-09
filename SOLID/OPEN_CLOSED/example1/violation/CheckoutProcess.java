package SOLID.OPEN_CLOSED.example1.violation;

public class CheckoutProcess {
    
    /*
    Payment method hard-depends on payment mode.
    If new payment method is added or existing one changes the way it is done
    then unnecessorily Checkout class gets modified.
    */
    public void initiatePayment(ShoppingCart cart, PaymentMethod paymentMethod) {
        Double amount = cart.getTotal();
        if (PaymentMethod.CREDIT_CARD.equals(paymentMethod)) {
            payByCreditCard(amount);
        } else if (PaymentMethod.PAYPAL.equals(paymentMethod)) {
            payByPaypal(amount);
        } else if (PaymentMethod.NET_BANKING.equals(paymentMethod)) {
            payByNetBanking(amount);
        }
    }

    private void payByCreditCard(Double amount) {

    }
    
    private void payByPaypal(Double amount) {
        
    }

    private void payByNetBanking(Double amount) {
        
    }

    public enum PaymentMethod {
        NET_BANKING,
        PAYPAL,
        CREDIT_CARD
    }

}