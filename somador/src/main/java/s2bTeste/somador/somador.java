package s2bTeste.somador;

public class somador {

	public static double somador(double i, double j) {
		if(i<0) {
			throw new IllegalArgumentException();
		}
		
		if(j<0) {
			throw new IllegalArgumentException();
		}
		
		return i + j;	
	}
	
}