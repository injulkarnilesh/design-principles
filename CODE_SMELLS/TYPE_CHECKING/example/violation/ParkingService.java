package CODE_SMELLS.TYPE_CHECKING.example.violation;

import java.util.List;

public class ParkingService {

    /*
    Type checking driving the logic.
    Adding new vehicle type requires code change here.
    Code is tightly coupled to all implementations of Vehicle.
     */
    int totalSpaceRequiredForParking(List<Vehicle> vehicles) {
        int space = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof BiCycle) space += 1;
            if (vehicle instanceof Bike) space += 2;
            if (vehicle instanceof Car) space += 4;
            if (vehicle instanceof Bus) space += 8;
        }
        return space;
    }

}
