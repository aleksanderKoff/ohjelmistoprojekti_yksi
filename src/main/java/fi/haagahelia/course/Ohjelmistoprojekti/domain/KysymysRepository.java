package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface KysymysRepository extends CrudRepository<Kysymys, Long> {
	
	Optional<Kysymys> findById(Long id);
}
