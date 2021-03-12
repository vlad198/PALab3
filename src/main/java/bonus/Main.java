package bonus;

import bonus.city.City;
import bonus.location.Hotel;
import bonus.location.Location;
import bonus.location.Museum;
import bonus.travelPlan.TravelPlan;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel();
        v1.setName("v1");

        Museum v2 = new Museum();
        v2.setName("v2");

        Museum v3 = new Museum();
        v3.setName("v3");

        City city = new City();
        city.addLocation(v1);
        city.addLocation(v2);
        city.addLocation(v3);

        v1.setCost(v2, 10);
        v1.setCost(v3, 30);
        v2.setCost(v3, 20);
        v3.setCost(v2, 20);

        Vector<Location> priority = new Vector<>();
        priority.add(v1);
        priority.add(v3);
        priority.add(v2);

        TravelPlan travelPlan = new TravelPlan(city, priority);
        travelPlan.findShortestPath(v1,v3);
    }
}
