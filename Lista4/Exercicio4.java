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
			System.out.println("Digite um valor na posi��o "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		System.out.println("Digite um valor para ver as posi�oes que ele se encontra no vetor:");
		x=Integer.parseInt(entrada.nextLine());
		System.out.println("As posi�oes que o numero se encontra sao:");
		for(i=0;i<20;i++){
			if(numeros[i]==x) {
				System.out.println((i+1));
				vezes+=1;
			}
		}
		if(vezes==0) {
			System.out.println("O numero n�o se encontra no vetor");
		}
		entrada.close();
	}
}
