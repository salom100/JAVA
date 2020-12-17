package br.edu.ifcvideira.Lista6;

import javax.swing.JOptionPane;

public class Caixa {
	public static void main(String[] args) {
		ContaCorrente cc= new ContaCorrente();
		int op;
		double valor;
		
		for(;;){
			op=Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção:\n"
					+ "1 - Depósito\n"
					+ "2 - Saque\n"
					+ "3 - Saldo\n"
					+ "4 - Sair\n"));
			if(op==1){
				cc.deposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito:")));
			}else if(op==2){
				valor=Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
				if(valor<=cc.getSaldo()){
					cc.saque(valor);
				}else{
					JOptionPane.showMessageDialog(null, "Saque não efetuado!!!\n"
							+ "Saldo disponivel:"+cc.getSaldo());
				}
			}else if(op==3){
				JOptionPane.showMessageDialog(null,"Saldo Atual: "+cc.getSaldo()+" Reais");
			}else if(op==4){
				JOptionPane.showMessageDialog(null,"Finalizando...");
				break;
			}else{
				JOptionPane.showMessageDialog(null,"Opção invalida!!!");
			}
		}
		
		
		
	}
}
