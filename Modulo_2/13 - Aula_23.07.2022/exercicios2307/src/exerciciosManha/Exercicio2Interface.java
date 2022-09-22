package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio2Interface {

	private JFrame frame;
	private JTextField textDistance;
	private JTextField textGas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio2Interface window = new Exercicio2Interface();
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
	public Exercicio2Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 689, 395);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblDistance = new JLabel("Digite a quilômetragem:");
		lblDistance.setBounds(24, 25, 208, 14);
		frame.getContentPane().add(lblDistance);
		
		textDistance = new JTextField();
		textDistance.setBounds(286, 19, 86, 20);
		frame.getContentPane().add(textDistance);
		textDistance.setColumns(10);
		
		JLabel lblGas = new JLabel("Digite o total de combustível:");
		lblGas.setBounds(24, 59, 208, 14);
		frame.getContentPane().add(lblGas);
		
		textGas = new JTextField();
		textGas.setColumns(10);
		textGas.setBounds(286, 53, 86, 20);
		frame.getContentPane().add(textGas);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int converterDistance = Integer.parseInt(textDistance.getText());
				int convertGas = Integer.parseInt(textGas.getText());
				
				int resultado = converterDistance / convertGas;
				
				JOptionPane.showMessageDialog(null, "O consumo do combvustivel foi de: " + resultado);
				
				
			}
		});
		btnCalc.setBounds(61, 136, 89, 23);
		frame.getContentPane().add(btnCalc);
	}

}
