package oficina;

public class Alumno extends Empleado {
	private String curso;
	private boolean beca;
	
	public Alumno(String name, String lastName, int age, String email,
					int phoneNumber, String curso, boolean beca) {
		
		super(name, lastName, age, email, phoneNumber);
		
		this.curso = curso;
		this.beca = beca;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public boolean isBeca() {
		return beca;
	}

	public void setBeca(boolean beca) {
		this.beca = beca;
	}
	
	
	
}
