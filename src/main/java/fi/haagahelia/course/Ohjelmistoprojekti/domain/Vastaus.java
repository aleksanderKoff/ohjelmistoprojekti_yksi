package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;




@Entity
public class Vastaus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vastausid;
	private String vastausteksti;
	
	
	@ManyToOne
	@JoinColumn(name = "kysymysid")
	private Kysymys kysymys;
	


	
	public Vastaus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vastaus(Long vastausid, String vastausteksti, Kysymys kysymys) {
		super();
		this.vastausid = vastausid;
		this.vastausteksti = vastausteksti;
	}

	public Long getVastausid() {
		return vastausid;
	}

	public void setVastausid(Long vastausid) {
		this.vastausid = vastausid;
	}

	public String getVastausteksti() {
		return vastausteksti;
	}

	public void setVastaus(String vastausteksti) {
		this.vastausteksti = vastausteksti;
	}
	
	public Kysymys getKysymys() {
		return kysymys;
	}

	public void setKysymys(Kysymys kysymys) {
		this.kysymys = kysymys;
	}

	@Override
	public String toString() {
		return "Vastaus [vastausid=" + vastausid + ", vastausteksti=" + vastausteksti + ", kysymys="
				+ kysymys + "]";
	}


	
	
	
}
