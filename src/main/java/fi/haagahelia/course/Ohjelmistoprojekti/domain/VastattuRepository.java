package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface VastattuRepository extends CrudRepository<Vastattu, Long> {
	
	Optional<Vastattu> findById(Long vastattuId);

}
