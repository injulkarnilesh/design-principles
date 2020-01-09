package SOLID.OPEN_CLOSED.example1.violation;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    public List<Item> getItems() {
        return new ArrayList<Item>();
    }

    public Double getTotal() {
        return Double.MAX_VALUE;
    }

    public static class Item {
        
    }
}