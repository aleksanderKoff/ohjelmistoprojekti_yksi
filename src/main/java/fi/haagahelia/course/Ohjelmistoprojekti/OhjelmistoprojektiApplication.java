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
		public CommandLineRunner kyselyDemo(KysymysRepository repository, KyselyRepository krepository, VastausRepository vrepository, VastausVaihtoehtoRepository vvrepository) {
			return (args) -> {
				log.info("tallennetaan muutama kysely");
				
				Kysely tutor = new Kysely("tutor", "tutoritoiminnan kysely");
	            krepository.save(tutor);
				
				repository.save(new Kysymys( "Millaisissa tilanteissa olet saanut tutorilta apua?", tutor));
				repository.save(new Kysymys( "Oletko kiinnostunut toimimaan Helgan tutorina?", tutor));	
				repository.save(new Kysymys( "Kuinka tyytyväinen olit ryhmäytymiseen orientaatioviikolla?", tutor));
				repository.save(new Kysymys( "Miten tutorit auttoivat ryhmäytymisessä?", tutor));
				repository.save(new Kysymys( "Millaiset opiskelijatapahtumat kiinnostavat sinua?", tutor));
				repository.save(new Kysymys( "Kuinka tyytyväinen olit tutorien järjestämään perehdytysprosessiin?", tutor));
				repository.save(new Kysymys( "Missä olisit tarvinnut enemmän tukea tutoreilta?", tutor));
				
				log.info("hae kaikki kyselyt");
				for (Kysymys kysymys : repository.findAll()) {
					log.info(kysymys.toString());
				}
				};
		}
				
				
		@Bean
		public CommandLineRunner vastausDemo(VastausRepository repository) {
			return (args) -> {
				log.info("tallenna vastauksia");
				repository.save(new Vastaus());

				
					
				
				log.info("hakee kaikki vastaukset");
				for (Vastaus vastaus : repository.findAll()) {
					log.info(vastaus.toString());
				
				
				}};	
		} 

		
			/*	@Bean
				public CommandLineRunner vastausvaihtoehtoDemo(VastausVaihtoehtoRepository vvrepository) {
				return (args) -> {
					log.info("tallenna vastausvaihtoehtoja");
					vvrepository.save(new VastausVaihtoehto());
			
					vvrepository.save(new VastausVaihtoehto( "Missä olisit tarvinnut enemmän tukea tutoreilta?", tutor));
						
					
					log.info("hakee kaikki vastausvaihtoehdot");
					for (VastausVaihtoehto vastausvaihtoehto : vvrepository.findAll()) {
						log.info(vastausvaihtoehto.toString());
					
					}};	
					}*/
					
					}

					
	

