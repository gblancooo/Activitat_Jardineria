import java.util.Scanner;

public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };
	public static String[] productosmax = new String[10];
	
	// Variables publicas extra que considereis

	public static void main(String[] args) {
		Scanner scan_numeros = new Scanner(System.in);
		Scanner scan_letras = new Scanner(System.in);
		
		String nombre, lugar;
		double cantidad;
		
		int productosentrar = 0;
		
		int parar = 0;
		System.out.println("Buenos dias! Que quieres hacer hoy?");
		mostrarmenu();
		
		while( parar != 9) {
			
			System.out.println("Que opcion quieres elegir? (8 - Mostrar Menu) ");
			parar = scan_numeros.nextInt();
			
			if(parar == 1) {

				// Codigo para buscar por nombre
				System.out.println("Usuario selecciona buscar por nombre");
				buscarNombre.main(args);
				
				
			}
			
			else if(parar == 2) {

				// Codigo para buscar por origen
				System.out.println("Usuario selecciona buscar por origen");
				buscarOrigen.main(args);
				
			}
			
			else if(parar == 3) {
				
				// Codigo para ordenar de mayor a menor precio
				System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
				precioMenorMayor.main(args);
				
			}
			
			else if(parar == 4) {
				
				System.out.println("Usuario selecciona ordenar por precio de mayor a menor");
				// Codigo para ordenar de mayor a menor precio
				precioMayorMenor.main(args);
			
			}
			
			else if(parar == 5) {
				
				
				productosentrar = 1;
			}
			
			else if(parar == 6) {
				
				if(productosentrar == 0) {
					System.out.println("No tienes ningun producto seleccionado");
				}
				else {
					
				}
				
				// Codigo para eliminar elemento del carrito
				System.out.println("Usuario elimina elemento de su carrito");
				
				
			}
			
			else if(parar == 7) {

				System.out.println("Usuario finaliza la compra");
				// Codigo para finalizar la compra y que salga el total de la compra
				
			}
			
			else if(parar == 8) {
				mostrarmenu();
			}
			
			else if(parar == 9) {
			System.out.println("HAS DECIDIDO SALIR");
			}
			
		}
		
	}

	//Funciones extra que considereis necesarias
	public static void mostrarmenu() {
		System.out.println("MENU:");
		System.out.println("1 - Buscar planta por nombre");
		System.out.println("2 - Seleccionar origen");
		System.out.println("3 - Ordenar precio de menor a mayor");
		System.out.println("4 - Ordenar precio de mayor a menor");
		System.out.println("5 - Seleccionar varios productos para comprar");
		System.out.println("6 - Eliminar elemnto de carrito");
		System.out.println("7 - Finalizar compra");
		System.out.println("8 - Mostrar menu");
		System.out.println("9 - SALIR");
		
		
	}
	
	public static void mostrarproductos(String productosmax[]) {
		System.out.println("Tus productos son:");
		for (int i = 0; i < productosmax.length; i++) {
			System.out.println(productosmax[i]);
		}
	}
}