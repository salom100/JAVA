package br.edu.ifcvideira.Lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double comprimento;
		double voltas;
		double reabastecimentos;
		double consumo;
		double litros;
		
		System.out.println("Digite o comprmento da pista em KM: ");
		comprimento= Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o numero de voltas da prova: ");
		voltas= Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o numero de reabastecimentos: ");
		reabastecimentos=Double.parseDouble(entrada.nextLine());
		
		System.out.println("Digite o consumo do carro: ");
		consumo= Double.parseDouble(entrada.nextLine());
		
		litros= comprimento*voltas/(reabastecimentos +1)/consumo;
		System.out.println("O numero de litros necessarios para reabastecer é: "+df.format(litros));
		
		entrada.close();
	}
}
