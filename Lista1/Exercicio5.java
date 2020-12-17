package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double F;
		double C=0;
		System.out.println("Digite a temperatura em Fahrennheit");
		F = Double.parseDouble(entrada.nextLine());
		C=(F-32)/1.8;
		System.out.println("A temperatura em Celcius é igual a: "+C+" Graus Celsius");
		
		entrada.close();
	}
}
