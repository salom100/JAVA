package view;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class graficos extends JFrame{
	
	public graficos() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Grafico Barra");
		setSize(950,700);
		setLocationRelativeTo(null);
		
		criarGrafico();
		
		setVisible(true);
	}
	
	public void criarGrafico() {
		int i;
		int quantos;
		String descricao;
		DefaultCategoryDataset barra= new DefaultCategoryDataset();
		
		
		quantos= Integer.parseInt(JOptionPane.showInputDialog("Quantos serao grafitados ?"));
		for(i=0;i<quantos;i++) {
			String nome;
			int valor;
			nome=JOptionPane.showInputDialog("Qual o nome da "+(i+1)+" empresa ");
			valor= Integer.parseInt(JOptionPane.showInputDialog("Quantos voos a empresa "+nome+" teve ?"));
			
			barra.setValue(valor, nome, "");
			
		}
		
		
		
		JFreeChart grafico = ChartFactory.createBarChart("Continentes e seus voos (Registrados na ANAC)","Empresas","Voos",barra,PlotOrientation.VERTICAL,true,true,false);
		ChartPanel painel = new ChartPanel(grafico);
		add(painel);
		
		descricao = "airlines and their flights from January to April 2018 shown in bar charts";
		
		Falando frase = new Falando();
		frase.relatorio(descricao);
		
	}
	
	public static void main(String[] args) {

		
		new graficos();
	}
	
	
}
