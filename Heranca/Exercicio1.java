package br.edu.ifcvideira.Heranca;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Gerente ge= new Gerente();
		AssistenteTecnico at = new AssistenteTecnico();
		AssistenteAdministrativo ad= new AssistenteAdministrativo();
		
		int op;
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de funcionario deseja cadastrar ? \n"
					+ "1- Gerente \n"
					+ "2- Assistente Tecnico \n"
					+ "3- Assistente Administrativo \n"
					+ "4- sair"));
			if(op==1){
				ge.setNome(String.valueOf(JOptionPane.showInputDialog("Qual e  o nome do gerente ?")));
				ge.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+ge.getNome())));
				ge.setCargo("Gerente");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "nome: "+ge.getNome()+" \n"
								+ "cargo: "+ge.getCargo()+" \n"
										+ "Salario total : "+ge.calcularSalarioGerente()+" \n");
			}else if(op==2){
				at.setNome(String.valueOf(JOptionPane.showInputDialog("Qual e  o nome do Assitente Tecnico ?")));
				at.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+at.getNome())));
				at.setCargo("Assistente tecnico");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "nome: "+at.getNome()+" \n"
								+ "cargo: "+at.getCargo()+" \n"
										+ "Salario total : "+at.calcularSalarioAssistTecnico()+" \n");
			}else if(op==3){
				ad.setNome(String.valueOf(JOptionPane.showInputDialog("Qual e  o nome do Assitente Administrativo ?")));
				ad.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+ad.getNome())));
				ad.setCargo("Assistente tecnico");
				ad.setTurno(Integer.parseInt(JOptionPane.showInputDialog("Qual e o turno que ele trabalha ? \n"
						+ "1- manha \n"
						+ "2- tarde \n"
						+ "3- noite \n")));
				if(ad.getTurno()==3){
					JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
							+ "nome: "+ad.getNome()+" \n"
									+ "cargo: "+ad.getCargo()+" \n" 
											+ "Salario total : "+ad.calculaSalarioAssistAdm()+" \n");
				}else{
					JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
							+ "nome: "+ad.getNome()+" \n"
									+ "cargo: "+ad.getCargo()+" \n" 
											+ "Salario total : "+ad.getSalario()+" \n");
				}
				
			}else if(op==4){
				JOptionPane.showMessageDialog(null, "Encerrando ...");
				break;
			}else{
				JOptionPane.showMessageDialog(null, "A opçao selecionada e invalidamente invalida pois não esta de acordo com as politicas oferecidas de opções de cadastramento de funcionarios", "Erro",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
