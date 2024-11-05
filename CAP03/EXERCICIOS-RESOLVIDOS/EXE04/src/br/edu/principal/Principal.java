package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			double salario, aumento, novosalario;
			
			System.out.println("Digite o salário: ");
			salario = sc.nextDouble();
			aumento = salario * 25/100;
			novosalario = salario + aumento;
			System.out.println("O novo salário será de: " + novosalario);


	}

}
