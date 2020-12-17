package br.edu.ifcvideira.Lista5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		ArrayList <String>alunos = new ArrayList<String>(); 
		int i=0,opcao=0,r=0;
		String nome;
		for(;;){
			System.out.println("1)Inserir alunos \n"//inserir no meio ou no final
					+ "2)Consultar Aluno \n"//nome ou posição
					+ "3)Remover aluno \n"//nome ou posição
					+ "4)Sair");
			opcao=Integer.parseInt(entrada.nextLine());
			if(opcao==1){
				System.out.println("1)Inserir no final \n"
						+ "2)Inserir no meio");
				opcao=Integer.parseInt(entrada.nextLine());
				if(opcao==1) {
					System.out.println("Digite o nome do aluno ");
					nome=String.valueOf(entrada.nextLine());
					alunos.add(nome);
					i+=1;
				}
				else if(opcao==2) {
					System.out.println("Digite o nome do aluno ");
					nome=String.valueOf(entrada.nextLine());
					alunos.add(alunos.get(i/2));
					alunos.set((i/2), nome);
					i+=1;
				}
			}else if(opcao==2){
				System.out.println("Procurar por 1)Nome 2)posição ");
				opcao=Integer.parseInt(entrada.nextLine());
				if(opcao==1) {
					System.out.println("Digite o nome do aluno para busca-lo");
					nome=String.valueOf(entrada.nextLine());
						if(alunos.contains(nome)) {
							System.out.println("O Aluno foi encontrado");
						}else {
							System.out.println("O aluno nao se encontra no sistema");
						}
					}else if(opcao==2) {
					System.out.println("Digite a posição do aluno");
					r=Integer.parseInt(entrada.nextLine());
					System.out.println(alunos.get(r));
				}
				
			}else if(opcao==3){
				System.out.println("1)Nome 2)Posição");
				opcao=Integer.parseInt(entrada.nextLine());
				if(opcao==1) {
					System.out.println("Digite o nome do aluno ");
					nome=String.valueOf(entrada.nextLine());
					alunos.remove(nome);
					i-=1;
				}else if(opcao==2) {
					System.out.println("Digite a posição do aluno");
					r=Integer.parseInt(entrada.nextLine());
					alunos.remove(r);
					i-=1;
				}
			}else if(opcao==4){
				break;
			}
		}
		entrada.close();
	}
}
