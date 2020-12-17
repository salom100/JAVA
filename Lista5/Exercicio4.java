package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		char vetor[]= new char[100];
		int i;
		int pos=0;
		int flag=0;
		System.out.println("Digite uma frase:");
		frase= String.valueOf(entrada.nextLine());
		frase=frase.replace(" ","");
		frase= frase.toUpperCase();
		frase= frase.replace("_", "");
		
		vetor=frase.toCharArray();
		
		for(i=0;i<vetor.length;i++){
			if(vetor[i]!=vetor[(vetor.length-1)-pos]){
				flag=1;
			}
			pos++;
		}
	
		if(flag==0){
			System.out.println("é um palindromo");
		}else{
			System.out.println("nao e um palindromo");
		}
		
		
		entrada.close();
	}
}
