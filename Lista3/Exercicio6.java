package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
			int numero;
			int cont=0;
			System.out.println("Digite  um numero");
			numero= Integer.parseInt(entrada.nextLine());
			System.out.println("O numero divisores de resto 0 são:");
			for(cont=1;cont<=numero;cont++){
				if(numero%cont==0){
					System.out.println(cont+" ");
				}
			}
		entrada.close();
	}
}
