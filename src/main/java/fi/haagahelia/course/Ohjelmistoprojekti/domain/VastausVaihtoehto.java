package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VastausVaihtoehto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String vastausvaihtoehto;	
	
	@ManyToOne
	@JoinColumn(name = "kysymysid")
	private Kysymys kysymys;
	
	

	public VastausVaihtoehto(String vastausvaihtoehto, Kysymys kysymys) {
		super();
		
		this.vastausvaihtoehto = vastausvaihtoehto;
		this.kysymys = kysymys;
	}

	public String getVastausvaihtoehto() {
		return vastausvaihtoehto;
	}

	public void setVastausvaihtoehto(String vastausvaihtoehto) {
		this.vastausvaihtoehto = vastausvaihtoehto;
	}

	public Kysymys getKysymys() {
		return kysymys;
	}

	public void setKysymys(Kysymys kysymys) {
		this.kysymys = kysymys;
	}

	@Override
	public String toString() {
		return "VastausVaihtoehto [id=" + id + ", vastausvaihtoehto=" + vastausvaihtoehto + ", kysymys=" + kysymys
				+ "]";
	}
	
	
	
}
