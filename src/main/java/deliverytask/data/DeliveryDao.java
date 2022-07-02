package deliverytask.data;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface DeliveryDao extends PagingAndSortingRepository<Delivery, String> {
}
