package optional.location.utilities;

import lombok.Data;

/**
 * schedule class for visitable locations
 */
public @Data
class Schedule implements Comparable<Schedule> {
    private final int openingHour;
    private final int openingMinute;
    private final int closingHour;
    private final int closingMinute;

    public Schedule(int openingHour, int openingMinute, int closingHour, int closingMinute) {
        this.openingHour = openingHour;
        this.openingMinute = openingMinute;
        this.closingHour = closingHour;
        this.closingMinute = closingMinute;
    }

    @Override
    public int compareTo(Schedule o) {
        return Integer.compare(openingHour, o.getOpeningHour());
    }
}
