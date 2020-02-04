package CODE_SMELLS.DOWNCASTING.example.fix;

import java.math.BigDecimal;

public interface Donation {
    String getDonorsName();
    BigDecimal getWorth();
}
