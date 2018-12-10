package fi.haagahelia.course.Ohjelmistoprojekti.domain;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface KysymysRepository extends CrudRepository<Kysymys, Long> {
	
}
