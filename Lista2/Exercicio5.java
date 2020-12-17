package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double l1;
		double l2;
		double l3;
		int cont=0;
		System.out.println("Digite o tamanho do primeiro lado do triangulo: ");
		l1= Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o tamanho do segundo lado do triangulo: ");
		l2= Double.parseDouble(entrada.nextLine());
		System.out.println("Digite o tamanho do terceiro lado do triangulo: ");
		l3= Double.parseDouble(entrada.nextLine());
		
		if(l1==l2){
			cont+=1;
		}
		if(l1==l3){
			cont+=1;
		}
		if(l2==l3){
			cont+=1;
		}
		if(cont==3){
			System.out.println("É um triangulo equilatero");
		}else if(cont==1){
			System.out.println("É um triangulo isosceles");
		}else if(cont==0){
			System.out.println("É um triangulo escaleno");
		}
		entrada.close();
	}
}