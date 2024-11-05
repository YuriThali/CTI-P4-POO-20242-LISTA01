package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner io = new Scanner(System.in);
		Double sal, salreceber, grat, imp;
		
		System.out.println("Seu salário: ");
		sal = io.nextDouble();
		
		grat = sal * 0.05;
		imp = sal * 0.07;
		salreceber = sal + grat - imp;
		System.out.println("Salário que irá receber: " + salreceber);
		
		
		
		
		
	}

}
