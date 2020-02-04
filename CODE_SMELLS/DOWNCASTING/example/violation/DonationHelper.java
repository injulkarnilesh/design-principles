package CODE_SMELLS.DOWNCASTING.example.violation;

import java.math.BigDecimal;

public class DonationHelper {

    public String thankYouMessage(Donation donation) {
        /*
        Casting to call subtype specific behaviour.
        Donation abstraction does not have any behaviour to calculate donation worth.
         */
        BigDecimal amount = BigDecimal.ZERO;
        if (donation instanceof CashDonation) {
            amount = ((CashDonation) donation).getAmount();
        } else if (donation instanceof ItemDonation) {
            amount = ((ItemDonation) donation).getItem().getValue();
        }
        return String.format("Thank you for your donation worth %d", amount);
    }

}
