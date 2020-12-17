package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double numero;
		double cont=0;
		double fatorial=1;
		System.out.println("Digite um numero para se descobrir seu fatorial");
		numero= Double.parseDouble(entrada.nextLine());
		
		for(cont=1;cont<=numero;cont++){
			fatorial=fatorial*cont;
		}
		System.out.println("O valor do fatorial é:"+fatorial);
	entrada.close();
	}		
}
