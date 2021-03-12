package optional.interfaces;

import optional.location.utilities.Schedule;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;

/**
 * interface for visitable locations
 */
public interface Visitable {
    public void setSchedule(Schedule locationSchedule);

    public Schedule getSchedule();

    /**
     * This function calculates how long a location is opened during a day.
     * @param a the location given
     * @return a Duration object representing how long the given location is visitable.
     */
    public static Duration getVisitingDuration(Visitable a) {
        Schedule locationSchedule = a.getSchedule();

        Temporal openingTime = LocalTime.of(locationSchedule.getOpeningHour(),locationSchedule.getOpeningMinute());
        Temporal closingTime = LocalTime.of(locationSchedule.getClosingHour(),locationSchedule.getClosingMinute());

        return Duration.between(openingTime, closingTime);
    }

    public default int defaultOpeningHour() {
        return 9;
    }

    public default int defaultOpeningMinute() {
        return 30;
    }

    public default int defaultClosingHour() {
        return 20;
    }

    public default int defaultClosingMinute() {
        return 0;
    }

    public default Schedule defaultSchedule() {
        return new Schedule(9, 30, 20, 0);
    }
}
