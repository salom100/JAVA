package br.edu.ifcvideira.Lista7;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		Exercicio3_Professor p1 = new Exercicio3_Professor();
		
		int op;
		
		p1.setProfessor(JOptionPane.showInputDialog("Digite o nome do professor:"));
		p1.setDepartamento(JOptionPane.showInputDialog("Digite o departamento do professor: "+p1.getProfessor()));
        p1.setRegistros(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de registros")));
        p1.setAdmissao(Integer.parseInt(JOptionPane.showInputDialog("Digite a data de admissão")));
        
       for(;;){
    	   op=Integer.parseInt(JOptionPane.showInputDialog("Dados do professor: \n\n"
    	   		+ "Nome: "+p1.getProfessor()+" \n"
    	   				+ "Departamento: "+p1.getDepartamento()+" \n"
    	   						+ "Nº Registros: "+p1.getRegistros()+" \n"
    	   								+ "Data de Admissao: "+p1.getAdmissao()+" \n\n"
    	   										+ "Qual dado você deseja alterar\n"
    	   										+ "1- Nome do professor\n"
    	   										+ "2- Departamento \n"
    	   										+ "3- Nº de Registros \n"
    	   										+ "4- Data de Admissão \n"
    	   										+ "5- Sair\n"));
    	   if(op==1) {
    		   p1.setProfessor(JOptionPane.showInputDialog("Insira o novo nome do professor:"));
    	   }else if(op==2) {
    		   p1.setDepartamento(JOptionPane.showInputDialog("Insira o novo departamento do professor:"));
    	   }else if(op==3) {
    		   p1.setRegistros(Integer.parseInt(JOptionPane.showInputDialog("Insira o novo Numero de Registro do Professor:")));
    	   }else if(op==4) {
    		   p1.setAdmissao(Integer.parseInt(JOptionPane.showInputDialog("Insira a nova data de admissão")));
    	   }else if(op==5) {
    		   JOptionPane.showMessageDialog(null, "Finalizando...");
    		   break;
    	   }else {
    		   JOptionPane.showMessageDialog(null,"Opção Invalida");
    	   } 
       }
       JOptionPane.showMessageDialog(null,"Os Dados Atuais São : \n\n"
       		+ "Nome do Professor: "+p1.getProfessor()+" \n"
       				+ "Departamento: "+p1.getDepartamento()+" \n"
       						+ "Nº de Registros: "+p1.getRegistros()+" \n"
       								+ "Data de Admissão: "+p1.getAdmissao()+" \n\n\n"
       										+ "Finalizando...\n"); 
       
       
	}
	
	
}
