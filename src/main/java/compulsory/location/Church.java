package compulsory.location;

public class Church extends AbstractLocation implements Visitable{
    private int rank;
    private Schedule schedule;


    @Override
    public void isLocation() {

    }

    @Override
    public void setSchedule(Schedule locationSchedule) {
        this.schedule = locationSchedule;
    }

    @Override
    public Schedule getSchedule() {
        return this.schedule;
    }
}
