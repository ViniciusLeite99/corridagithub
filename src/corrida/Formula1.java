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
		
		System.out.println("N�mero total de voltas ?");
		voltas = scan.nextFloat();
		
		System.out.println("N�mero de reabastecimento desejado? ");
		reabastecimento = scan.nextFloat();
		
		System.out.println("Consumo de combust�vel do carro? Km/L");
		consumo = scan.nextFloat();
		
		total = comprimento * voltas - (reabastecimento * consumo) ;
		total2 = total/consumo; 
		System.out.println("N�mero M�nimo de litros para percorrer at� o primeiro reabastecimento: " + total2+"L");
	
		
	}
}
