import java.util.Scanner;

public class buscarNombre {
	
		public static String main(String[] args) {
		Scanner scan_numeros = new Scanner(System.in);
		Scanner scan_letras = new Scanner(System.in);
	
		String nombre = "";
		int parar = 1;
		
		System.out.println();
		System.out.println();
		System.out.println("BUSCAR POR NOMBRE DE PLANTA");
		System.out.println("LISTA");
		for (int i = 0; i < main.hierba.length; i++) {
			System.out.println(main.hierba[i]);
		
		}
		System.out.println("Que planta quieres?");
		nombre = scan_letras.nextLine();
		
		nombre = verificar(nombre, parar);
		
		return nombre;
		
		
	
		

	}
		
		public static String verificar(String nombre, int parar) {
			Scanner scan_letras = new Scanner(System.in);
			while(parar == 1) {
				for (int i = 0; i < main.hierba.length; i++) {
					if(nombre.equals(main.hierba[i])) {
						parar = 0;
						break;
					}
				}
				
				if(parar == 1) {
					System.out.println("PALABRA NO ENCONTRADA");
					System.out.println("Escribe una palabra de la lista:");
					nombre = scan_letras.nextLine();
				}
			}
			
			return nombre;

		}

}
