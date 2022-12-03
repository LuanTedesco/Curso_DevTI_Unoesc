package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio5Interface {

	private JFrame frame;
	private JTextField textIdade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio5Interface window = new Exercicio5Interface();
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
	public Exercicio5Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 777, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite a idade: ");
		lblNewLabel.setBounds(35, 35, 159, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textIdade = new JTextField();
		textIdade.setBounds(159, 32, 141, 20);
		frame.getContentPane().add(textIdade);
		textIdade.setColumns(10);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int idade = Integer.parseInt(textIdade.getText());
				
				if (idade < 15) {
					JOptionPane.showMessageDialog(null, "Você não pode votar!!");
				} else {
						JOptionPane.showMessageDialog(null, "Você pode votar!!");
				}
				
			}
		});
		btnCalc.setBounds(37, 84, 263, 23);
		frame.getContentPane().add(btnCalc);
	}

}
