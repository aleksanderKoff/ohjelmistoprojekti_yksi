package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Kysymys {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String kysymys;
	private String osio;
	private String kysymys_teksti_lyhyt;
	private String kysymys_teksti_pitka;
	private String monivalinta;
	
	@ManyToOne
	@JoinColumn(name = "kyselyid")
	private Kysely kysely;
	
	
	public Kysymys() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Kysymys(String kysymys, String osio, Kysely kysely) {
		this.kysymys = kysymys;
		this.osio = osio;
		this.kysely = kysely;
	}


	public String getKysymys() {
		return kysymys;
	}

	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}

	
	public String getOsio() {
		return osio;
	}

	public void setOsio(String osio) {
		this.osio = osio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

	public String getKysymys_teksti_lyhyt() {
		return kysymys_teksti_lyhyt;
	}

	public void setKysymys_teksti_lyhyt(String kysymys_teksti_lyhyt) {
		this.kysymys_teksti_lyhyt = kysymys_teksti_lyhyt;
	}

	public String getKysymys_teksti_pitka() {
		return kysymys_teksti_pitka;
	}

	public void setKysymys_teksti_pitka(String kysymys_teksti_pitka) {
		this.kysymys_teksti_pitka = kysymys_teksti_pitka;
	}

	public String getMonivalinta() {
		return monivalinta;
	}

	public void setMonivalinta(String monivalinta) {
		this.monivalinta = monivalinta;
	}

	@Override
	public String toString() {
		return "Kysymys [id=" + id + ", kysymys=" + kysymys + ", osio=" + osio + ", kysymys_teksti_lyhyt="
				+ kysymys_teksti_lyhyt + ", kysymys_teksti_pitka=" + kysymys_teksti_pitka + ", monivalinta="
				+ monivalinta + ", kysely=" + kysely + "]";
	}

}
