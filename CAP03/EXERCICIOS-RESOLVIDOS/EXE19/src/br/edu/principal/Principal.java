package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double alturadegrau, alturadesejada, qtd_degraus;
		System.out.println("Digite a altura do degrau em metros: ");
		alturadegrau = sc.nextDouble();
		System.out.println("Digite a altura que deseja alcançar: ");
		alturadesejada = sc.nextDouble();
		qtd_degraus = alturadesejada / alturadegrau;
		System.out.println("A quantidade de degraus que ele tem que subir é igual a: " + qtd_degraus);
		
		
		

	}

}
