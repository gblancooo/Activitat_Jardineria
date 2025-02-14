import java.util.Scanner;

public class main {
	public static String[] hierba = { "Maria Juana", "Hierba de los bosques", "La seta feliz", "El oro verde" };
	public static String[] origen = { "Mexico", "Andorra", "Marrueco", "Palestina" };
	public static double[] precio = { 1.70, 4.20, 2.47, 1.33 };

	// Variables publicas extra que considereis

	public static void main(String[] args) {
		Scanner scan_numeros = new Scanner(System.in);
		Scanner scan_letras = new Scanner(System.in);
		
		String nombre, lugar;
		double cantidad;
		
		int parar = 0;
		System.out.println("Buenos dias! Que quieres hacer hoy?");
		
		while( parar != 9) {
			
			System.out.println("Que opcion quieres elegir?");
			parar = scan_numeros.nextInt();
			
			if(parar == 1) {

				// Codigo para buscar por nombre
				System.out.println("Usuario selecciona buscar por nombre");
				nombre = buscarNombre.main(args);
				System.out.println("Has escogijo: " + nombre);
				
			}
			
			// Codigo para buscar por origen
			System.out.println("Usuario selecciona buscar por origen");
			lugar = buscarOrigen.main(args);
			
			// Codigo para ordenar de mayor a menor precio
			System.out.println("Usuario selecciona ordenar por precio de menor a mayor");
			precioMenorMayor.main(args);
		
			System.out.println("Usuario selecciona ordenar por precio de mayor a menor");
			// Codigo para ordenar de mayor a menor precio
			precioMayorMenor.main(args);
			
			// Codigo para seleccionar primer producto
			System.out.println("Usuario selecciona varios productos para comprar");
			nombre = "Hierba de los bosques";
			cantidad = 3;

			// Codigo para seleccionar segundo producto
			nombre = "El oro verde";
			cantidad = 1;

			// Codigo para seleccionar tercer producto
			nombre = "La seta feliz";
			cantidad = 2.5;
			
			// Codigo para eliminar elemento del carrito
			System.out.println("Usuario elimina el segundo elemento de su carrito");

			System.out.println("Usuario finaliza la compra");
			// Codigo para finalizar la compra y que salga el total de la compra
			
			
		}
		
	}

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
	
	//Funciones extra que considereis necesarias
}