package fi.haagahelia.course.Ohjelmistoprojekti;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysymys;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KysymysRepository;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.Vastaus;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausRepository;


@SpringBootApplication
public class OhjelmistoprojektiApplication {

		private static final Logger log = LoggerFactory.getLogger(OhjelmistoprojektiApplication.class);
		public static void main(String[] args) {
			SpringApplication.run(OhjelmistoprojektiApplication.class, args);
		}
		
		@Bean
		public CommandLineRunner kyselyDemo(KysymysRepository repository) {
			return (args) -> {
				log.info("tallennetaan muutama kysely");
				repository.save(new Kysymys( "Millainen oli ensikosketuksesi Helgan tutortoimintaan?"));
				repository.save(new Kysymys( "Mihin olet ollut tyytyväinen tutortoiminnassa?"));
				repository.save(new Kysymys( "Missä olisi parantamisen varaa?"));
				repository.save(new Kysymys( "Oletko kiinnostunut toimimaan Helgan tutorina? Jos, niin miksi?"));
				repository.save(new Kysymys( "Millaisessa tilanteessa olet tarvinnut tutorilta apua?"));
				
					
				
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
						
						}
					};
				}}

					
	

