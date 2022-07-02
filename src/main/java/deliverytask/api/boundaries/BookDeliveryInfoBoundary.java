package deliverytask.api.boundaries;

public class BookDeliveryInfoBoundary {

    String user;
    String timeslotId;

    public BookDeliveryInfoBoundary() {}

    public String getUser() {
        return user;
    }

    public BookDeliveryInfoBoundary setUser(String user) {
        this.user = user;
        return this;
    }

    public String getTimeslotId() {
        return timeslotId;
    }

    public BookDeliveryInfoBoundary setTimeslotId(String timeslotId) {
        this.timeslotId = timeslotId;
        return this;
    }

    @Override
    public String toString() {
        return "BookDeliveryInfoBoundary{" +
                "user='" + user + '\'' +
                ", timeslotId='" + timeslotId + '\'' +
                '}';
    }
}
