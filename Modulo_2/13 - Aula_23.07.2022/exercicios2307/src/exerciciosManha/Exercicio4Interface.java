package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio4Interface {

	private JFrame frame;
	private JTextField textNum2;
	private JTextField textNum1;
	private JButton btnCalc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio4Interface window = new Exercicio4Interface();
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
	public Exercicio4Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 835, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Digite o primeiro numero:");
		lblNewLabel.setBounds(59, 30, 253, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite o segundo numero:");
		lblNewLabel_1.setBounds(59, 61, 253, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textNum2 = new JTextField();
		textNum2.setBounds(256, 59, 147, 17);
		frame.getContentPane().add(textNum2);
		textNum2.setColumns(10);
		
		textNum1 = new JTextField();
		textNum1.setColumns(10);
		textNum1.setBounds(256, 27, 147, 17);
		frame.getContentPane().add(textNum1);
		
		btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				
				if (num1 > num2) {
				      JOptionPane.showMessageDialog(null, "O numero " + num1 + " é maior que o numero " + num2);
				    } else if (num2 > num1) {
				      JOptionPane.showMessageDialog(null, "O numero " + num2 + " é maior que o numero " + num1);
				    } else {
				      JOptionPane.showMessageDialog(null, "Opção inválida");
				    }
				
			}
		});
		btnCalc.setBounds(59, 104, 344, 23);
		frame.getContentPane().add(btnCalc);
	}

}
