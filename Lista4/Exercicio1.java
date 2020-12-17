package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []numeros = new int[5];
		int i;
		for(i=0;i<5;i++) {
			System.out.println("Digite o primeiro numero na posiçâo "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		System.out.println("Os numeros na ordem inversa são: ");
		for(i=0;i<5;i++) {
			System.out.println(numeros[4-i]);
		}
		entrada.close();
	}
}
