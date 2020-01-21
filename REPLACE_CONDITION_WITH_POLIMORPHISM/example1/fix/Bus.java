package REPLACE_CONDITION_WITH_POLIMORPHISM.example1.fix;

import java.math.BigDecimal;

public class Bus implements Vehicle {

    @Override
    public ParkingSpotSize spaceRequiredForParking() {
        return ParkingSpotSize.XL;
    }

    @Override
    public BigDecimal parkingCharges() {
        return BigDecimal.valueOf(100.00);
    }
}
