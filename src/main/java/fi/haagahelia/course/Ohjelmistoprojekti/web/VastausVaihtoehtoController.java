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

import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausVaihtoehto;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausVaihtoehtoRepository;

@Controller
public class VastausVaihtoehtoController {
	
@Autowired
private VastausVaihtoehtoRepository vvrepository;

//RESTful Kaikkien vastausvaihtoehtojen haku
@RequestMapping(value="/vastausvaihtoehto", method = RequestMethod.GET)
public @ResponseBody List<VastausVaihtoehto> vastausvaihtoehtoListRest() {	
  return (List<VastausVaihtoehto>) vvrepository.findAll();
}    

//RESTful Vastaustvaihtoehtojen haku ID:llä
@RequestMapping(value="/vastausvaihtoehto/{id}", method = RequestMethod.GET)
public @ResponseBody Optional<VastausVaihtoehto> findVastausVaihtoehtoRest(@PathVariable("id") Long id) {	
	return vvrepository.findById(id);
}	

//RESTful Vastausvaihtoehtojen tallennus
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody VastausVaihtoehto save(@RequestBody VastausVaihtoehto vastausvaihtoehto){
	    vvrepository.save(vastausvaihtoehto);
	    return vastausvaihtoehto;


}
	//Annotaatio varmistaa, että HTTP pyyntö /kysely kartoiteaan vastausvaihtoehto() metodin 
		@CrossOrigin(origins = "http://localhost:8080")
		   @GetMapping("/kysely")
		   public VastausVaihtoehto greeting(@RequestParam(required=false, defaultValue="World") String name) {
		   System.out.println("VastausVaihtoehto post-test");
		   return new VastausVaihtoehto();
}
}
