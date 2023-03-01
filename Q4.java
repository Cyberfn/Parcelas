package Questoes;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o valor do produto:");
		 double produto = entrada.nextDouble();
		 
		 
		 double x1 = produto / 1 ;
		 double x2 = produto / 2 ;
		 double x3 = produto / 3 ;
		 double x4 = produto / 4 ;
		 double x5 = produto / 5 ;
		 
		 System.out.println("As seguintes possíveis parcelas do seu produto são:");
		 System.out.println("x1 de " + x1);
		 System.out.println("x2 de " + x2);
		 System.out.println("x3 de " + x3);
		 System.out.println("x4 de " + x4);
		 System.out.println("x5 de " + x5);
		
		
	}

}
