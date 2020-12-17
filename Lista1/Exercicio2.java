package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double v1;
		double v2;
		double v3;
		double media=0;
		System.out.println("Digite o primeiro valor: ");
		v1= Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o segundo valor: ");
		v2=	Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o terceiro valor: ");
		v3= Double.parseDouble(entrada.nextLine());
		
		media= (v1+v2+v3)/3;
		System.out.println("A media dos tres numeros e: "+media);
		entrada.close();
	}
}
