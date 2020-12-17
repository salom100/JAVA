package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double largura;
		double altura;
		double comprimento;
		double LA=0;
		double LC=0;
		double CA=0;
		int total=0;
		System.out.println("Digite o comprimento da cozinha: ");
		comprimento=Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a altura da cozinha: ");
		altura=Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a largura da cozinha");
		largura=Double.parseDouble(entrada.nextLine());
		
		LA= (largura*altura)/1.5;
		LC= ((largura*comprimento)*2)/1.5;
		CA= ((comprimento*altura)*2)/1.5;
		total=(int)(LA+LC+CA);
		System.out.println("O numero de caixas necessarias é:"+total+" Caixas");
		
		entrada.close();
		
	}
}
