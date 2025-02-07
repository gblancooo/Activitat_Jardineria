import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class precioMenorMayor {

	public static void main(String[] args) {

		//precios ordenados
		double[] precios = new double[main.precio.length];
		for (int i = 0; i < precios.length; i++) {
			precios[i] = main.precio[i];
		}
				
		Arrays.sort(precios);	// Arrays.sort() ordena el array de menor a mayor de forma automática
				
		
		//plantas ordenadas
		String[] hierba = new String[main.hierba.length];
				
		for (int i = 0; i < hierba.length; i++) {
			for (int j = 0; j < hierba.length; j++) {
				if(precios[i] == main.precio[j]) {
					hierba[i] = main.hierba[j];
				}
			}
		}
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("El precio de menor a mayor:");
		
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i] + " -- " + hierba[i]);	
		}

	}	
}
