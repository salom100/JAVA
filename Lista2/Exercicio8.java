package br.edu.ifcvideira.Lista2;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int chave;
		int numero;
		int distancia=0;
		int cont=0;
		System.out.println("Digite o numero chave");
		chave=Integer.parseInt(entrada.nextLine());
		System.out.println("Você tera 10 chances de acertar o numero chave boa sorte");
		for(cont=0;cont<10;cont++){
			System.out.println("Digite um numero entre 0 a 100. chance("+(cont+1)+")");
			numero= Integer.parseInt(entrada.nextLine());
			if((numero>=0)&&(numero<=100)){
				distancia=chave-numero;
				if(distancia==0){
					System.out.println("Você acertou o numero chave que e:"+chave);
					break;
				}else if(distancia<0){
					distancia=distancia*-1;
				}
				System.out.println("o numero chave é: "+chave+" O numero digitado é:"+numero+" A distancia do numero chave é: "+distancia);
			}else{
				System.out.println("O numero e invalido pois nao esta entre 0 e 100");
			}
		}
		entrada.close();
	}
}
