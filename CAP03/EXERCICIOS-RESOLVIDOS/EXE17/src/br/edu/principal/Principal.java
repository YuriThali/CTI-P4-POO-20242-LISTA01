package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, cheque1, cheque2, CPMF1, CPMF2, saldo;
		
		System.out.println("Digite o salario: ");
		salario = sc.nextDouble();
		System.out.println("Digite o primeiro cheque: ");
		cheque1 = sc.nextDouble();
		System.out.println("Digite o segundo cheque: ");
		cheque2 = sc.nextDouble();
		CPMF1 = cheque1 * 0.38 / 100;
	    CPMF2 = cheque2 * 0.38 / 100;
	    saldo = salario - cheque1 - cheque2 - CPMF1 - CPMF2;
	    System.out.println("O saldo final é de: " + saldo);
		
		
		

	}

}
