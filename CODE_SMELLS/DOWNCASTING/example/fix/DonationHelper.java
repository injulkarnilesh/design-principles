package CODE_SMELLS.DOWNCASTING.example.fix;

import java.math.BigDecimal;

public class DonationHelper {

    /*
    Once abstraction of donation is corrected,
    no need of downcasting.
     */
    public String thankYouMessage(Donation donation) {
        BigDecimal amount = donation.getWorth();
        return String.format("Thank you for your donation worth %d", amount);
    }

}
