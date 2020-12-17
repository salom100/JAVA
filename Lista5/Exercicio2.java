
 package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		ArrayList <Integer> numeros = new ArrayList<>();
		int numero;
		int menor = 1000;
		int  id= 0;
		int c;
		int i = 0;
		int r = 0;
		
		for (i=0;i<20;i++){
			System.out.println("Digite um valor para a posição "+(i+1));
			numero = Integer.parseInt(entrada.nextLine());
			numeros.add(numero);
		}
		for (i=0;i<20;i++){
			for (r=i;r<20;r++){
				if (numeros.get(r) < menor){
					menor = numeros.get(r);
					id = r;
				}
			}
			c = numeros.get(i);
			numeros.set(i, menor);
			numeros.set(id, c);
			menor = 1000;
		}		
		
		System.out.println(numeros);
		entrada.close();
	}
}





