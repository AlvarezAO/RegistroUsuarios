package oficina;

public class Empleado {
	private String name;
	private String lastName;
	private int age;
	private String email;
	private int phoneNumber;
	//private int ID;
	
	public Empleado(String name, String lastName, int age, String email,
					int phoneNumber) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		//this.ID = getID();
		
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

/*	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}*/
	
	
}
