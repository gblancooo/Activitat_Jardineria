import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class precioMenorMayor {

	public static void main(String[] args) {

		double[] precios = new double[main.precio.length];
		
		for (int i = 0; i < precios.length; i++) {
			precios[i] = main.precio[i];
		}
		
		System.out.println();
		System.out.println();
		System.out.println("El precio de menor a mayor:");
				
		Arrays.sort(precios);	// Arrays.sort() ordena el array de menor a mayor de forma automática

		
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);	
		}
		
	}

}
