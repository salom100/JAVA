package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio4{
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int lados;
		double tamanho;
		double area=0;
		
		System.out.println("Diga quantos lados tem o poligono: ");
		lados= Integer.parseInt(entrada.nextLine());
		System.out.println("Digite o tamanho dos lados (eles tem o mesmo tamanho)");
		tamanho=Double.parseDouble(entrada.nextLine());
		if(lados==3){
			System.out.println("E um triangulo");
			area=(tamanho*tamanho)/2;
			System.out.println("A area do triangulo é: "+area);
		}else if(lados==4){
			System.out.println("É um quadrado");
			area=tamanho*tamanho;
			System.out.println("A area do quadrado é: "+area);
		}else if(lados==5){
			System.out.println("É um Pentagono");
		}else{
			System.out.println("O numero de lados do poligono nao pode ser identificado para saber seu nome");
		}
		
		entrada.close();
	}
}

