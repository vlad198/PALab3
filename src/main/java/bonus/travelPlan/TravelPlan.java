package bonus.travelPlan;

import bonus.city.City;
import bonus.location.Location;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Arrays;
import java.util.Vector;

/**
 * Travel Plan class for the problem
 * it contains a city and a vector of priorities
 * for the locations given
 */
public @Data
@EqualsAndHashCode
class TravelPlan {
    private City city;
    private Vector<Location> priority;

    /**
     * Constructor
     *
     * @param city     the city for the travel plan
     * @param priority the priority vector : locations needs to be in the order we would want to visit them
     */
    public TravelPlan(City city, Vector<Location> priority) {
        this.city = city;
        this.priority = priority;
    }

    /**
     * @param location the location for which we want to find the index in the priority vector
     * @return the index of the location in the priority vector
     */
    private int getIndexLocation(Location location) {
        for (int i = 0; i < priority.size(); i++)
            if (priority.get(i).equals(location))
                return i;
        return 0;
    }

    /**
     * initialise the vector of distances and parents
     * in dijkstra's algorithm for the first time
     *
     * @param indexStart start location
     * @param dist       vector of distances
     * @param parent     vector of parents to recreate the path
     */
    private void firstUpdateDist(int indexStart, int[] dist, int[] parent) {
        for (int i = 0; i < priority.size(); i++) {
            if (priority.get(indexStart).getCost().containsKey(priority.get(i))) {
                dist[i] = priority.get(indexStart).getCost().get(priority.get(i));
                parent[i] = indexStart;
            }
        }
        dist[indexStart] = 0;
        parent[indexStart] = -1;
    }

    /**
     * prints the solution of the problem
     *
     * @param parent vector of parents for the solution
     * @param index  the current index of the location we want to display
     */
    private void printSolution(int[] parent, int index) {
        if (parent[index] != -1) {
            printSolution(parent, parent[index]);
        }
        System.out.print(priority.get(index).getName() + " ");
    }

    /**
     * returns the index of an unvisited location
     * that have the current distance from the
     * start point to
     *
     * @param dist the vector of distances
     * @param viz  vector of visited locations
     * @return the index we want
     */
    private int getMinimumIndexDistUnvisited(int[] dist, boolean[] viz) {
        int minim = Integer.MAX_VALUE;
        int k = -1;

        for (int i = 0; i < priority.size(); i++) {
            if (!viz[i] && dist[i] < minim) {
                minim = dist[i];
                k = i;
            }
        }

        return k;
    }

    /**
     * This function finds the shortest path from the
     * start location to the finish location using
     * Dijkstra's algorithm according to the preferences
     *
     * @param start  start location
     * @param finish finish location
     */
    public void findShortestPath(Location start, Location finish) {
        int[] dist = new int[city.getLocations().size()];
        int[] parent = new int[dist.length];

        Arrays.fill(dist, Integer.MAX_VALUE);

        int indexStart = getIndexLocation(start), indexFinish = getIndexLocation(finish);

        firstUpdateDist(indexStart, dist, parent);

        boolean ok = true;
        boolean[] viz = new boolean[city.getLocations().size()];
        viz[indexStart] = true;

        while (ok) {
            int k = getMinimumIndexDistUnvisited(dist, viz);

            if (k != -1) {
                viz[k] = true;
                for (int i = 0; i < priority.size(); i++) {
                    int cost = priority.get(k).getCost().getOrDefault(priority.get(i), Integer.MAX_VALUE);

                    if (cost != Integer.MAX_VALUE && !viz[i] && (dist[i] > dist[k] + cost || (dist[i] == dist[k] + cost && i > k))) {
                        dist[i] = dist[k] + cost;
                        parent[i] = k;
                    }
                }
            } else ok = false;
        }

        System.out.println("Minimum cost from " + start.getName() +  " to " + finish.getName() + " is " + dist[indexFinish]);
        System.out.print("The path is : ");
        printSolution(parent, indexFinish);
    }
}
