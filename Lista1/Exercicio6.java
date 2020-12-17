package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int lampadas=0;
		double potencia;
		double largura;
		double comprimento;// divide por 18
		System.out.println("Digite a largura do quarto em metros: ");
		largura= Double.parseDouble(entrada.nextLine());
	 	System.out.println("Digite o comprimento do quarto em metros: ");
	 	comprimento=Double.parseDouble(entrada.nextLine());
	 	System.out.println("Digite a potencia das lampadas utilizadas");
	 	potencia= Double.parseDouble(entrada.nextLine());
	 	lampadas= (int)(((comprimento*largura)*18)/potencia);
		System.out.println("O numero de lampadas necessarias é: "+lampadas);
		
		entrada.close();
	}
}
