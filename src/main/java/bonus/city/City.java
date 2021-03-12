package bonus.city;

import bonus.interfaces.Payable;
import bonus.interfaces.Visitable;
import bonus.location.Location;
import bonus.location.utilities.SortByOpeningHour;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * city class which contains an array of locations
 */
public @Data
@EqualsAndHashCode
class City {
    private List<Location> locations = new ArrayList<>();

    public void displayFreeVisitableLocations() {
        List<Location> freeVisitableLocations = new ArrayList<>();

        for (Location location : locations) {
            if ((location instanceof Visitable) && !(location instanceof Payable))
                freeVisitableLocations.add(location);
        }

        freeVisitableLocations.sort(new SortByOpeningHour());

        for (Location location : freeVisitableLocations) {
            System.out.println(location);
        }
    }

    public void addLocation(Location location) {
        locations.add(location);
    }
}
