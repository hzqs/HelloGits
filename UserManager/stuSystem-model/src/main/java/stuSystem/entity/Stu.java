package stuSystem.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "maven_sshJstu")
public class Stu {

	private int sno;
	private String sname;
	private int sage;
	private String ssex;
	private String shobby;
	private Date sintime;

	// 学生与班级多对一
	private TbClass cls;

	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stu(int sno, String sname, int sage, String ssex, String shobby, Date sintime) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.sage = sage;
		this.ssex = ssex;
		this.shobby = shobby;
		this.sintime = sintime;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public String getSsex() {
		return ssex;
	}

	public void setSsex(String ssex) {
		this.ssex = ssex;
	}

	public String getShobby() {
		return shobby;
	}

	public void setShobby(String shobby) {
		this.shobby = shobby;
	}

	@Temporal(TemporalType.DATE)
	public Date getSintime() {
		return sintime;
	}

	public void setSintime(Date sintime) {
		this.sintime = sintime;
	}

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, fetch = FetchType.EAGER)
	@JoinColumn(name = "scno")
	public TbClass getCls() {
		return cls;
	}

	public void setCls(TbClass cls) {
		this.cls = cls;
	}

}
