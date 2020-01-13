package LAW_OF_DEMETER.example2.fix;

public class ElectricityController {

    private Hotel hotel;

    public void turnOnLights(final int floorNumber,
                             final Corridor.Type corridorType,
                             final int corridorNumber) {
        /*
        No train.
        Just command passed on to dependent object.
        Calling method of Hotel Ok.
         */
        hotel.turnOnLight(floorNumber, corridorType, corridorNumber);
    }

}
