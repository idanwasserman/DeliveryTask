package deliverytask.logic;

import deliverytask.api.boundaries.BookDeliveryInfoBoundary;
import deliverytask.api.boundaries.FormattedAddressBoundary;
import deliverytask.api.boundaries.SearchTermBoundary;
import deliverytask.data.*;

import javax.annotation.PostConstruct;
import java.util.List;

public class DeliveriesServiceJpa implements DeliveriesService {

    private DeliveryDao deliveryDao;
    private TimeslotDao timeslotDao;

    @PostConstruct
    public void DeliveriesServiceJpa(DeliveryDao deliveryDao, TimeslotDao timeslotDao) {
        this.deliveryDao = deliveryDao;
        this.timeslotDao = timeslotDao;
    }

    @Override
    public Address resolveAddress(SearchTermBoundary searchTerm) {
        return null;
    }

    @Override
    public List<Timeslot> retrieveAllAvailableTimeslots(FormattedAddressBoundary address) {
        return null;
    }

    @Override
    public Object bookDelivery(BookDeliveryInfoBoundary bookDeliveryInfo) {
        return null;
    }

    @Override
    public Object deliveryCompleted(String deliveryId) {
        return null;
    }

    @Override
    public void cancelDelivery(String deliveryId) {

    }

    @Override
    public List<Delivery> retrieveAllTodayDeliveries() {
        return null;
    }

    @Override
    public List<Delivery> retrieveAllCurrentWeekDeliveries() {
        return null;
    }
}
