package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double hora;
		double mes;
		double sb=0;
		double imposto=0;//11%
		double inss=0;//8%
		double sindicato=0;//5%
		double sl=0;
		
		System.out.println("Digite quanto voc� ganha por hora:");
		hora= Double.parseDouble(entrada.nextLine());
		System.out.println("Digite quantas horas voc� trabalhou no m�s");
		mes=Double.parseDouble(entrada.nextLine());
		
		sb=hora*mes;
		imposto= sb*0.11;
		inss= sb*0.08;
		sindicato=sb*0.05;
		sl=sb-(imposto+inss+sindicato);
		
		System.out.println("Seu salario Bruto �: "+sb+" Reais");
		System.out.println("Pagou ao imposto de renda: "+imposto+" Reais");
		System.out.println("Pagou ao inss: "+inss+" Reais");
		System.out.println("Pagou ao sindicato: "+sindicato+" Reais");
		System.out.println("Seu salario liquido �: "+sl+" Reais");
		
		entrada.close();
		
	}
}
