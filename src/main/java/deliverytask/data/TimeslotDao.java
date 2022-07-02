package deliverytask.data;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimeslotDao extends PagingAndSortingRepository<Timeslot, String> {
}
