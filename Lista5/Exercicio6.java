package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		String troca;
		System.out.println("Digite uma frase");
		frase=String.valueOf(entrada.nextLine());
		System.out.println("Digite a letra que deseja substituir");
		troca=String.valueOf(entrada.nextLine());
		frase=frase.replaceAll(troca, "*");
		System.out.println(frase);
		entrada.close();
	}
}
