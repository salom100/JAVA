package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double altura;
		double somaaltura=0;
		String sexo;
		double maior=0;
		double menor=50;
		double mediaM=0;
		int contm=0;
		double homens=0;
		double porcentagem=0;
		int cont=0;
		for(cont=0;cont<2;cont++){
			System.out.println("Digite sua altura EX(3.72) P("+(cont+1)+")");
			altura= Double.parseDouble(entrada.nextLine());
			System.out.println("Voce e Masculino ou feminino ?");
			sexo=String.valueOf(entrada.nextLine());
			if(sexo.equalsIgnoreCase("feminino")){
				somaaltura=somaaltura+altura;
				contm++;
			}else if(sexo.equalsIgnoreCase("masculino")){
				homens++;
			}
			if(altura>maior){
				maior=altura;
			}
			if(altura<menor){
				menor=altura;
			}
		}
		if(contm==0){
			mediaM=0;
		}else{
			mediaM=somaaltura/contm;
		}
		porcentagem=(homens/2)*100;
		System.out.println("A maior altura registrada foi :"+maior+" metros");
		System.out.println("A menor altura registrada foi:"+menor+" metros");
		System.out.println("A media da altura da mulheres e de:"+mediaM);
		System.out.println("A porcentagem de homens no teste foi de "+porcentagem+"%");
		entrada.close();
	}
}
