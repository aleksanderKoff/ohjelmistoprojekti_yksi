package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vastattu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long vastattuId;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vastaus")
	private List<Vastaus> vastaukset;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "vastausvaihtoehto")
	private List<VastausVaihtoehto> vastausvaihtoehdot;

	public List<Vastaus> getVastaukset() {
		return vastaukset;
	}

	public void setVastaukset(List<Vastaus> vastaukset) {
		this.vastaukset = vastaukset;
	}

	public List<VastausVaihtoehto> getVastausvaihtoehdot() {
		return vastausvaihtoehdot;
	}

	public void setVastausvaihtoehdot(List<VastausVaihtoehto> vastausvaihtoehdot) {
		this.vastausvaihtoehdot = vastausvaihtoehdot;
	}

	@Override
	public String toString() {
		return "Vastattu [vastattuId=" + vastattuId + ", vastaukset=" + vastaukset + ", vastausvaihtoehdot="
				+ vastausvaihtoehdot + "]";
	}
	
	
	
}
