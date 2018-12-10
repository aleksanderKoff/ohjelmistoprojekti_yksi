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
		public CommandLineRunner kyselyDemo(KysymysRepository kysrepository, KyselyRepository krepository, VastausRepository vrepository, VastausVaihtoehtoRepository vvrepository) {
			return (args) -> {
				log.info("tallennetaan muutama kysely");
				
				Kysely tutor = new Kysely("tutor", "tutoritoiminnan kysely");
	            krepository.save(tutor);
				

	            kysrepository.save(new Kysymys( "Ikä", "Henkilötiedot", tutor, true, false, false));
	            vvrepository.save(new VastausVaihtoehto("18-23v", kysrepository.findByKysymysteksti("Ikä").get(0)));
	            vvrepository.save(new VastausVaihtoehto("24-30v", kysrepository.findByKysymysteksti("Ikä").get(0)));
	            vvrepository.save(new VastausVaihtoehto("31-35v", kysrepository.findByKysymysteksti("Ikä").get(0)));
	            vvrepository.save(new VastausVaihtoehto("yli 35v", kysrepository.findByKysymysteksti("Ikä").get(0)));
	            
	            kysrepository.save(new Kysymys( "Sukupuoli", "Henkilötiedot", tutor, true, false, false));	
	            vvrepository.save(new VastausVaihtoehto("Nainen", kysrepository.findByKysymysteksti("Sukupuoli").get(0)));
	            vvrepository.save(new VastausVaihtoehto("Mies", kysrepository.findByKysymysteksti("Sukupuoli").get(0)));
	            vvrepository.save(new VastausVaihtoehto("Muu", kysrepository.findByKysymysteksti("Sukupuoli").get(0)));
	            vvrepository.save(new VastausVaihtoehto("En halua kertoa", kysrepository.findByKysymysteksti("Sukupuoli").get(0)));

	            kysrepository.save(new Kysymys( "Koulutusohjelma", "Henkilötiedot", tutor, false, false, true));
	            kysrepository.save(new Kysymys( "Kuinka tyytyväinen olet ollut Helgan tutortoimintaan?", "Yleistä tutortoiminnasta",  tutor, true, false, false));
	            kysrepository.save(new Kysymys( "Millaisissa tilanteissa olet saanut tutorilta apua?", "Yleistä tutortoiminnasta", tutor, false, true, false));
	            kysrepository.save(new Kysymys( "Oletko kiinnostunut toimimaan Helgan tutorina? ", "Yleistä tutortoiminnasta", tutor, true, false, false));
	            
	            kysrepository.save(new Kysymys( "Kuinka tyytyväinen olit ryhmäytymiseen orientaatioviikolla?", "Ryhmäytyminen", tutor, true, false, false));
	            kysrepository.save(new Kysymys( "Miten tutorit auttoivat ryhmäytymisessä? ", "Ryhmäytyminen", tutor));
	            kysrepository.save(new Kysymys( "Millaiset opiskelijatapahtumat kiinnostavat sinua?", "Ryhmäytyminen", tutor));
	            kysrepository.save(new Kysymys( "Kuinka tyytyväinen olit tutorien järjestämään perehdytysprosessiin?", "Koulun opiskelutyökalujen käyttö", tutor));
	            
	            kysrepository.save(new Kysymys( "Missä olisit tarvinnut enemmän tukea tutoreilta?", "Koulun opiskelutyökalujen käyttö", tutor, false ,false, false));

	            //Luodaan uusi kysymys_________tyyppi, ja talletetaan se repoon
	            
	            
	            //Testi
	            
				
				log.info("hae kaikki kyselyt");
				for (Kysymys kysymys : kysrepository.findAll()) {
					log.info(kysymys.toString());
				}
				};
		}
				
				
		@Bean
		public CommandLineRunner vastausDemo(VastausRepository vrepository, KysymysRepository kysrepository) {
			return (args) -> {
				log.info("tallenna vastauksia");
				//vrepository.save(new Vastaus());

				//vrepository.save(new Vastaus("Mies", kysrepository.findByKysymys("Sukupuoli").get(0)));
					
				
				log.info("hakee kaikki vastaukset");
				for (Vastaus vastaus : vrepository.findAll()) {
					log.info(vastaus.toString());
				
				
				}};	
		} 

		/*
				@Bean
				public CommandLineRunner vastausvaihtoehtoDemo(VastausVaihtoehtoRepository vvrepository, KysymysRepository kysrepository, KyselyRepository krepository) {
				return (args) -> {
					log.info("tallenna vastausvaihtoehtoja");
					vvrepository.save(new VastausVaihtoehto());
			
					vvrepository.save(new VastausVaihtoehto());
						
					
					log.info("hakee kaikki vastausvaihtoehdot");
					for (VastausVaihtoehto vastausvaihtoehto : vvrepository.findAll()) {
						log.info(vastausvaihtoehto.toString());
					
					}};	
					}*/
					
					}

					
	

