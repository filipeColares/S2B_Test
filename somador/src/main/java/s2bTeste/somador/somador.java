package s2bTeste.somador;

public class somador {
	
	double num1;
	double num2;
	
	public double getNum1() {
		return num1;
	}
	
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
		
	public static double soma(double num1, double num2) {
		if(num1<0) {
			throw new IllegalArgumentException("O primeiro número não pode ser negativo");
		}
		
		if(num2<0) {
			throw new IllegalArgumentException("O segundo número não pode ser negativo");
		}
		
		if(num1<0 && num2<0) {
			throw new IllegalArgumentException("Os números não podem ser negativos");
		}
		
		 return num1 + num2;	
	}
	
	
}
