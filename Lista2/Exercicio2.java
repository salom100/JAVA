package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int macas;
		
		System.out.println("Digite o numero de maças compradas");
		macas= Integer.parseInt(entrada.nextLine());
		
		if(macas>=12){
			System.out.println("O preço que ele deve pagar sera "+macas*0.25);
		}else{
			System.out.println("O total a pagar é: "+macas*0.30);
		}
		entrada.close();
	}
}
