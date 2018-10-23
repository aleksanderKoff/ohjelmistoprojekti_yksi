package fi.haagahelia.course.Ohjelmistoprojekti;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.haagahelia.course.Ohjelmistoprojekti.domain.Kysely;
import fi.haagahelia.course.Ohjelmistoprojekti.domain.KyselyRepository;

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
				repository.save(new Kysely( "Ootko tutor?"));
				repository.save(new Kysely( "Ootko homo?"));
				
					
				
				log.info("hae kaikki kyselyt");
				for (Kysely kysely : repository.findAll()) {
					log.info(kysely.toString());
				}

			};
		}
}
			
		
	

