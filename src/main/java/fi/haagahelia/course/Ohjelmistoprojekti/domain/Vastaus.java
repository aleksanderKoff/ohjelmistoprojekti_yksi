package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Vastaus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String vastaus;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vastaus")
	private List<Vastaus> vastaukset;
	
	public Vastaus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vastaus(Long id, String vastaus) {
		super();
		this.id = id;
		this.vastaus = vastaus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVastaus() {
		return vastaus;
	}

	public void setVastaus(String vastaus) {
		this.vastaus = vastaus;
	}

	@Override
	public String toString() {
		return "Vastaus [id=" + id + ", vastaus=" + vastaus + "]";
	}
	
	
	
	
}
