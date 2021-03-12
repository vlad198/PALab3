package bonus.location;

import bonus.interfaces.Visitable;
import bonus.location.utilities.Schedule;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * type of location : church
 */

@EqualsAndHashCode(callSuper = true)
public @Data
class Church extends Location implements Visitable {
    private int rank;
    private Schedule schedule;

    @Override
    public void isLocation() {
    }
}

