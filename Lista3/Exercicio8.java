package br.edu.ifcvideira.Lista3;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		double saldo=0.00;
		double valores=0.00;
		String opcao;
		for(;;){
			System.out.println("Digite a letra da opção:"
					+ "\n A)Consulta Saldo"
					+ "\n B)Saque"
					+ "\n C)Deposito"
					+ "\n D)Saldo"
					+ "\n e)Sair");
			opcao= String.valueOf(entrada.nextLine());
			if(opcao.equalsIgnoreCase("a")){
				System.out.println("Seu saldo é igual a :"+saldo+" Reais");
			}else if(opcao.equalsIgnoreCase("b")){
				System.out.println("Digite o valor que deseja sacar:");
				valores=Double.parseDouble(entrada.nextLine());
				if(valores>saldo){
					System.out.println("Valor digitado é maior que o saldo");
				}else{
					saldo=saldo-valores;
				}
				System.out.println("Seu saldo e de :"+saldo+" Reais");
			}else if(opcao.equalsIgnoreCase("c")){
				System.out.println("Digite o valor que sera depositado:");
				valores= Double.parseDouble(entrada.nextLine());
				if(valores<0){
					System.out.println("O Valor do saque e negativo por isso não sera realizada a operação.");
				}else{
					saldo=saldo+valores;
				}
				System.out.println("Seu saldo atual e de :"+saldo+" Reais");
			}if(opcao.equalsIgnoreCase("d")){
				System.out.println("Seu saldo atual e de :"+saldo+" Reais");
			}else if(opcao.equalsIgnoreCase("e")){
				System.out.println("Finalizando...");
				break;
			}
		}
		entrada.close();
	}
}
