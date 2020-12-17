package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int idade;
		int velho=0;
		int novo=120;
		String sexo;
		int mulheres=0;
		double salario;
		double somasalario=0;
		double media=0;
		int cont=0;
		for(;;){
			System.out.println("Digite a sua idade: (digite uma idade negativa para finalizar)");
			idade= Integer.parseInt(entrada.nextLine());
			if(idade<0){
				break;
			}else{
				if(idade>velho){
					velho=idade;
				}
				if(idade<novo){
					novo=idade;
				}
				cont+=1;
				System.out.println("Digite o seu sexo (M)Masculino (F)Femino");
				sexo=String.valueOf(entrada.nextLine());
				System.out.println("Digite o seu salario:");
				salario=Double.parseDouble(entrada.nextLine());
				somasalario+=salario;
			}
			if((sexo.equalsIgnoreCase("f"))&&(salario<=2000)){
				mulheres+=1;
			}
}
		media=somasalario/cont;
		System.out.println("A media dos salario e igual a:"+media);
		System.out.println("A pessoa mais velha tem "+velho+" Anos "
				+ "\n A pessoa mais nova tem "+novo+" Anos"
						+ "\n O numero de mulheres com o salario ate 2000 e:"+mulheres);
		
	
		entrada.close();
	}
}
