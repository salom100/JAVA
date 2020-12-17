package view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import view.Falando;

public class GraficoUnitario extends JFrame {
	
	public GraficoUnitario() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico Pizza");
		setSize(950, 700);
		setLocationRelativeTo(null);
		
		criarGrafico();
		
		setVisible(true);
	}
	
	public void criarGrafico() {
		String empresa;
		String descricao;
		double meses;
		int i;
		
		
		empresa=JOptionPane.showInputDialog("Qual o nome da Empresa ?");
		
		XYSeries series = new XYSeries("Voos da Empresa "+empresa+"(Janeiro-abril)");
		meses= Double.parseDouble(JOptionPane.showInputDialog("Quantos meses serao avaliados ?"));
		
		for(i=1;i<=meses;i++) {
			double valor;
			valor=Double.parseDouble(JOptionPane.showInputDialog("Quantos voos a empresa teve no "+(i)+"ºmes ?"));
			
			series.add(i,valor);
			
		}
		XYDataset dataset = new XYSeriesCollection(series);
		
		JFreeChart chart = ChartFactory.createXYAreaChart("Voos da "+empresa+" (Janeiro-Abril) ", "Meses", "Voos", dataset, PlotOrientation.VERTICAL, true, false, false);
		ChartPanel painel = new ChartPanel(chart);
		add(painel);
		
		descricao=empresa+" flights from 1st to 4th month, where we can see the company's flight progress in 2018";
		
		Falando frase = new Falando();
		frase.relatorio(descricao);
		
		
	}
	
	
	
	public static void main(String[] args) {

		new GraficoUnitario();
		
	}
}
