package REPLACE_CONDITION_WITH_POLIMORPHISM.example1.fix;

import java.math.BigDecimal;

public interface Vehicle {

    /*
    Adding new vehicle type involve adding new implementation.
     */
    ParkingSpotSize spaceRequiredForParking();
    BigDecimal parkingCharges();

    enum ParkingSpotSize {
        SMALL,
        MEDIUM,
        LARGE,
        XL
    }
}
