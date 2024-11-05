package edu.br.principal;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		float horas_t, vlr_sal_min, vlr_hora_t, vlr_sal_bru, imp, vlr_sal_liq;
		
		System.out.println("Digite as horas trabalhadas: ");
		horas_t= sc.nextFloat();
		System.out.println("Digite o valor do salário mínimo: ");
		vlr_sal_min= sc.nextFloat();
		
		vlr_hora_t= vlr_sal_min/2;
		vlr_sal_bru= vlr_hora_t*horas_t;
		imp= vlr_sal_bru*3/100;
		vlr_sal_liq= vlr_sal_bru-imp;
		
		System.out.println("O valor do seu salário é R$" + vlr_sal_liq);

	}

}
