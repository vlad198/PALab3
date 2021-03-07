package compulsory.location;

import java.util.ArrayList;
import java.util.List;

/**
 * city class which contains an array of locations
 */
public class City {
    private List<AbstractLocation> locations;

    public List<AbstractLocation> getLocations() {
        return locations;
    }

    public void setLocations(List<AbstractLocation> locations) {
        this.locations = locations;
    }

    public void addLocation(AbstractLocation location){
        locations.add(location);
    }

    public City(List<AbstractLocation> locations) {
        this.locations = locations;
    }

    public City() {
        this.locations = new ArrayList<>();
    }
}
