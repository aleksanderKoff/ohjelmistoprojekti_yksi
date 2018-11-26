package fi.haagahelia.course.Ohjelmistoprojekti.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.CrossOrigin;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.KyselyRepository;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysymys;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KysymysRepository;


import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
public class KysymysController {
	
@Autowired

private KysymysRepository kysymysrepository;



	
	// Etsi kaikki kysymykset

	@RequestMapping(value="/kysymykset", method = RequestMethod.GET)
	public @ResponseBody List<Kysymys> kysymysListRest() {	
		return (List<Kysymys>) kysymysrepository.findAll();
}

	// Etsi kysymys ID:llä
	@RequestMapping(value="/kysymys/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Kysymys> findKysymysRest(@PathVariable("id") Long id) {
		return kysymysrepository.findById(id);
	}
	
	
}