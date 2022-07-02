package deliverytask.data;

public class Delivery {

    String id;
    String status;
    String timeslotId;

    public Delivery() {
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", timeslotId='" + timeslotId + '\'' +
                '}';
    }
}
