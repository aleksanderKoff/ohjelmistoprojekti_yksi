package fi.haagahelia.course.Ohjelmistoprojekti.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import fi.haagahelia.course.Ohjelmistoprojekti.domain.Vastaus;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausRepository;



@CrossOrigin
@Controller
public class VastausController {
	
	
@Autowired
private VastausRepository vastausrepository;

//RESTful Kaikkien vastausten haku
@RequestMapping(value="/vastaus", method = RequestMethod.GET)
public @ResponseBody List<Vastaus> vastausListRest() {	
  return (List<Vastaus>) vastausrepository.findAll();
}    


//RESTful Vastausten haku ID:llä
@RequestMapping(value="/vastaus/{vastausid}", method = RequestMethod.GET)
public @ResponseBody Optional<Vastaus> findVastausRest(@PathVariable("vastausid") Long vastausid) {	
	return vastausrepository.findById(vastausid);
}	



// tallentaa vastaukset
/*
@RequestMapping(value = "/save", method = RequestMethod.POST)
public @ResponseBody List<Vastaus> save(@RequestBody Vastaus vastaus){
	System.out.println("JSONista tullut vastaus " + vastaus);
    vastausrepository.save(vastaus);
    return (List<Vastaus>) vastausrepository.findAll();
}    */

@RequestMapping(value = "/save", method = RequestMethod.POST)
public String save(Vastaus vastaus){
    vastausrepository.save(vastaus);
    return "redirect:vastaus";
}


	//Annotaatio varmistaa, että HTTP pyyntö /kysely kartoiteaan vastaus() metodin 
		@CrossOrigin(origins = "http://localhost:8080")
		   @GetMapping("/kysely")
		   public Vastaus greeting(@RequestParam(required=false, defaultValue="World") String name) {
		   System.out.println("Vastaus post-test");
		   return new Vastaus();
}
}

