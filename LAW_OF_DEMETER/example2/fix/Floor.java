package LAW_OF_DEMETER.example2.fix;

import java.util.List;
import java.util.Map;

public class Floor {

    private Map<Corridor.Type, List<Corridor>> corridors;

    /*
    It depends on Corridor, not Map.
    Map is DataStructure, not dependent object per se.
    Calling method of Corridor Ok.
     */
    public void turnOnLight(Corridor.Type corridorType, int corridorNumber) {
        if (this.corridors.containsKey(corridorType)) {
            final List<Corridor> matchingCorridors = this.corridors.get(corridorType);
            if (corridorNumber < matchingCorridors.size() && corridorNumber >= 0) {
                final Corridor corridor = matchingCorridors.get(0);
                corridor.turnOnLight();
            }
        }

    }

    public Map<Corridor.Type, List<Corridor>> getCorridors() {
        return corridors;
    }
}
