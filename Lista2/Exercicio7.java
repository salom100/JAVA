package br.edu.ifcvideira.Lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("0.00");
		double tipo;//1-10.20 // 2-19.50
		double local;//0.50
		double localp=0;
		double inter;//1.10
		double interp=0;
		double total=0;
		double taxa=0;//30%
		double totalfinal=0;//total+total
		
		System.out.println("Digite o tipo de celular: (1)residencial (2)interurbano");
		tipo= Double.parseDouble(entrada.nextLine());
		if((tipo==1)||(tipo==2)){
		System.out.println("Digite quantos minutos foram usados em chamadas locais:");
		local= Double.parseDouble(entrada.nextLine());
		System.out.println("Digite quantos minutos foram usados em chamadas interurbanos:");
		inter= Double.parseDouble(entrada.nextLine());
		
			if(tipo==1){
			tipo+=10.20;
			System.out.println("seu tipo de telefone é residencial");
		}else if(tipo==2){
			tipo+=19.50;
			System.out.println("Seu tipo de telefone e Comercial");
		}
		localp=local*0.50;
		interp=inter*1.10;
		total=tipo+localp+interp;
		taxa=total*0.30;
		totalfinal=total+taxa;
		
		System.out.println("Ele gastou em minutos locais igual a: "+localp+" Reais");
		System.out.println("Ele gastou em minutos interubanos o equivalente a: "+interp+" Reais");
		System.out.println("O valor total é: "+df.format(total)+" Reais");
		System.out.println("Ele vai pagar uma taxa de 30% que e igual a: "+df.format(taxa)+" Reais");
		System.out.println("O valor total com a taxa e igual a: "+df.format(totalfinal)+" Reais");
		
		}else{
			System.out.println("Fim do programa tipo de telefone não identificado");
		}
		entrada.close();
	}
}