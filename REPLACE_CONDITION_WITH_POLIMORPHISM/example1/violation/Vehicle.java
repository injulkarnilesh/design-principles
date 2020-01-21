package REPLACE_CONDITION_WITH_POLIMORPHISM.example1.violation;

import java.math.BigDecimal;

public class Vehicle {

    private Type type;

    /*
    So many conditionals.
    Would have to change these places when new vehicle type is to be added.
     */
    public ParkingSpotSize spaceRequiredForParking() {
        switch (type) {
            case BICYCLE:
                return ParkingSpotSize.SMALL;
            case BIKE:
                return ParkingSpotSize.MEDIUM;
            case CAR:
                return ParkingSpotSize.LARGE;
            case BUS:
                return ParkingSpotSize.XL;
        }
        throw new RuntimeException("Parking spot size not known for " + type);
    }

    public BigDecimal parkingCharges() {
        switch (type) {
            case BICYCLE:
                return BigDecimal.valueOf(10.00);
            case BIKE:
                return BigDecimal.valueOf(20.00);
            case CAR:
                return BigDecimal.valueOf(50.00);
            case BUS:
                return BigDecimal.valueOf(100.00);
        }
        throw new RuntimeException("Parking changes not known for " + type);
    }

    enum Type {
        BICYCLE,
        BIKE,
        CAR,
        BUS
    }

    enum ParkingSpotSize {
        SMALL,
        MEDIUM,
        LARGE,
        XL
    }
}
