package deliverytask.logic;

import deliverytask.api.boundaries.BookDeliveryInfoBoundary;
import deliverytask.api.boundaries.FormattedAddressBoundary;
import deliverytask.api.boundaries.SearchTermBoundary;
import deliverytask.data.Address;
import deliverytask.data.Delivery;
import deliverytask.data.Timeslot;

import java.util.List;

public interface DeliveriesService {

    public Address resolveAddress(SearchTermBoundary searchTerm);
    public List<Timeslot> retrieveAllAvailableTimeslots(FormattedAddressBoundary address);
    public Object bookDelivery(BookDeliveryInfoBoundary bookDeliveryInfo);
    public Object deliveryCompleted(String deliveryId);
    public void cancelDelivery(String deliveryId);
    public List<Delivery> retrieveAllTodayDeliveries();
    public List<Delivery> retrieveAllCurrentWeekDeliveries();

}
