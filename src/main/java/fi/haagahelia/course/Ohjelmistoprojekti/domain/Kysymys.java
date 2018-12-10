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
public class Kysymys {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long kysymysid;
	private String kysymysteksti;
	private String osio;
	private String kysymys_teksti_lyhyt;
	private String kysymys_teksti_pitka;
	private Boolean onRadio;
	private int monivalinta;
	
	//private List<VastausVaihtoehto> vaihtoehdot;
	
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "kysymys")
	private List<VastausVaihtoehto> vaihtoehdot;
	
	
	*/
	
	
	@ManyToOne
	@JoinColumn(name = "kyselyid")
	private Kysely kysely;
	
	
	
	public Kysymys() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//Tämä contstructori on Radiobutton kysymystyypeille
	//Boolean true = RadioButton
	//False = Checkbox
	public Kysymys(String kysymysteksti, String osio, Kysely kysely, boolean onRadio) {
		
	
		this.kysymysteksti = kysymysteksti;
		this.osio = osio;
		this.kysely = kysely;
		this.onRadio = onRadio;
		//this.vaihtoehdot = vaihtoehdot;
		

	}
	
	//Tämä contstructori on tekstivastauksille
	public Kysymys(Long kysymysid, String kysymysteksti, String osio, String kysymys_teksti_lyhyt, String kysymys_teksti_pitka,
			Kysely kysely) {
	super();
		this.kysymysid = kysymysid;
		this.kysymysteksti = kysymysteksti;
		this.osio = osio;
		this.kysymys_teksti_lyhyt = kysymys_teksti_lyhyt;
		this.kysymys_teksti_pitka = kysymys_teksti_pitka;
		this.kysely = kysely;
	
		
	}
	public Kysymys(String kysymysteksti, String osio, Kysely tutor ) {
		
		this.kysymysteksti = kysymysteksti;
		this.osio = osio;
		
	}





	public String getKysymysteksti() {
		return kysymysteksti;
	}

	public void setKysymysteksti(String kysymysteksti) {
		this.kysymysteksti = kysymysteksti;
	}

	
	public String getOsio() {
		return osio;
	}

	public void setOsio(String osio) {
		this.osio = osio;
	}

	public Long getKysymysid() {
		return kysymysid;
	}

	public void setKysymysid(Long kysymysid) {
		this.kysymysid = kysymysid;
	}
	
	public Boolean getOnRadio(Boolean onRadio) {
		return onRadio;
	}

	public void setOnRadio(Boolean onRadio) {
		this.onRadio = onRadio;
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

	public int getMonivalinta() {
		return monivalinta;
	}

	public void setMonivalinta(int monivalinta) {
		this.monivalinta = monivalinta;
	}
	
	
	/*
	public List<VastausVaihtoehto> getVaihtoehdot() {
		return vaihtoehdot;
		
	}
	
	public void setVaihtoehdot(List<VastausVaihtoehto> vaihtoehdot) {
		this.vaihtoehdot = vaihtoehdot;
	}
*/
	@Override
	public String toString() {
		return "Kysymys [kysymysid=" + kysymysid + ", kysymysteksti=" + kysymysteksti + ", osio=" + osio + ", kysymys_teksti_lyhyt="
				+ kysymys_teksti_lyhyt + ", kysymys_teksti_pitka=" + kysymys_teksti_pitka + ", monivalinta="
				+ monivalinta + ", onRadio=" + onRadio + ", kysely=" + kysely + "]";
	}

}
