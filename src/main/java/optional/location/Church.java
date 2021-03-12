package optional.location;

import lombok.Data;
import lombok.EqualsAndHashCode;
import optional.interfaces.Visitable;
import optional.location.utilities.Schedule;

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

