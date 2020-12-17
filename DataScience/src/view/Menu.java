package view;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import view.graficos;
import view.Falando;
import view.GraficoPizza;
import view.GraficoUnitario;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JToolBar;


public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("DataScience ANAC");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/imagens/icone.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 200, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPizza = new JButton("Grafico Pizza");
		btnPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GraficoPizza novo = new GraficoPizza();
				
				
			}
		});
		btnPizza.setBounds(37, 84, 132, 23);
		contentPane.add(btnPizza);
		
		JButton btnBarras = new JButton("Grafico Barras");
		btnBarras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				graficos novo = new graficos();
				
				
			}
		});
		btnBarras.setBounds(37, 118, 132, 23);
		contentPane.add(btnBarras);
		
		JButton btnProgresso = new JButton("Progresso Empresa");
		btnProgresso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				GraficoUnitario novo = new GraficoUnitario();
				
				
			}
			
		});
		btnProgresso.setBounds(37, 152, 167, 23);
		contentPane.add(btnProgresso);
	}
}
