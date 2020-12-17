package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []numeros= new int[20];
		int x;
		int vezes=0;
		int i;
		for(i=0;i<20;i++) {
			System.out.println("Digite um valor na posição "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		System.out.println("Digite um valor para ver as posiçoes que ele se encontra no vetor:");
		x=Integer.parseInt(entrada.nextLine());
		System.out.println("As posiçoes que o numero se encontra sao:");
		for(i=0;i<20;i++){
			if(numeros[i]==x) {
				System.out.println((i+1));
				vezes+=1;
			}
		}
		if(vezes==0) {
			System.out.println("O numero não se encontra no vetor");
		}
		entrada.close();
	}
}
