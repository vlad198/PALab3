package compulsory.location;

import java.util.*;

/**
 * Abstract class for the location
 */
public abstract class AbstractLocation implements Comparable<AbstractLocation> {
    protected String name;
    protected Map<AbstractLocation,Integer> cost;

    /**
     * compare method for MAP
     * @param o location to compare
     * @return compare name of the object with the location given
     */
    @Override
    public int compareTo(AbstractLocation o) {
        if(name == null) return -1;
        return this.name.compareTo(o.getName());
    }

    /**
     * Constructor
     * @param name name of the location
     * @param cost vector of costs to other locations
     */
    public AbstractLocation(String name, Map<AbstractLocation, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    /**
     * abstract method for the class
     */
    public abstract void isLocation();

    /**
     * getter for name
     * @return the name of the location
     */
    public String getName() {
        return name;
    }

    /**
     * default constructor
     */
    public AbstractLocation() {
        this.name = "DefaultName";
        this.cost = new HashMap<AbstractLocation,Integer>();
    }

    public void setName(String name){
        this.name = name;
    }

    /**
     * getter
     * @return the vector of cost
     */
    public Map<AbstractLocation, Integer> getCost() {
        return cost;
    }

    /**
     * insert new location in the vector of costs from the current location
     * @param location the location given
     * @param value the cost
     */
    public void setCost(AbstractLocation location, int value){
        cost.put(location,value);
    }
}
