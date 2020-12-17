package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;


public class GraficoPizza extends JFrame {
	
	public  GraficoPizza() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico Pizza");
		setSize(950, 700);
		setLocationRelativeTo(null);
		
		criarGrafico();
		
		setVisible(true);
		
		
	}
	
	public void criarGrafico() {
		int i;
		int quantos = 0;
		String descricao;
		
		DefaultPieDataset pizza = new DefaultPieDataset();
		
		quantos= Integer.parseInt(JOptionPane.showInputDialog("Quantas Empresas serao graficadas ?"));
		for(i=0;i<quantos;i++) {
			String nome;
			int voos;
			nome= JOptionPane.showInputDialog("Digite o nome da "+(i+1)+" empresa ");
			voos= Integer.parseInt(JOptionPane.showInputDialog("Quantos voos a empresa "+nome+" teve ?"));
			
			pizza.setValue(nome, voos);
			
		}
		
		JFreeChart grafico = ChartFactory.createPieChart("Numero de Voos por Empresa (Janeiro-Abril)", pizza,true,true,false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
		
		descricao = "airlines and their flights from January to April 2018 shown in pie charts";
		
		Falando frase = new Falando();
		frase.relatorio(descricao);
	}
	public static void main(String[] args) {
		
		
		new GraficoPizza();
	}

}
