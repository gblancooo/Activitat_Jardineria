import java.util.Scanner;

public class buscarOrigen {

	public static String main(String[] args) {
		
		Scanner scan_numeros = new Scanner(System.in);
		Scanner scan_letras = new Scanner(System.in);
	
		String origen = "";
		int parar = 1;
		
		System.out.println("BUSCAR POR ORIGEN DE PLANTA");
		System.out.println("LISTA");
		for (int i = 0; i < main.origen.length; i++) {
			System.out.println(main.origen[i]);
		
		}
		System.out.println("Que origen quieres?");
		origen = scan_letras.nextLine();
		
		origen = verificar(origen, parar);
		
		return origen;
		
			
	}
	
	public static String verificar(String origen, int parar) {
		Scanner scan_letras = new Scanner(System.in);
		while(parar == 1) {
			for (int i = 0; i < main.origen.length; i++) {
				if(origen.equals(main.origen[i])) {
					parar = 0;
					break;
				}
			}
			
			if(parar == 1) {
				System.out.println("PALABRA NO ENCONTRADA");
				System.out.println("Escribe una palabra de la lista:");
				origen = scan_letras.nextLine();
			}
		}
		
		return origen;

	}

	
	
}
