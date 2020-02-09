package oficina;

public class Trabajador extends Empleado {
	private  String areaFuncion;
	private int horaSemana;
	
	public Trabajador(String name, String lastName, int age, String email,
					int phoneNumber, String areaFuncion, int horaSemana) {
		
		super(name, lastName, age, email, phoneNumber);
	}

	public String getAreaFuncion() {
		return areaFuncion;
	}

	public void setAreaFuncion(String areaFuncion) {
		this.areaFuncion = areaFuncion;
	}

	public int getHoraSemana() {
		return horaSemana;
	}

	public void setHoraSemana(int horaSemana) {
		this.horaSemana = horaSemana;
	}
	
	
	
}
