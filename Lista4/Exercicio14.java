package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int [][]v1= new int [5][5];
		int i,j;
		
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				v1[i][j]=i+j;
			}
		}
		
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				v1[i][j]=0;
			}
		}
		
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				if(i==j){
					v1[i][j]=1;
				}
			}
		}
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				System.out.print(v1[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		entrada.close();
	}
}
