package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class VastausVaihtoehto {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	private String vastausvaihtoehto;	
	
	@JsonIgnore
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "kysymysid")
	private Kysymys kysymys;
	
	public VastausVaihtoehto() {
		super();
	}

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
		return "VastausVaihtoehto [id=" + vastausvaihtoehtoId + ", vastausvaihtoehto=" + vastausvaihtoehto + ", kysymys=" + kysymys
				+ "]";
	}
	
	
	
}
