package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor_salario, qtd_kw, valor_kw, valor_reais, desconto, valor_desconto;
		
		System.out.println("Digite o salário: ");
		valor_salario = sc.nextDouble();
		System.out.println("Digite a quantidade de quilowatt: ");
		qtd_kw = sc.nextDouble();
		
		valor_kw = valor_salario / 5;
		valor_reais = valor_kw * qtd_kw;
		desconto = valor_reais * 15 / 100;
		valor_desconto = valor_reais - desconto;
		System.out.println("O valor de cada quilowatt é: " + valor_kw);
		System.out.println("O valor a ser pago por essa residência é: " + valor_reais);
		System.out.println("O valor a ser pago com desconto de 15% é de: " + valor_desconto);
	
		
		
		
		

	}

}
