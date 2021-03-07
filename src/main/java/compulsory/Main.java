package compulsory;

import compulsory.location.*;

public class Main {
    public static void main(String[] args) {
        // problem locations

        Hotel v1 = new Hotel();
        Museum v2 = new Museum();
        Museum v3 = new Museum();
        Church v4 = new Church();
        Church v5 = new Church();
        Restaurant v6 = new Restaurant();

        // city locations
        City city = new City();
        city.addLocation(v1);
        city.addLocation(v2);
        city.addLocation(v3);
        city.addLocation(v4);
        city.addLocation(v5);
        city.addLocation(v6);

        //  locations cost

        v1.setCost(v2,10);
        v1.setCost(v3,50);
        v2.setCost(v3,20);
        v3.setCost(v2,20);
        v2.setCost(v4,20);
        v2.setCost(v5,10);
        v3.setCost(v4,20);
        v4.setCost(v5,30);
        v5.setCost(v4,30);
        v4.setCost(v6,10);
        v5.setCost(v6,20);

    }
}
