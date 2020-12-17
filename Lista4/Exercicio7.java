package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int []numeros= new int [10];
		int i,j=0;
		int vezes=0;
		for(i=0;i<10;i++) {
			System.out.println("Digite um valor na posição "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		System.out.println("Os numeros que se repetem são: ");
		for(j=0;j<10;j++) {
			vezes=0;
			for(i=0;i<10;i++) {
				if(numeros[j]==numeros[i]) {
					vezes+=1;
				}
			}
			if(vezes>=2) {
				System.out.println(numeros[j]);
			}
		}
		
		
		entrada.close();
	}
}
