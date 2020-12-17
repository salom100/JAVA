package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [][]v1 = new int[10][10];
		int i,j;
		int maior=0;
		int linha=0;
		int coluna=0;
		for(j=0;j<10;j++){
			for(i=0;i<10;i++){
				System.out.println("Digite um numero para a posição ("+(j+1)+","+(i+1)+")");
				v1[j][i]=Integer.parseInt(entrada.nextLine());
				if(v1[j][i]>maior){
					maior=v1[j][i];
					linha=j;
					coluna=i;
				}
			}
		}
		for(j=0;j<10;j++){
			for(i=0;i<10;i++){
				System.out.print(v1[j][i]+" ");
			}
			System.out.print(" \n");
		}
		
		System.out.println("A posição em que o maior valor se encontra é:"+(linha+1)+","+(coluna+1));
		
		entrada.close();
	}
}