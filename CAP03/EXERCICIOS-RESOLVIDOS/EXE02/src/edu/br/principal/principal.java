package edu.br.principal;

import java.util.Scanner;

public class principal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota 1: ");
		nota1= sc.nextFloat();
		System.out.println("Digite a nota 2: ");
		nota2=sc.nextFloat();
		System.out.println("Digite a nota 3: ");
        nota3= sc.nextFloat();
        
        media= (nota1+nota2+nota3)/3;
        
        System.out.println("Sua média é: " + media);
	}

}
