package CODE_SMELLS.DOWNCASTING.example.violation;

import java.math.BigDecimal;

public class ItemDonation implements Donation {

    private final Item item;

    public ItemDonation(final Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String getDonorsName() {
        return "Me";
    }

    public static class Item {
        public BigDecimal getValue() {
            return BigDecimal.ZERO;
        }
    }
}
