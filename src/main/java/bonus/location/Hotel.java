package bonus.location;

import bonus.interfaces.Payable;
import bonus.interfaces.Visitable;
import bonus.location.utilities.Schedule;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * type of location : hotel
 */
@EqualsAndHashCode(callSuper = true)
public @Data
class Hotel extends Location implements Payable, Visitable {
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
