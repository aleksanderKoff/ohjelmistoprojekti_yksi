package fi.haagahelia.course.Ohjelmistoprojekti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.CrossOrigin;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysely;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KyselyRepository;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
public class KyselyController {
	
@Autowired

private KyselyRepository repository;
	
	// Etsi kaikki kysymykset

	@RequestMapping(value="/kyselyt", method = RequestMethod.GET)
	public @ResponseBody List<Kysely> kyselyListRest() {	
		return (List<Kysely>) repository.findAll();
}

	// Etsi kysymys ID:llä
	@RequestMapping(value="/kysely/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Kysely> findKyselyRest(@PathVariable("id") Long id) {
		return repository.findById(id);
	}
}
