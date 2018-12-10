/*package fi.haagahelia.course.Ohjelmistoprojekti.domain;


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
public class Vastattu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vastattuId;
	private List<Vastattu> vastattuja;
	
	@ManyToOne
	@JoinColumn(name = "vastausid")
	private Vastaus vastaus;
	
	@ManyToOne
	@JoinColumn(name = "vastausvaihtoehtoid")
	private VastausVaihtoehto vastausvaihtoehto;
	
	public Vastattu () {}
	
	public Vastattu(Long vastattuId, Vastaus vastaus, VastausVaihtoehto vastausvaihtoehto){
		super();
		this.vastattuId = vastattuId;
		this.vastaus = vastaus;
		this.vastausvaihtoehto = vastausvaihtoehto;
	}


	public Vastaus getVastaus() {
		return vastaus;
	}


	public void setVastaus(Vastaus vastaus) {
		this.vastaus = vastaus;
	}


	public VastausVaihtoehto getVastausvaihtoehto() {
		return vastausvaihtoehto;
	}


	public void setVastausvaihtoehto(VastausVaihtoehto vastausvaihtoehto) {
		this.vastausvaihtoehto = vastausvaihtoehto;
	}
	
	


	public List<Vastattu> getVastattuja() {
		return vastattuja;
	}

	public void setVastattuja(List<Vastattu> vastattuja) {
		this.vastattuja = vastattuja;
	}

	@Override
	public String toString() {
		return "Vastattu [vastattuId=" + vastattuId + ", vastaus=" + vastaus + ", vastausvaihtoehto="
				+ vastausvaihtoehto + "]";
	}

	
	
	
	
}*/
