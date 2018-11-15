package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface VastausVaihtoehtoRepository extends CrudRepository<VastausVaihtoehto, Long>{

	Optional<VastausVaihtoehto> findById(Long id);
	
}
