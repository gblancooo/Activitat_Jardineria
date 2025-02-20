import java.util.Scanner;

public class eliminar_elemento {

	public static void main(String[] productosmax) {
		Scanner scan_numeros = new Scanner(System.in);
		Scanner scan_letras = new Scanner(System.in);
		
		
		System.out.println("Cuantos productos quieres eliminar?");
		int cantidad = scan_numeros.nextInt();
		
		
		
		
		for (int i = 0; i < cantidad; i++) {
			
			System.out.println("Tus productos actuales son:");
			main.mostrarproductos(productosmax);
			
			
			System.out.println("Que productos quieres eliminar?");
			int producto = scan_numeros.nextInt();
			producto = verificar(producto, cantidad);
			
			main.productosmax[producto-1] = null; 
			
			organizararray(productosmax);
		}
		
		
		
		
		
	}
	
	public static int verificar(int producto, int cantidad) {
		Scanner scan_numeros = new Scanner(System.in);

		
		int parar = 0;
		while(parar != 1){
			while(producto > 10 || producto < 1) {
				System.out.println("Numero fuera del rango, maximo 10 y minimo 1");
				producto = scan_numeros.nextInt();

			}

			
			if(main.productosmax[producto] == null) {
				System.out.println("Ese producto esta vacio dime otro");
				producto = scan_numeros.nextInt();

			}
			
			else {
				break;
			}
			
		}
		
		
		
		
		return producto;
	}
	
	public static void organizararray(String[] productosmax) {
        for (int i = 0; i < productosmax.length - 1; i++) {
            
        	if (productosmax[i] == null) {
                for (int j = i; j < productosmax.length - 1; j++) {
                    productosmax[j] = productosmax[j + 1];
               
            	}
            
        	}
        
        }

	}
}
