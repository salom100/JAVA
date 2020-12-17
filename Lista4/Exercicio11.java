package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int []janeiro=new int[10];
		int []fevereiro=new int[10];
		int []marco=new int[10];
		int []abril=new int[10];
		int []maio=new int[10];
		int []junho=new int[10];
		int []julho=new int[10];
		int []agosto=new int[10];
		int []setembro=new int[10];
		int []outubro=new int[10];
		int []novembro=new int[10];
		int []dezembro=new int[10];
		int []semestre1=new int[10];
		int []semestre2=new int[10];
		int i;
		for(i=0;i<10;i++) {
			System.out.println("Digite a quantidade vendida do produto"+(i+1)+" no mes de janeiro ");
			janeiro[i]=Integer.parseInt(entrada.nextLine());
			semestre1[i]+=janeiro[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de fevereiro");
			fevereiro[i]=Integer.parseInt(entrada.nextLine());
			semestre1[i]+=fevereiro[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de março");
			marco[i]=Integer.parseInt(entrada.nextLine());
			semestre1[i]+=marco[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de abril");
			abril[i]=Integer.parseInt(entrada.nextLine());
			semestre1[i]+=abril[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de maio");
			maio[i]=Integer.parseInt(entrada.nextLine());
			semestre1[i]+=maio[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de junho");
			junho[i]=Integer.parseInt(entrada.nextLine());
			semestre1[i]+=junho[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de julho");
			julho[i]=Integer.parseInt(entrada.nextLine());
			semestre2[i]+=julho[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de agosto");
			agosto[i]=Integer.parseInt(entrada.nextLine());
			semestre2[i]+=agosto[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de setembro");
			setembro[i]=Integer.parseInt(entrada.nextLine());
			semestre2[i]+=setembro[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de outubro");
			outubro[i]=Integer.parseInt(entrada.nextLine());
			semestre2[i]+=outubro[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de novembro");
			novembro[i]=Integer.parseInt(entrada.nextLine());
			semestre2[i]+=novembro[i];
			System.out.println("Digite a quantidade vendida do produto "+(i+1)+" no mes de dezembro");
			dezembro[i]=Integer.parseInt(entrada.nextLine());
			semestre2[i]+=dezembro[i];
		}
		System.out.println("A quantidade vendida de cada produto no primeiro semestre e no segundo semestre são:");
		for(i=0;i<10;i++) {
			System.out.println("Produto "+(i+1)+"semestre 1: "+semestre1[i]+" Semestre 2: "+semestre2[i]);
		}
		
		
		entrada.close();
	}
}
