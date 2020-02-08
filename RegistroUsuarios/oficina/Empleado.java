package oficina;

public class Empleado {
	private String name;
	private String lastName;
	private String birthDate;
	private String email;
	private int phoneNumber;
	private int ID;
	
	public Empleado(String name, String lastName, String birthDate, String email,
					int phoneNumber) {
		
		this.name = name;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.ID = getID();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	
}
