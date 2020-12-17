package br.edu.ifcvideira.Lista1;

import java.util.Scanner;//* se coloca para carregar tudo da biblioteca util no lugar do scanner

//(ctrl+espaço) cria e auxilia o programador nos codigos IMPORTANTE!!
public class Exercicio1 {
	public static void main(String[] args) {
		int x;
		int y;
		double quociente=0;
		double resto=0;
		
		Scanner entrada = new Scanner(System.in); //entrada pode ser subtituido por qulquer nome
		//classe para fazer a leitura
		System.out.println("Digite um valor para X:");
		x = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite um valor para Y");
		y= Integer.parseInt(entrada.nextLine());
		
		quociente =(double) x / y;
		resto = x % y;
		
		System.out.println("A divisão entre x e y é:"+quociente+"\n"
		         +"O resto da divisao entre x e y e:"+resto+".");
		
		entrada.close();
	}
}
