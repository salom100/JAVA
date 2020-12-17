package br.edu.ifcvideira.treino;

import java.util.Scanner;
public class Matrizes {
	public static void main (String args[]) {
		Scanner entrada= new Scanner(System.in);
		int numeros[][]= new int[10][10];
		int multi[][]=new int [10][10];
		int i,j;
		
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				numeros[i][j]=i+j;
			}
		}
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				multi[i][j]=i*j;
			}
		}
		System.out.println("Matriz Soma: \n");
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.print(numeros[i][j]+" ");
				
			}
			System.out.println(" ");
		}
		System .out.println("\n\nMatriz multiplicação \n");
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				System.out.print(multi[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		entrada.close();
	}
}
