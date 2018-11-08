package fi.haagahelia.course.Ohjelmistoprojekti.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import fi.haagahelia.course.Ohjelmistoprojekti.domain.Vastaus;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausRepository;



@Controller
public class VastausController {
	
@Autowired
private VastausRepository repository;

//RESTful Kaikkien vastausten haku
@RequestMapping(value="/vastaus", method = RequestMethod.GET)
public @ResponseBody List<Vastaus> vastausListRest() {	
  return (List<Vastaus>) repository.findAll();
}    

//RESTful Vastaustes haku ID:llä
@RequestMapping(value="/vastaus/{id}", method = RequestMethod.GET)
public @ResponseBody Optional<Vastaus> findVastausRest(@PathVariable("id") Long id) {	
	return repository.findById(id);
}	

//RESTful Vastausten tallennus
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(Vastaus vastaus){
	    repository.save(vastaus);
	    return "redirect:kysely";


}
	//Annotaatio varmistaa, että HTTP pyyntö /kysely kartoiteaan vastaus() metodiin 
		@CrossOrigin(origins = "http://localhost:8080")
		   @GetMapping("/kysely")
		   public Vastaus greeting(@RequestParam(required=false, defaultValue="World") String name) {
		   System.out.println("Vastaus post-test");
		   return new Vastaus();
}
}
