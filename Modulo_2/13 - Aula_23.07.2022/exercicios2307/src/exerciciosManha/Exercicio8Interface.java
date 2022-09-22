package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio8Interface {

	private JFrame frame;
	private JTextField textX;
	private JTextField textY;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio8Interface window = new Exercicio8Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio8Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 627, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBase = new JLabel("Digite a base numero:");
		lblBase.setBounds(25, 29, 202, 14);
		frame.getContentPane().add(lblBase);
		
		JLabel lblDigiteOExpoente = new JLabel("Digite o expoente numero:");
		lblDigiteOExpoente.setBounds(25, 63, 202, 14);
		frame.getContentPane().add(lblDigiteOExpoente);
		
		textX = new JTextField();
		textX.setBounds(185, 26, 150, 20);
		frame.getContentPane().add(textX);
		textX.setColumns(10);
		
		textY = new JTextField();
		textY.setColumns(10);
		textY.setBounds(185, 60, 150, 20);
		frame.getContentPane().add(textY);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double x = Integer.parseInt(textX.getText());
				double y = Integer.parseInt(textY.getText());
				
				double r = Math.pow(x, y);
				
				JOptionPane.showMessageDialog(null, "O resultado da função de potencia é: " + r);
			}
		});
		btnCalc.setBounds(25, 99, 310, 23);
		frame.getContentPane().add(btnCalc);
	}

}
