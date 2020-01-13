package LAW_OF_DEMETER.example2.violation;

import java.util.List;
import java.util.Map;

public class Floor {

    private Map<Corridor.Type, List<Corridor>> corridors;

    public Map<Corridor.Type, List<Corridor>> getCorridors() {
        return corridors;
    }
}
