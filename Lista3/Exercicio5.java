package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int primo;
		int divisor=1;
		int teste;
		for(primo=100;primo<1000;primo++) {
			teste=0;
			if(primo%2==1) {
				teste+=1;
			}
			for(divisor=1;divisor<primo;divisor++) {
				if(primo%divisor==0) {
				teste+=1;
				}
			}
			if(teste==2) {
				System.out.println(primo+"\n");
			}
			
		}
		entrada.close();
	}
}
