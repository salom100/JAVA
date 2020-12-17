package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int []numeros= new int[13];
		int x;
		int y;
		int soma=0;
		int i=1;
		for(i=1;i<=12;i++) {
			System.out.println("Digite um numero na posição "+i);
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		System.out.println("Digite a posiçâo que correspondera ao valor x ");
		x=Integer.parseInt(entrada.nextLine());
		System.out.println("Digite um valor que correspondera ao valor Y ");
		y=Integer.parseInt(entrada.nextLine());
		for(i=1;i<=12;i++) {
			if(i==x) {
				x=numeros[i];
			}
			if(i==y) {
				y=numeros[i];
			}
		}
		soma=x+y;
		System.out.println("A soma dos valores das respectivas posições e: "+soma);
		entrada.close();
	}
}
