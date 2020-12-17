package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double [][]v1= new double [5][2];
		double []v2= new double [5];
		int i,j;
		for(j=0;j<5;j++){
			for(i=0;i<2;i++){
				System.out.println("Digite o tamanho do "+(i+1)+"º lado do triangulo "+(j+1));
				v1[j][i]=Double.parseDouble(entrada.nextLine());
			}
		}
		
		for(j=0;j<5;j++){
			i=0;
				v2[j]=(v1[j][i]*v1[j][i+1])/2;
			
		}
		
		
		for(j=0;j<5;j++){
			for(i=0;i<2;i++){
				System.out.print(v1[j][i]+" ");
				
			}
			System.out.print("\n");
		}
		
		for(i=0;i<5;i++){
			System.out.println("A area do triangulo "+(i+1)+" é: "+v2[i]);
		}
		entrada.close();
	}
}
