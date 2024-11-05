package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ia = new Scanner(System.in);
		Double pfab,vlrd, vlri, pfinal, percd, perci;
		System.out.println("Preço de fábrica: ");
		pfab = ia.nextDouble();
		System.out.println("Percentual do lucro (Distribuidor): ");
		percd = ia.nextDouble();
		System.out.println("Percentual dos impostos: ");
		perci = ia.nextDouble();
		
		Double por1 = percd/100;
		Double por2 = perci/100;
		
		vlrd = pfab * por1;
		vlri = pfab * por2;
		pfinal = pfab + vlrd + vlri;
		System.out.println("Valor da Distribuidora: " + vlrd);
		System.out.println("Valor dos impostos: " + vlri);
		System.out.println("Valor final: " + pfinal);

	}

}
