import java.util.Scanner;

public class seleccionar_productos {

	public static void main(String[] args) {
		Scanner scan_letras = new Scanner(System.in);
		Scanner scan_numeros = new Scanner(System.in);

		
		String producto = "";
		int cantidad = 0;
		
		System.out.println("Cuantos productos quieres añadir?");
		cantidad = scan_numeros.nextInt();
		
		
		System.out.println("Productos:");
		System.out.println("NOMBRE: ---------- ORIGEN ---------- PRECIO");
		for (int i = 0; i < main.hierba.length; i++) {
			System.out.println(main.hierba[i] + " - " + main.origen[i] + " - " + main.precio[i]);
			
		}
		
		
		
		int contador = 0;
		int contador2 = 1;
		
		for (int i = 0; i < main.productosmax.length; i++) {
			if(contador == cantidad) {
				break;
			}
			
			else if(main.productosmax[i] == null) {
				for (int j = 0; j < main.productosmax.length; j++) {
					if(main.productosmax[i] == null)  {
						System.out.println("Escribe el producto " + contador2 );
						producto = scan_letras.nextLine();
						producto = verificar(producto);
						
						main.productosmax[i] = producto;
					
						break;
					}
										
					
				}
				contador2++;
				contador++;
			}
			
		}
			
		
		
	}
	
	public static String verificar(String producto) {
		Scanner scan_letras = new Scanner(System.in);
		int parar = 0;

		while(parar != 1) {
			for (int i = 0; i < main.hierba.length; i++) {
				if(main.hierba[i].equals(producto)) {
					parar = 1;
					break;
				}
								
			}
			
			if(parar == 0) {
				System.out.println("Producto invalido selecciona un producto correcto");
				producto = scan_letras.nextLine();

			}
			
		}
		
		return producto;
	
		
		
	}

}
