package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		float pes, jardas, polegadas, milhas;
		
		System.out.println("Digite um valor em pés: ");
		pes= sc.nextFloat();
		
		polegadas= pes*12;
		jardas= pes/3;
		milhas= jardas/1760;
		
		System.out.println("Polegadas:" + polegadas + " Jardas: " + jardas + " Milhas: " + milhas);
		

	}

}
