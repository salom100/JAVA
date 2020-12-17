package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		double massa=0;
		double densidade=0;
		double volume=0;
		double preco=0;
		double valorTotal=0;
		
		System.out.println("Qual é a massa do leite fornecido");
		massa= Double.parseDouble(entrada.nextLine());
		System.out.println("Qual é a densidade do leite fornecido");
		densidade= Double.parseDouble(entrada.nextLine());
		System.out.println("Qual é o preço por Kg de leite");
		preco= Double.parseDouble(entrada.nextLine());
		
		volume= massa/densidade;
		valorTotal=massa*preco;
		
		System.out.println("O volume de leite calculado é: "+df.format(volume));
		System.out.println("O valor a ser pago ao fornecedor "+df.format(valorTotal)+" Reais");
		
		if(densidade<1.14){
			System.out.println("Ele é de categoria I");
		}else if((densidade>=1.14)&&(densidade<=1.20)){
			System.out.println("Ele é de categoria II");
		}else{
			System.out.println("Ele é de categoria III");
		}
		entrada.close();
	}
}
