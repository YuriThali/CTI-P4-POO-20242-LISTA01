package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double altura, distancia, tamanho;
		System.out.println("Qual altura deseja colocar o quadro? ");
		altura = ia.nextDouble();
		System.out.println("Tamanho da escada: ");
		tamanho = ia.nextDouble();
		Double cat1 = Math.pow(altura, 2);
		Double cat2 = Math.pow(tamanho, 2);
		distancia = tamanho - altura;
		distancia = Math.sqrt(distancia);
		System.out.println("A distância deverá ser de: " + distancia);
		
	}

}
