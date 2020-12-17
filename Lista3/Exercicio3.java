package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double idades;
		double somaidades=0;
		double cont=0;
		double media=0;
		for(;;){
			System.out.println("Digite a sua idade (digite 0 para finalizar)");
			idades= Integer.parseInt(entrada.nextLine());
			if(idades==0){
				break;
			}
			cont+=1;
			somaidades=somaidades+idades;
			
		}
		media= somaidades/cont;
		System.out.println("A media das idades e de:"+media);
		System.out.println("O numero de idades digitadas é:"+cont);
		entrada.close();
	}
}
