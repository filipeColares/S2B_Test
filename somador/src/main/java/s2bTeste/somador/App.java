package s2bTeste.somador;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//int operador1;
    	
    	Scanner scanner = new Scanner(System.in);
    	somador somador = new somador();
    	
    	//System.out.println("Insira a operação");
    	//int operador1 = scanner.nextInt();
    	
    	System.out.println("Insira dois números: \n");
    	double num1 = scanner.nextDouble();
    	double num2 = scanner.nextDouble();
  
    	
    	System.out.println("Exibindo valores\n");
    	System.out.println(num1);
    	System.out.println(num2);
    	
    	System.out.println("Resultado da soma");
    	System.out.println(somador.soma(num1, num2));
    	
    	/*switch (operador1) {
		case 1:
			System.out.println(somador.soma(num1, num2));
			break;

		case 2:
			System.out.println(somador.subtrair(num1, num2));
			break;
			
		default:
			break;
		}*/
    	
    	
    	scanner.close();
    	
    	
    	/*double num1 = 4;
    	double num2 = 5;
    	double result = somador.somador(num2, num1);
        
    	System.out.println( "Hello World!" );
    	System.out.println(num1);
    	System.out.println(num2);
    	System.out.println("Resultado");
    	System.out.print(result);*/
    	
    }
}
