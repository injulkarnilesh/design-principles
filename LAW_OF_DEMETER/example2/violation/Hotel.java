package LAW_OF_DEMETER.example2.violation;

import java.util.List;

public class Hotel {

    private List<Floor> floors;

    public List<Floor> getFloors() {
        return floors;
    }
}
