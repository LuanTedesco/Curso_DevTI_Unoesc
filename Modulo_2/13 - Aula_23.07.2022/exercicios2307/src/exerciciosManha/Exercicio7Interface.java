package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio7Interface {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio7Interface window = new Exercicio7Interface();
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
	public Exercicio7Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 841, 504);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chico tem 1,50 metro e cresce 2 centímetros por ano");
		lblNewLabel.setBounds(36, 30, 359, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblZTem = new JLabel("Zé tem 1,10 metro e cresce 3 centímetros por ano");
		lblZTem.setBounds(36, 55, 359, 14);
		frame.getContentPane().add(lblZTem);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    int anos;
			    int alturachico, alturaze;

			    alturachico = 150;
			    alturaze = 110;
			    anos = 0;

			    while (alturaze <= alturachico) {
			      anos++;
			      alturaze += 3;
			      alturachico += 2;
			    }

			    JOptionPane.showMessageDialog(null, "O Zé vai demorar " + anos + " ano para chegar na altura do Chico");

			}
		});
		btnCalc.setBounds(36, 80, 256, 23);
		frame.getContentPane().add(btnCalc);
	}

}
