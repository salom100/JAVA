package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int matriz [][] = new int [3][3];
		int i,j;
		int s1=1;
		int s2=1;
		int s3=1;
		int s4=1;
		int s5=1;
		int s6=1;
		int determinante=0;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.println("Digite um numero para posição: ("+(i+1)+","+(j+1)+")");
				matriz[i][j]= Integer.parseInt(entrada.nextLine());
			}
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");
				}
			System.out.println();
		}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++) {
				if(i==j) {
				s1*=matriz[i][j];	
				}
				if((i+j)==2) {
				s4*=matriz[i][j];	
				}
				
				if((j-i)==1) {
				s2*=matriz[i][j];
				}
			}
		}
		s2*=matriz[2][0];
		s3=matriz[0][2]*matriz[1][0]*matriz[2][1];
		s5=matriz[0][0]*matriz[1][2]*matriz[2][1];
		s6=matriz[0][1]*matriz[1][0]*matriz[2][2];
		
		determinante=(s1+s2+s3)-(s4+s5+s6);
		System.out.println("Numeros a serem somados"+s1+", "+s2+", "+s3);
		System.out.println("Numeros a serem subtraidos"+s4+", "+s5+", "+s6);
		System.out.println("A determinante do valor é :"+determinante);
		entrada.close();
	}
}
