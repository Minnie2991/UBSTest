package hackerrank;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    
    private HashMap<String , Integer> furnitureMap;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
        
        furnitureMap = new HashMap<String , Integer>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        // TODO: Complete the method
        
        Integer count = 0;
        if(furnitureMap.containsKey(type)) {
            count = furnitureMap.get(type);
        }
        furnitureMap.put(type, count + furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the meth
        return new HashMap<String , Integer>(furniturMap);
    }

    public float getTotalOrderCost() {
        // TODO: Complete the method
        
        if (!furnitureMap.isEmpty()){
        return furnitureMap.Entryset.stream
            .map(x -> x.getKey.cost * x.getValue)
            .collect(Collectors.toList());
        }
        return -1.0f;
    }

    public int getTypeCount(Furniture type) {
        // TODO: Complete the method
        return -1;
    }

    public float getTypeCost(Furniture type) {
        // TODO: Complete the method
        return -1.0f;
    }

    public int getTotalOrderQuantity() {
        // TODO: Complete the method
        return -1;
    }
}
