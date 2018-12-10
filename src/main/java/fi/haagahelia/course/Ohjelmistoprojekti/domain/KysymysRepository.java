package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface KysymysRepository extends CrudRepository<Kysymys, Long> {
	
	Optional<Kysymys> findByKysymysteksti(String kysymysteksti);
}
