package compulsory.location;

public class Hotel extends AbstractLocation implements Payable,Visitable{
    private Schedule schedule;
    private int payment;

    @Override
    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public int getPayment() {
        return this.payment;
    }

    @Override
    public void isLocation() {
        // is location
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
