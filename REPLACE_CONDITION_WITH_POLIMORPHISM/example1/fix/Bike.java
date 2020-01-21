package REPLACE_CONDITION_WITH_POLIMORPHISM.example1.fix;

import java.math.BigDecimal;

public class Bike implements Vehicle {

    @Override
    public ParkingSpotSize spaceRequiredForParking() {
        return ParkingSpotSize.MEDIUM;
    }

    @Override
    public BigDecimal parkingCharges() {
        return BigDecimal.valueOf(20.00);
    }
}
