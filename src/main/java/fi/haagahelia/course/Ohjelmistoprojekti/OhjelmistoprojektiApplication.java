package fi.haagahelia.course.Ohjelmistoprojekti;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysely;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KyselyRepository;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.Vastaus;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.VastausRepository;


@SpringBootApplication
public class OhjelmistoprojektiApplication {

		private static final Logger log = LoggerFactory.getLogger(OhjelmistoprojektiApplication.class);
		public static void main(String[] args) {
			SpringApplication.run(OhjelmistoprojektiApplication.class, args);
		}
		
		@Bean
		public CommandLineRunner kyselyDemo(KyselyRepository repository) {
			return (args) -> {
				log.info("tallennetaan muutama kysely");
				repository.save(new Kysely( "Millainen oli ensikosketuksesi Helgan tutortoimintaan?"));
				repository.save(new Kysely( "Mihin olet ollut tyytyväinen tutortoiminnassa?"));
				repository.save(new Kysely( "Missä olisi parantamisen varaa?"));
				repository.save(new Kysely( "Oletko kiinnostunut toimimaan Helgan tutorina? Jos, niin miksi?"));
				repository.save(new Kysely( "Millaisessa tilanteessa olet tarvinnut tutorilta apua?"));
				
					
				
				log.info("hae kaikki kyselyt");
				for (Kysely kysely : repository.findAll()) {
					log.info(kysely.toString());
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

					
	

