package bonus.location;

import lombok.Data;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/**
 * Abstract class for the location
 */
public abstract @Data
class Location implements Comparable<Location> {
    protected String name;
    protected Map<Location, Integer> cost = new TreeMap<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return name.equals(location.name) && cost.equals(location.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost);
    }

    /**
     * compare method for MAP
     *
     * @param o location to compare
     * @return compare name of the object with the location given
     */
    @Override
    public int compareTo(Location o) {
        if (name == null) return -1;
        return this.name.compareTo(o.getName());
    }

    /**
     * abstract method for the class
     */
    public abstract void isLocation();

    /**
     * insert new location in the vector of costs from the current location
     *
     * @param location the location given
     * @param value    the cost
     */
    public void setCost(Location location, int value) {
        cost.put(location, value);
    }
}
