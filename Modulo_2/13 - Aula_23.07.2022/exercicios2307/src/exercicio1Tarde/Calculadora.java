package exercicio1Tarde;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora {

	private JFrame frame;
	private JTextField textNum2;
	private JTextField textNum1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 719, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textNum2 = new JTextField();
		textNum2.setBounds(112, 50, 194, 20);
		frame.getContentPane().add(textNum2);
		textNum2.setColumns(10);
		
		JButton btnAdicao = new JButton("+");
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				int resultado = num1 + num2;
				JOptionPane.showMessageDialog(null, "A soma dos numeros "+num1+" + "+num2+" é: "+resultado);
			}
		});
		btnAdicao.setBounds(52, 112, 41, 23);
		frame.getContentPane().add(btnAdicao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				int resultado = num1 * num2;
				JOptionPane.showMessageDialog(null, "A multiplicação dos numeros "+num1+" * "+num2+" é: "+resultado);
			}
		});
		btnMultiplicacao.setBounds(154, 112, 41, 23);
		frame.getContentPane().add(btnMultiplicacao);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				int resultado = num1 - num2;
				JOptionPane.showMessageDialog(null, "A subtração dos numeros "+num1+" - "+num2+" é: "+resultado);
			}
		});
		btnSubtracao.setBounds(103, 112, 41, 23);
		frame.getContentPane().add(btnSubtracao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(textNum1.getText());
				int num2 = Integer.parseInt(textNum2.getText());
				int resultado = num1 + num2;
				JOptionPane.showMessageDialog(null, "A divisão dos numeros "+num1+" / "+num2+" é: "+resultado);
			}
		});
		btnDivisao.setBounds(205, 112, 41, 23);
		frame.getContentPane().add(btnDivisao);
		
		textNum1 = new JTextField();
		textNum1.setColumns(10);
		textNum1.setBounds(112, 14, 194, 20);
		frame.getContentPane().add(textNum1);
		
		JLabel lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(10, 14, 118, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNumero = new JLabel("Numero 2");
		lblNumero.setBounds(10, 50, 118, 14);
		frame.getContentPane().add(lblNumero);
	}
}
