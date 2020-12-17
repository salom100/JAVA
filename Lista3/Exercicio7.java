package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra;//recebe a letra digitada;
		String memoria="x";//recebe as letras;
		int repeticoes=0;
		for(;;){
			System.out.println("Digite uma letra : (digite X para finalizar)");
			letra = String.valueOf(entrada.nextLine());
			if(letra.equalsIgnoreCase("x")){
				break;
			}else{
				if(letra.equalsIgnoreCase(memoria)){
					repeticoes+=1;
				}
				memoria=letra;
			}
		}
		System.out.println("O numero de repetições de letra e igual a:"+repeticoes);
		entrada.close();
	}
}
