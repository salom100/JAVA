package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int sexo;
		double altura;
		double peso=0;
		System.out.println("Digite o seu sexo: (1)F (2)M ");
		sexo=Integer.parseInt(entrada.nextLine());
		
		System.out.println("Digite a sua altura: EX(1.50) ");
		altura=Double.parseDouble(entrada.nextLine());
		
		if(sexo==1){
			System.out.println("Peso ideal para mulheres: \n");
			peso=(62.1*altura)-44.7;
			System.out.println("Seu peso ideal é: "+peso+" KG");
		}else if(sexo==2){
				System.out.println("Peso ideal para homens: \n");
			peso=(72.2*altura)-58;
					System.out.println("Seu peso ideal é:"+peso+" KG");
		}
		
		
		entrada.close();
	}
}
