package optional.location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import optional.interfaces.Classifiable;
import optional.interfaces.Payable;
import optional.interfaces.Visitable;
import optional.location.utilities.Schedule;

/**
 * type of location : restaurant
 */
@EqualsAndHashCode(callSuper = true)
public @Data
class Restaurant extends Location implements Visitable, Payable, Classifiable {
    private int rank;
    private Schedule schedule;
    private int payment;

    @Override
    public void isLocation() {

    }

    @Override
    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public int getRank() {
        return this.rank;
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
