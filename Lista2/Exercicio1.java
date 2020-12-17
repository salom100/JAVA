package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String senha="1234";
		String senhaDigitada;
		
		System.out.println("Digite a senha:");
		senhaDigitada=String.valueOf(entrada.nextLine());
		
		if(senha.equals(senhaDigitada)){
			System.out.println("Acesso Permitido");	
		}else{
			System.out.println("Acesso negado");
		}
		entrada.close();
	}
}
