/*package fi.haagahelia.course.Ohjelmistoprojekti.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vastattu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vastattuId;
	
	@ManyToOne
	@JoinColumn(name = "vastausid")
	private Vastaus vastaus;
	
	@ManyToOne
	@JoinColumn(name = "vastausvaihtoehtoid")
	private VastausVaihtoehto vastausvaihtoehto;
	
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


	@Override
	public String toString() {
		return "Vastattu [vastattuId=" + vastattuId + ", vastaus=" + vastaus + ", vastausvaihtoehto="
				+ vastausvaihtoehto + "]";
	}

	
	
	
	
}*/
