package CODE_SMELLS.DOWNCASTING.example.fix;

import java.math.BigDecimal;

public class CashDonation implements Donation {

    private final BigDecimal amount;

    public CashDonation(final BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public BigDecimal getWorth() {
        return amount;
    }

    @Override
    public String getDonorsName() {
        return "You";
    }
}
