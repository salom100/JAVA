package br.edu.ifcvideira.Lista5;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String frase[]=new String[100];
		String fraseEntrada;
		StringBuilder palavra=new StringBuilder();
		int i;
		System.out.println("Digite uma frase");
		fraseEntrada=String.valueOf(entrada.nextLine());
		frase= fraseEntrada.split(" ");
		for(i=(frase.length-1);i>-1;i--){
			palavra.append(frase[i]+" ");
		}
		System.out.println(palavra);
		entrada.close();
	}
}
