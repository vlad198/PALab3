package compulsory.location;

public class Schedule {
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

    public int getOpeningHour() {
        return openingHour;
    }

    public int getOpeningMinute() {
        return openingMinute;
    }

    public int getClosingHour() {
        return closingHour;
    }

    public int getClosingMinute() {
        return closingMinute;
    }
}
