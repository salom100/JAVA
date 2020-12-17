package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String []args){
		Exercicio_Livros l1= new Exercicio_Livros("Fundamentos da programação de computadores","Ascencio",2012);
		Exercicio_Livros l2= new Exercicio_Livros("Programação com C","Professor X",2010);
		Exercicio_Livros l3= new Exercicio_Livros("Programação com Java","professor Y",2013);
		
		JOptionPane.showMessageDialog(null, "Dados dos Livros: \n"
				+ "Livro 1: \n"
				+ "Titulo:"+l1.getTitulo()+"\n"
						+ "Autor:"+l1.getAutor()+"\n"
								+ "Ano:"+l1.getAno()+"\n"
								+ "Livro 2: \n"
								+ "Titulo:"+l2.getTitulo()+"\n"
										+ "Autor:"+l2.getAutor()+"\n"
												+ "Ano:"+l2.getAno()+"\n"
												+ "Livro 3: \n"
												+ "Titulo:"+l3.getTitulo()+"\n"
														+ "Autor:"+l3.getAutor()+"\n"
																+ "Ano:"+l3.getAno()+"\n");
		
		l1.setTitulo("Faltou a Banana na prova");
		l2.setAutor("Paulo Coelho");
		l3.setAno(2014);
		
		JOptionPane.showMessageDialog(null, "Alterando alguns Dados\n");
		JOptionPane.showMessageDialog(null, "Dados dos Livros: \n"
				+ "Livro 1: \n"
				+ "Titulo:"+l1.getTitulo()+"\n"
						+ "Autor:"+l1.getAutor()+"\n"
								+ "Ano:"+l1.getAno()+"\n"
								+ "Livro 2: \n"
								+ "Titulo:"+l2.getTitulo()+"\n"
										+ "Autor:"+l2.getAutor()+"\n"
												+ "Ano:"+l2.getAno()+"\n"
												+ "Livro 3: \n"
												+ "Titulo:"+l3.getTitulo()+"\n"
														+ "Autor:"+l3.getAutor()+"\n"
																+ "Ano:"+l3.getAno()+"\n");
	}
}
