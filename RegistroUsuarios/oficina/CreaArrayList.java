package oficina;

import java.util.ArrayList;

public class CreaArrayList {
		
	private ArrayList<Empleado> creaLista = new ArrayList<Empleado>();
	
	public void addDocente(Empleado agregar) {
		creaLista.add(agregar);
	}
	
	public void showDocente() {
		for(Empleado uno:creaLista) {
			System.out.println(uno.toString());
		}
	}
	
}
