package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []numeros= new int[40];
		int i;
		for(i=0;i<40;i++) {
			System.out.println("Digite um valor para a posição "+(i+1));
			numeros[i]=Integer.parseInt(entrada.nextLine());
			if(numeros[i]<0) {
				numeros[i]=0;
			}
		}
		for(i=0;i<40;i++) {
			System.out.print(numeros[i]+" ");
		}
		entrada.close();
	}
}
