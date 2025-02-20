import java.util.Scanner;

public class eliminar_elemento {

	public static void main(String[] args) {
		Scanner scan_numeros = new Scanner(System.in);
		Scanner scan_letras = new Scanner(System.in);
		
		
		System.out.println("Cuantos productos quieres eliminar?");
		int cantidad = 0;
		
		
		
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.println("Tus productos actuales son:");
			main.mostrarproductos(args);
			
			
			System.out.println("Que productos quieres eliminar?");
			int producto = scan_letras.nextInt();
			main.productosmax[producto-1] = null; 
			
		}
		

		
		
		
		
		
	}

}
