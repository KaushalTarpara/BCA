package Hiber;
import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee 
{
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "firstname")
  	private String firstname;

	@Column(name = "lastname")
	private String lastname;
	   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
}