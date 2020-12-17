package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [][]numeros=new int [8][8];
		int i,j;
		
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				numeros[i][j]=1;
			}
		}
		
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				if(j>i){
					numeros[i][j]=0;	
				}
			}
		}
		
		for(i=0;i<8;i++){
			for(j=0;j<8;j++){
				
					System.out.print(numeros[i][j]+" ");
			
			
		}
			System.out.println("");
	}
		entrada.close();
	}
}
