package bonus.location.utilities;

import bonus.interfaces.Visitable;
import bonus.location.Location;

import java.util.Comparator;

public class SortByOpeningHour implements Comparator<Location> {
    public int compare(Location a, Location b)
    {
        Visitable v1 = (Visitable) a,v2=(Visitable) b;
        return v1.getSchedule().compareTo(v2.getSchedule());
    }
}
