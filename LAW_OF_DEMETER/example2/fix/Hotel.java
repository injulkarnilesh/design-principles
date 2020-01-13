package LAW_OF_DEMETER.example2.fix;

import java.util.List;

public class Hotel {

    private List<Floor> floors;

    /*
    It depends on Floor, not List.
    List is DataStructure, not dependent object per se.
    Calling method of Floor Ok.
     */
    public void turnOnLight(final int floorNumber,
                            final Corridor.Type corridorType,
                            final int corridorNumber) {
        this.floors.get(floorNumber)
                .turnOnLight(corridorType, corridorNumber);
    }

    public List<Floor> getFloors() {
        return floors;
    }
}
