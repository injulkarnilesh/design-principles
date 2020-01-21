package REPLACE_CONDITION_WITH_POLIMORPHISM.example1.fix;

import java.math.BigDecimal;

public class Car implements Vehicle {

    @Override
    public ParkingSpotSize spaceRequiredForParking() {
        return ParkingSpotSize.LARGE;
    }

    @Override
    public BigDecimal parkingCharges() {
        return BigDecimal.valueOf(50.00);
    }
}
