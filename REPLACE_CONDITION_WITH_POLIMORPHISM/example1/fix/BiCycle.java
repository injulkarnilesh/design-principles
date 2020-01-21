package REPLACE_CONDITION_WITH_POLIMORPHISM.example1.fix;

import java.math.BigDecimal;

public class BiCycle implements Vehicle {

    @Override
    public ParkingSpotSize spaceRequiredForParking() {
        return ParkingSpotSize.SMALL;
    }

    @Override
    public BigDecimal parkingCharges() {
        return BigDecimal.valueOf(10.00);
    }
}
