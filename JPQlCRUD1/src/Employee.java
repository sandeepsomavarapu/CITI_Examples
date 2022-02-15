import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sleepingemps") // select empid from sleepingemps;SQl
public class Employee // select e from Employee e;//JPQL update Employee set esal=esal+10000 where esal>3000
{
	@Id
	@Column(name = "empid", length = 10)
	private int eid;
	@Column(name = "empname", length = 10)
	private String ename;
	@Column(name = "salary", length = 10)
	private int esal;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public Employee(int eid, String ename, int esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
}
