package deliverytask.data;

import java.util.Date;
import java.util.Set;

public class Timeslot {

    Date startTime;
    Date endTime;
    Set<String> supportedCities;
    Set<String> deliveriesIds;

    public Timeslot() {
    }

    @Override
    public String toString() {
        return "Timeslot{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", supportedCities=" + supportedCities +
                ", deliveriesIds=" + deliveriesIds +
                '}';
    }
}
