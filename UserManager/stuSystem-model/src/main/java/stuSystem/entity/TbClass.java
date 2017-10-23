package stuSystem.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maven_sshJcls")
public class TbClass implements Serializable{
     
	private int cno;
	private String cname;
	
	public TbClass() {
		super();
	}
	public TbClass(int cno, String cname) {
		super();
		this.cno = cno;
		this.cname = cname;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
}
