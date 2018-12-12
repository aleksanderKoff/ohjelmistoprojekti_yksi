/*package fi.haagahelia.course.Ohjelmistoprojekti.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.Vastattu;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastattuRepository;





	@CrossOrigin
	@Controller
	public class VastattuController {
		
		
	@Autowired
	private VastattuRepository vastatturepository;

	//RESTful Kaikkien vastattujen haku
	@RequestMapping(value="/vastattu", method = RequestMethod.GET)
	public @ResponseBody List<Vastattu> vastattuListRest() {	
	  return (List<Vastattu>) vastatturepository.findAll();
	}    
}*/
