package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio6Interface {

	private JFrame frame;
	private JTextField textIdade;
	private JLabel lblProgramaQueCalcula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio6Interface window = new Exercicio6Interface();
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
	public Exercicio6Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 737, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite a idade: ");
		lblNewLabel.setBounds(10, 64, 123, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textIdade = new JTextField();
		textIdade.setBounds(176, 61, 148, 20);
		frame.getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(textIdade.getText());
				
				if (idade >= 18 && idade <= 68) {
					JOptionPane.showMessageDialog(null, "Você pode votar");
				} else {
					JOptionPane.showMessageDialog(null, "Você não pode votar");
					
				}
			}
		});
		btnCalc.setBounds(10, 95, 314, 23);
		frame.getContentPane().add(btnCalc);
		
		lblProgramaQueCalcula = new JLabel("Programa que calcula a sua idade \r\ne mostra se você pode votar");
		lblProgramaQueCalcula.setBounds(10, 25, 445, 20);
		frame.getContentPane().add(lblProgramaQueCalcula);
	}

}
