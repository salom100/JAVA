package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int saque;
		int cont=0;
		int conta;
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		System.out.println("Digite o valor a ser sacado: O ultimo numero nao pode ser (1) (3) (7) ou (9) ");
		saque= Integer.parseInt(entrada.nextLine());
		for(conta=0;cont<=saque;conta++) {
			if(saque>=50) {
				for(cont=0;cont<=saque;cont+=50) {
				a+=1;
			}
				saque=(saque-cont)+50;
			}
			if((saque<50)&&(saque>=10)) {
				for(cont=0;cont<=saque;cont+=10) {
					b+=1;
					}
				saque=(saque-cont)+10;
				}
			
			if((saque<10)&&(saque>=5)&&(saque%5==0)) {
				for(cont=0;cont<=saque;cont+=5) {
				c+=1;
			}
				saque=(saque-cont)+5;
				}
			
			if((saque<10)&&(saque!=0)) {
				for(cont=0;cont<=saque;cont+=2) {
				d+=1;
									}
								}
			if(saque==0) {
				break;
			}
		}
		if(a>0) {
			a-=1;
		}
		if(b>0) {
			b-=1;
		}
		if(c>0) {
			c-=1;
		}
		if(d>0) {
			d-=1;
		}
		System.out.println("Notas oferecidas");
		System.out.println("50 reais="+a+""
				+ "\n 10 reais="+b+""
						+ "\n 5 reais="+c+" "
								+ "\n 2 Reais="+d);
		
		entrada.close();
		}
}
