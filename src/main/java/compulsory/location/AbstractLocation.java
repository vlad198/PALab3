package compulsory.location;

import java.util.*;

public abstract class AbstractLocation implements Comparable<AbstractLocation> {
    protected String name;
    protected Map<AbstractLocation,Integer> cost;

    @Override
    public int compareTo(AbstractLocation o) {
        if(name == null) return -1;
        return this.name.compareTo(o.getName());
    }

    public AbstractLocation(String name, Map<AbstractLocation, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    public abstract void isLocation();

    public String getName() {
        return name;
    }

    public AbstractLocation() {
        this.name = "DefaultName";
        this.cost = new HashMap<AbstractLocation,Integer>();
    }

    public void setName(String name){
        this.name = name;
    }

    public Map<AbstractLocation, Integer> getCost() {
        return cost;
    }

    public void setCost(AbstractLocation location, int value){
        cost.put(location,value);
    }
}
