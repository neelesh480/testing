package projectJsf;


import javax.faces.bean.*;

@ManagedBean
public class studentTwo {
	
	private String firstName;
	private String lastName;
	private String Country;

	public studentTwo( ) {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	
}