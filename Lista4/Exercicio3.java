package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []numeros = new int[16];
		int troca;
		int i;
		for(i=0;i<16;i++) {
			System.out.println("Digite um valor na posição"+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
		}
		for(i=0;i<8;i++) {
			troca=numeros[i];
			numeros[i]=numeros[i+8];
			numeros[i+8]=troca;
		}
		for(i=0;i<16;i++) {
			System.out.print(numeros[i]+" ");
		}
		
		entrada.close();
	}
}
