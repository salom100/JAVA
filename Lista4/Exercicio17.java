package br.edu.ifcvideira.Lista4;

import java.util.Random;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String [][]respostas = new String  [2][10];
		String []gabarito = new String[10];
		int []notas = new int [2];
		int i,j,r,a;
		Random alternativas = new Random();
		for(i=0;i<2;i++) {
			for (j = 0; j <10; j++) {
				System.out.println("Digite a alternativa "+alternativas.nextInt(5));
				a= Integer.parseInt(entrada.nextLine());
				if(a==1) {
					respostas[i][j]="a";
				}else if(a==2) {
					respostas[i][j]="b";
				}else if(a==3) {
					respostas[i][j]="c";
				}else if(a==4) {
					respostas[i][j]="d";
				}
			}
		}
		for(i=0;i<10;i++) {
			System.out.println(alternativas.nextInt(5));
			a = Integer.parseInt(entrada.nextLine());
				if(a==1) {
					gabarito[i]="a";
				}else if(a==2) {
					gabarito[i]="b";
				}else if(a==3) {
					gabarito[i]="c";
				}else if(a==4) {
					gabarito[i]="d";
				}
		}
		for(i=0;i<2;i++) {
			r=0;
			for(j=0;j<10;j++) {
				if(gabarito[j].equalsIgnoreCase(respostas[i][j]));
				r+=1;
			}
			notas[i]=r;
		}
		
		for(i=0;i<2;i++) {
			System.out.print("alunos: "+(i+1)+" ");
			for(j=0;j<10;j++) {
				System.out.print("Questao "+(j+1)+":"+respostas[i][j]+" ");
			}
			System.out.print("Notas ="+notas[i]);
			System.out.println();
		}
		entrada.close();
	}
}
