package compulsory.location;

/**
 * type of location : museum
 */
public class Museum extends AbstractLocation implements Visitable,Payable{
    private int payment;
    private Schedule schedule;

    @Override
    public void isLocation() {

    }

    @Override
    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public int getPayment() {
        return this.payment;
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
