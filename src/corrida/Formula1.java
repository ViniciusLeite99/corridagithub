package corrida;

import java.util.Scanner;


public class Formula1 {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
	Float  comprimento;	
	Float voltas;	
	Float  reabastecimento;	     //1000 : 10  15 ; 7km/1L
	Float consumo;
	Float total;
	Float total2;
		
		System.out.println("Qual o comprimento da pista ?");
		comprimento = scan.nextFloat();
		
		System.out.println("Número total de voltas ?");
		voltas = scan.nextFloat();
		
		System.out.println("Número de reabastecimento desejado? ");
		reabastecimento = scan.nextFloat();
		
		System.out.println("Consumo de combustível do carro? Km/L");
		consumo = scan.nextFloat();
		
		total = comprimento * voltas - (reabastecimento * consumo) ;
		total2 = total/consumo; 
		System.out.println("Número Mínimo de litros para percorrer até o primeiro reabastecimento: " + total2+"L");
	
		
	}
}
