package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int [][]x= new int [10][10];
		int [][]y= new int [10][10];
		int i,j;
		
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				x[i][j]=i+j;
				y[i][j]=i*j;
			}
		}
		System.out.println("\n Matriz com valores Somados");
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				System.out.print(x[i][j]+" ");
				
			}
			System.out.print(" \n");
		}
		System.out.println("\n Matriz com os valores Multiplicados");
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				System.out.print(y[i][j]+" ");
				
			}
			System.out.print(" \n");
		}
		
		entrada.close();
	}
}
