package fi.haagahelia.course.Ohjelmistoprojekti;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysely;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KyselyRepository;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysymys;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KysymysRepository;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.Vastaus;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausRepository;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausVaihtoehto;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausVaihtoehtoRepository;


@SpringBootApplication
public class OhjelmistoprojektiApplication {

		private static final Logger log = LoggerFactory.getLogger(OhjelmistoprojektiApplication.class);
		public static void main(String[] args) {
			SpringApplication.run(OhjelmistoprojektiApplication.class, args);
		}
		
		@Bean
			return (args) -> {
				log.info("tallennetaan muutama kysely");
				
				Kysely tutor = new Kysely("tutor", "tutoritoiminnan kysely");
	            krepository.save(tutor);
				
				
				log.info("hae kaikki kyselyt");
					log.info(kysymys.toString());
				}
				};
		}
				
				
		@Bean
			return (args) -> {
				log.info("tallenna vastauksia");
				vrepository.save(new Vastaus());

					
				
				log.info("hakee kaikki vastaukset");
					log.info(vastaus.toString());
				
				
				}};	
		} 

				return (args) -> {
					log.info("tallenna vastausvaihtoehtoja");
					vvrepository.save(new VastausVaihtoehto());
			
						
					
					log.info("hakee kaikki vastausvaihtoehdot");
					for (VastausVaihtoehto vastausvaihtoehto : vvrepository.findAll()) {
						log.info(vastausvaihtoehto.toString());
					
					}};	
					}*/
					
					}

					
	

