package s2bTeste.somador;

public class somador {
	
	double num1;
	double num2;
	double opcao;
	
	
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
		if(num1<0 && num2<0) {
			throw new IllegalArgumentException("Os números não podem ser negativos");
		}
		
		if(num1<0) {
			throw new IllegalArgumentException("O primeiro número não pode ser negativo");
		}
		
		if(num2<0) {
			throw new IllegalArgumentException("O segundo número não pode ser negativo");
		}
		
		 return num1 + num2;	
	}
	
	public static double subtrair(double num1, double num2) {

		if(num2>num1) {
			throw new IllegalArgumentException("A operação não pode ser validada!. Numero dois maior que o numero um");
		}
		return (num1/num2);
		
	}
	
}
