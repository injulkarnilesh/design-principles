package CODE_SMELLS.GOD_OBJECT.example.violation;

import java.math.BigDecimal;

public class ATMController {

    private Card cardRead;
    private boolean hasCard;

    public void cardInserted() {
        this.hasCard = true;
    }

    public void cardRemoved() {
        this.hasCard = false;
    }

    public void readCard() {
        cardRead = new Card();
    }

    public String readPin() {
        return "";
    }

    public boolean validatePin(String pin) {
        return false;
    }

    public int readAmount() {
        return 0;
    }

    public boolean validateAmound() {
        return true;
    }

    public void deduceAmount(int amount) {

    }

    public void dispatchAmount(int amount) {

    }

    public BigDecimal showBalance() {
        return BigDecimal.ZERO;
    }

    public String showOffer() {
        return "Buy me";
    }

    class Card {

    }

}
