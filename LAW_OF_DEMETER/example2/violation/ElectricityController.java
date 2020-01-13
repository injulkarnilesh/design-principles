package LAW_OF_DEMETER.example2.violation;

public class ElectricityController {

    private Hotel hotel;

    public void turnOnLight(final int floorNumber,
                             final Corridor.Type corridorType,
                             final int corridorNumber) {
        /*
        The train-wreck exposing internal details of classes on the path
        and coupling them all with this class.
         */
        this.hotel.getFloors()
                .get(floorNumber)
                .getCorridors()
                .get(corridorType)
                .get(corridorNumber)
                .getLight()
                .on();
    }

}
