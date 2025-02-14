import java.util.Scanner;

public class seleccionar_productos {

	public static String main(String[] args) {
		Scanner scan_letras = new Scanner(System.in);

		String producto = "";
		
		System.out.println("Productos:");
		System.out.println("NOMBRE: ---------- ORIGEN ---------- PRECIO");
		for (int i = 0; i < main.hierba.length; i++) {
			System.out.println(main.hierba[i] + " - " + main.origen[i] + " - " + main.precio[i]);
			
		}
		
		System.out.println("Que producto quieres seleccionar?");
		producto = scan_letras.nextLine();
		
		producto = verificar(producto);
			
		return producto;
		
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
