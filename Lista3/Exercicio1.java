package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int v1;
		int v2;
		int cont=0;
		System.out.println("Digite  um numero inteiro");
		v1= Integer.parseInt(entrada.nextLine());
		System.out.println("Digite outro numero inteiro");
		v2= Integer.parseInt(entrada.nextLine());
		if(v1<v2){
			System.out.println("O primeiro valor e menor que o segundo");
			while(v1<(v2-1)){
				cont+=1;
				v1+=1;
				System.out.print(v1+" ");
			}
			System.out.println("\n Sua distancia e de:"+cont);
		}else {
			System.out.println("Nao foi possivel executar a operaçao, numero 1 nao e maior que o numero 2");
		}
		entrada.close();
	}
}
