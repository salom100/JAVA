package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int i;
		String texto;
		int vetor[]= new int[100];
		int maior=0;
		int menor=999;
		
		System.out.println("Digite uma sequencia numerica tipo (1;2;3;4;5)");
		texto=String.valueOf(entrada.nextLine());
		String separa[]=texto.split(";");
		
		
		for(i=0;i<separa.length;i++) {
			System.out.print(separa[i]+" ");
			vetor[i]=Integer.parseInt(separa[i]);//conversao
			if(vetor[i]>maior){
				maior=vetor[i];
			}
			if(vetor[i]<menor){
				menor=vetor[i];
			}
		}
		
		System.out.println("\nO maior numero encontrado foi:"+maior);
		System.out.println("O menor numero encontrado foi:"+menor);
		
		entrada.close();
	}
}