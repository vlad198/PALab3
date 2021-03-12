package bonus.location;

import bonus.interfaces.Payable;
import bonus.interfaces.Visitable;
import bonus.location.utilities.Schedule;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * type of location : museum
 */
@EqualsAndHashCode(callSuper = true)
public @Data
class Museum extends Location implements Visitable, Payable {
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
