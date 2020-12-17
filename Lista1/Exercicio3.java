package br.edu.ifcvideira.Lista1;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		String nome;// String começa sempre com letra maiuscula pois e uma classe
		int idade;
		double salario;
		System.out.println("Digite o nome da pessoa");
		nome = String.valueOf(entrada.nextLine());
		System.out.println("Digite o salario de "+nome);
		salario = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a idade de "+nome);
		idade = Integer.parseInt(entrada.nextLine());
		System.out.println("Dados da pessoa: \n"
				+ "Nome:"+nome+"\n"
				+"Salario:"+salario+"\n"
				+"Idade:"+idade+" Anos");
		
		entrada.close();
	}
}
