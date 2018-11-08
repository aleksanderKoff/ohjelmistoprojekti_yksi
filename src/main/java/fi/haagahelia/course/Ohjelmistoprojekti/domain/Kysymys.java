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
	
	@ManyToOne
	@JoinColumn(name = "kyselyid")
	private Kysely kysely;
	
	public Kysymys() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Kysymys(String kysymys) {
		super();
		this.kysymys = kysymys;
	}

	public String getKysymys() {
		return kysymys;
	}

	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Kysymys [id=" + id + "]";
	}

}
