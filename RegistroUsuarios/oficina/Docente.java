package oficina;

public class Docente extends Empleado {
	private String materia;
	private int horaSemana;
	private boolean profeJefe;
	
	public Docente (String name, String lastName, int age, String email,
					int phoneNumber, String materia, int horaSemana, boolean profeJefe) {
		
		super(name, lastName, age, email, phoneNumber);
		
		this.materia = materia;
		this.horaSemana = horaSemana;
		this.profeJefe = profeJefe;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public int getHoraSemana() {
		return horaSemana;
	}

	public void setHoraSemana(int horaSemana) {
		this.horaSemana = horaSemana;
	}

	public boolean isProfeJefe() {
		return profeJefe;
	}

	public void setProfeJefe(boolean profeJefe) {
		this.profeJefe = profeJefe;
	}
	
	
}
