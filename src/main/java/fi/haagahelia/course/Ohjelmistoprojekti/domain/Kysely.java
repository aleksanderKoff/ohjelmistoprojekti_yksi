package fi.haagahelia.course.Ohjelmistoprojekti.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Kysely {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long kyselyid;
	private String otsikko;
	private String kuvaus;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "kysely")
	private List<Kysymys> kysymykset;
	
	public Kysely() {}
	
	public Kysely(String otsikko, String kuvaus) {
		super();
		this.otsikko = otsikko;
		this.kuvaus = kuvaus;
		
	}
	
	public Long getKyselyid(Long kyselyid) {
		return kyselyid;
	}
	public void setKyselyid(Long kyselyid) {
		this.kyselyid = kyselyid;
	}
	public String getOtsikko(String otsikko) {
		return otsikko;
	}
	public void setOtsikko(String otsikko) {
		this.otsikko = otsikko;
	}
	public String getKuvaus(String kuvaus) {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	
	public List<Kysymys> getKysymykset() {
		return kysymykset;
	}

	public void setBooks(List<Kysymys> kysymykset) {
		this.kysymykset = kysymykset;
	}
	@Override
	public String toString() {
		return "Kysely [kyselyid=" + kyselyid +", otsikko="+ otsikko + ", kuvaus=" + kuvaus +"]";
	}
	
}
