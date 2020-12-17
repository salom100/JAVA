package br.edu.ifcvideira.treino;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Exercicio_teste_geral {
	public static void main(String args[]) {
		Exercicio_GeralMenu G = new Exercicio_GeralMenu();
		ArrayList<String>estudantes=new ArrayList<String>();
		Scanner entrada= new Scanner(System.in);
		String melhores[]=new String[5];
		int op;
		String nome;
		double salario=0;
		int busca;
		int i;
		for(;;) {
			op=Integer.parseInt(JOptionPane.showInputDialog("escolha uma das opções \n"
					+"1- Cadastrar Alunos em uma ArrayList\n"
					+"2- Inserir alguem importante para você \n"
					+"3- Inserir seus dados em um encapsulamento \n"
					+"4- listar os melhores \n"
					+"5- ver os dados do encapsulamento \n "
					+"6- procurar um estudante \n"
					+"7- Sair \n"));
			if(op==1) {
				System.out.println("Digite o nome do aluno para que ele seja inserido");
				nome=String.valueOf(entrada.nextLine());
				estudantes.add(nome);
				if(estudantes.contains(nome)) {
					JOptionPane.showMessageDialog(null, "O nome foi cadastrado com sucesso");
				}else {
					JOptionPane.showMessageDialog(null, "O nome nao foi cadastrado");
				}
			}else if(op==2) {
				for(i=0;i<5;i++) {
					nome=(JOptionPane.showInputDialog("digite o nome da "+(i+1)+"º pessoa importante"));
					melhores[i]=nome;
				}
			}else if(op==3) {
				nome=(JOptionPane.showInputDialog("Insira o seu nome"));
				G.setnome(nome);
				salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario"));
				G.setsalario(salario);	
			}else if(op==4) {
				for(i=0;i<5;i++) {
					System.out.println(melhores[i]);
				}
			}else if(op==5) {
				JOptionPane.showMessageDialog(null, "Os dados do encapsulamento são: \n"
						+"nome: "+G.getnome()+"\n"
						+"Salario: "+G.getsalario()+" \n");
			}else if(op==6) {
				op=Integer.parseInt(JOptionPane.showInputDialog("Como deseja encontralo ? \n"
						+"1- nome \n"
						+"2- numero \n"));
				if(op==1) {
					nome=(JOptionPane.showInputDialog("Digite o nome do estudante"));
					if(estudantes.contains(nome)) {
						JOptionPane.showMessageDialog(null, "O aluno se encontra na lista");
					}
				}else if(op==2) {
					busca=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero para saber quem se encontra nele"));
					JOptionPane.showMessageDialog(null,"O nome que se encontra e: "+estudantes.get(busca));
				}
			}else if(op==7) {
				JOptionPane.showMessageDialog(null,"Finalizando");
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Opção Invalida !!");
			}
		}
	}
	
	
	
}
