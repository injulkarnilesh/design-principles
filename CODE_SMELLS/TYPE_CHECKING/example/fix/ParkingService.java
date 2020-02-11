package CODE_SMELLS.TYPE_CHECKING.example.fix;

import java.util.List;

public class ParkingService {

    /*
    No type checking.
    No dependency on all possible types of vehicles.
     */
    int totalSpaceRequiredForParking(List<Vehicle> vehicles) {
        return vehicles.stream().map(Vehicle::spaceRequired)
                .mapToInt(Integer::intValue)
                .sum();
    }

}
