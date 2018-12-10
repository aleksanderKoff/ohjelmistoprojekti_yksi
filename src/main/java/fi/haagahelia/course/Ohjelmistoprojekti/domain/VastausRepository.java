package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VastausRepository extends CrudRepository<Vastaus, Long> {
	
	Optional<Vastaus> findById(Long id);
}