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
	private String tyyppi;
	
	@ManyToOne
	@JoinColumn(name = "kyselyid")
	private Kysely kysely;
	
	
	public Kysymys() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Kysymys(String kysymys, String osio,String tyyppi, Kysely kysely) {
		this.kysymys = kysymys;
		this.osio = osio;
		this.kysely = kysely;
		this.tyyppi = tyyppi;
		
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
	
	public String getTyyppi(String tyyppi) {
		return tyyppi;
		
	}
	
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public Kysely getKysely() {
		return kysely ;
	}
	
	public void setKysely(Kysely kysely) {
		this.kysely = kysely;
	}
	
	@Override
	public String toString() {
		if (this.kysely !=null)
		return "Kysymys [id=" + id + " kysymys=" + kysymys + " osio=" + osio + " tyyppi=" + tyyppi +" kysely=" + this.getKysely() + "]";
		else
		return "Kysymys [id=" + id + " kysymys=" + kysymys + " osio=" + osio + " tyyppi=" + tyyppi +"]";
	}

}
