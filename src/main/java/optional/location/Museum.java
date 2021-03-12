package optional.location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import optional.interfaces.Payable;
import optional.interfaces.Visitable;
import optional.location.utilities.Schedule;

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
