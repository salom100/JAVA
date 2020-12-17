package br.edu.ifcvideira.Lista4;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
			int []codigos= new int [10];
			String []nomes= new String[10];
			double []preco=new double[10];
			int []quantidade=new int[10];
			int i,j,v,c;
			int busca;
			double[]soma=new  double[10];
			double somaTotal=0;
			for(i=0;i<10;i++) {
				System.out.println("Digite o codigo do produto (de 0 a 9) "+(i+1));
				codigos[i]=Integer.parseInt(entrada.nextLine());
				System.out.println("Digite o nome do produto "+(i+1));
				nomes[i]=String.valueOf(entrada.nextLine());
				System.out.println("Digite o preço do produto "+(i+1));
				preco[i]=Double.parseDouble(entrada.nextLine());
				System.out.println("Digite a quantidade do produto "+(i+1));
				quantidade[i]=Integer.parseInt(entrada.nextLine());
			}
			for(;;) {
				System.out.println("Digite o codigo do produto que deseja");
				busca=Integer.parseInt(entrada.nextLine());
				if(busca<0) {
					break;
				}else {
						for(i=0;i<10;i++) {
							if(codigos[i]==busca) {
								System.out.println("Foi venda ou compra ? 1(venda) 2(compra)");
								j=Integer.parseInt(entrada.nextLine());
								if(j==1) {
									System.out.println("Digita quantas unidades foram vendidas");
									v=Integer.parseInt(entrada.nextLine());
									quantidade[i]=quantidade[i]-v;
								}else if(j==2) {
									System.out.println("Digite a quantidade que foi comprada");
									c=Integer.parseInt(entrada.nextLine());
									quantidade[i]=quantidade[i]+c;
								}
							}
						}
				}
			}
			for(i=0;i<10;i++) {
				soma[i]=preco[i]*quantidade[i];
				somaTotal+=soma[i];
			}
			for(i=0;i<10;i++) {
				System.out.println("codigo: "+codigos[i]+" Nome: "+nomes[i]+" Preço "+preco[i]+" Quantidade: "+quantidade[i]+" Valor do estoque: "+soma[i] );
			}
			System.out.println("A soma total dos produtos no estoque e: "+somaTotal);
			entrada.close();
	}
}
