package deliverytask.api;

import deliverytask.api.boundaries.BookDeliveryInfoBoundary;
import deliverytask.api.boundaries.FormattedAddressBoundary;
import deliverytask.api.boundaries.SearchTermBoundary;
import deliverytask.data.Address;
import deliverytask.data.Delivery;
import deliverytask.data.Timeslot;
import deliverytask.logic.DeliveriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

public class DeliveriesController {

    private DeliveriesService service;

    @Autowired
    public DeliveriesController(DeliveriesService service) {
        this.service = service;
    }

    /*
    POST /resolve-address - resolves a single line address into a structured one (See 'Address' model)
    {
     “searchTerm”: {SINGLE LINE ADDRESS}
    }
    */
    @RequestMapping(
            path ="/resolve-address",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Address resolveAddress(@RequestBody SearchTermBoundary searchTerm) {
        return this.service.resolveAddress(searchTerm);
    }

    /*
    POST /timeslots - retrieve all available timeslots (See ‘Timeslot’ model) for a formatted address
    {
     “address”: {FORMATTED ADDRESS}
    }
    */
    @RequestMapping(
            path ="/timeslots",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Timeslot[] retrieveAllAvailableTimeslots(FormattedAddressBoundary address) {
        return this.service
                .retrieveAllAvailableTimeslots(address)
                .toArray(new Timeslot[0]);
    }

    /*
    POST /deliveries - book a delivery
    {
     “user”: {USER},
     “timeslotId”: {TIMESLOT_ID}
    }
    */
    @RequestMapping(
            path ="/deliveries",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object bookDelivery(BookDeliveryInfoBoundary bookDeliveryInfo) {
        return this.service.bookDelivery(bookDeliveryInfo);
    }

    /*
    POST /deliveries/{DELIVERY_ID}/complete - mark a delivery as completed
    */
    @RequestMapping(
            path ="/deliveries/{DELIVERY_ID}/complete",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object deliveryCompleted(@PathVariable("DELIVERY_ID") String deliveryId) {
        return this.service.deliveryCompleted(deliveryId);
    }

    /*
    DELETE /deliveries/{DELIVERY_ID} - cancel a delivery
    */
    @RequestMapping(
            path = "/deliveries/{DELIVERY_ID}",
            method = RequestMethod.DELETE)
    public void cancelDelivery(@PathVariable("DELIVERY_ID") String deliveryId) {
        this.service.cancelDelivery(deliveryId);
    }

    /*
    GET /deliveries/daily - retrieve all today’s deliveries
    */
    @RequestMapping(
            path = "/deliveries/daily",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Delivery[] retrieveAllTodayDeliveries() {
        return this.service
                .retrieveAllTodayDeliveries()
                .toArray(new Delivery[0]);
    }

    /*
    GET /deliveries/weekly - retrieve the deliveries for current week
    */
    @RequestMapping(
            path = "/deliveries/weekly",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Delivery[] retrieveAllCurrentWeekDeliveries() {
        return this.service
                .retrieveAllCurrentWeekDeliveries()
                .toArray(new Delivery[0]);
    }

}
