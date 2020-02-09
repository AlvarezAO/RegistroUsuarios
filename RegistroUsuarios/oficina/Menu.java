package oficina;
import java.util.*;

public class Menu {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int option, otraOption;
		do {
			System.out.println("Menu Registro Usuario");
			System.out.println("1 - Agregar Usuario \n2 - Mostrar Usuario \n3 - Resumen \n4 - Salir");
			option = kb.nextInt();	
			kb.nextLine();
			
			switch (option) {
						
			case 1: System.out.println("Ingresa nombre");
					String name = kb.nextLine();
					
					do {
						System.out.println("1 - Deportista | 2 - Sedentario");
						otraOption = kb.nextInt();
						
					} while (otraOption != 1 && otraOption != 2);
					
					break;
					
			case 2: System.out.println("Ingresa Apellido");
			 		String apellido = kb.nextLine();
			 		
			 		break;
			 		
			case 3: System.out.println("Ingresa apodo");
	 				String apodo = kb.nextLine();
	 		
	 				break; 		
	 				
			case 4: System.out.println("Has salido del programa");
					System.exit(0);
		
					break;
					
			default: System.out.println("ERROR MENU");
			}
			
			
			
		} while (option != 4);

	}

}
