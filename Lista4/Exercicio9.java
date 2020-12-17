package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int []codigos=new int[35];
		double []salarios=new double[35];
		int i;
		for(i=0;i<35;i++) {
			System.out.println("Digite o codigo do funcionario "+(i+1));
			codigos[i]=Integer.parseInt(entrada.nextLine());	
		}
		for(i=0;i<35;i++) {
			System.out.println("Digite o salario do funcionario de codigo "+codigos[i]);
			salarios[i]=Double.parseDouble(entrada.nextLine());
		}
		System.out.println("As pessoa com os salarios superiores a 880 reais sao respectivamente :");
		for(i=0;i<35;i++) {
			if(salarios[i]>880) {
				System.out.println("pessoa "+(i+1)+" Codigo "+codigos[i]);
			}
		}
		entrada.close();
	}
}
