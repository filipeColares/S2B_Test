package s2bTeste.somador;

public class somador {

	public static double somador(double i, double j) {
		if(i<0) {
			throw new IllegalArgumentException("O primeiro número não pode ser negativo");
		}
		
		if(j<0) {
			throw new IllegalArgumentException("O segundo número não pode ser negativo");
		}
		
		
		return i + j;	
	}
	
}
