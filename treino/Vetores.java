package br.edu.ifcvideira.treino;

import java.util.Scanner;

public class Vetores {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		int numeros[]= new int[12];
		int x;
		int y;
		int i;
		int soma=0;
		for(i=0;i<12;i++) {
			System.out.println("Digite um numero para a posi��o "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		System.out.println("Digite uma posi��o X");
		x=Integer.parseInt(entrada.nextLine());
		System.out.println("Digite um posi��o Y");
		y=Integer.parseInt(entrada.nextLine());
		
		for(i=0;i<12;i++) {
			if((i+1)==x) {
				soma+=numeros[i];
			}
			if((i+1)==y) {
				soma+=numeros[i];
			}
		}
		System.out.println("A soma dos numeros das posi�oes X e Y e igual a:  "+soma);
		
	
		entrada.close();
		
	}

	
}
