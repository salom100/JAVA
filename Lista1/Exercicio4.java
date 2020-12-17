package br.edu.ifcvideira.Lista1;

import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double raio;
		double area;
		System.out.println("Digite o valor do raio");
		raio= Double.parseDouble(entrada.nextLine());
		
		area= (Math.pow(raio, 2)*3.14);
		System.out.println("A Area do circulo e: "+area);
		
		entrada.close();
	}
}
