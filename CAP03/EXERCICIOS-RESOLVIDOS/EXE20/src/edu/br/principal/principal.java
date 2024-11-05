package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		double ang, alt, escada, radiano;
		
		System.out.println("Medida do âmgulo da escada: ");
		ang= sc.nextDouble();
		System.out.println("Altura da parede em que se encontra a ponta da escada: ");
		alt= sc.nextDouble();
		
		radiano= ang*3.14/180;
		escada= alt/Math.sin(radiano);
		
		System.out.println("A medida dessa escada é: " + escada);

	}

}
