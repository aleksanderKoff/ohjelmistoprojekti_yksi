package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

public interface KyselyRepository extends CrudRepository<Kysely, Long> {
	
	Optional<Kysely> findById(Long id);
}
