package exercicio3Tarde;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Conta {

	private JFrame frame;
	private JTextField textNumeroConta;
	private JTextField textTitular;
	private JTextField textValor;
	private JTextField textSaldoInicial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conta window = new Conta();
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
	public Conta() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 751, 466);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumeroConta = new JLabel("Numero da Conta");
		lblNumeroConta.setBounds(10, 11, 136, 14);
		frame.getContentPane().add(lblNumeroConta);
		
		JLabel lblTipoConta = new JLabel("Tipo Conta");
		lblTipoConta.setBounds(10, 46, 87, 14);
		frame.getContentPane().add(lblTipoConta);
		
		JLabel lblTitularDaConta = new JLabel("Titular da Conta");
		lblTitularDaConta.setBounds(10, 85, 136, 14);
		frame.getContentPane().add(lblTitularDaConta);
		
		JRadioButton rdbtnPF = new JRadioButton("Pessoa Física");
		rdbtnPF.setBounds(113, 42, 109, 23);
		frame.getContentPane().add(rdbtnPF);
		
		JRadioButton rdbtnPJ = new JRadioButton("Pessoa Jurídica");
		rdbtnPJ.setBounds(223, 42, 109, 23);
		frame.getContentPane().add(rdbtnPJ);
		
		textNumeroConta = new JTextField();
		textNumeroConta.setBounds(113, 8, 205, 20);
		frame.getContentPane().add(textNumeroConta);
		textNumeroConta.setColumns(10);
		
		textTitular = new JTextField();
		textTitular.setBounds(113, 82, 205, 20);
		frame.getContentPane().add(textTitular);
		textTitular.setColumns(10);
		
		JButton btnDepositar = new JButton("Depositar");
		btnDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double saldo = Integer.parseInt(textSaldoInicial.getText());
				double valor = Integer.parseInt(textValor.getText());
				
				saldo = saldo + valor;
				
				JOptionPane.showMessageDialog(null, "Depósito finalizado com sucesso!! \n O saldo atual é: " +saldo);
			}
		});
		btnDepositar.setBounds(167, 229, 151, 23);
		frame.getContentPane().add(btnDepositar);
		
		JButton btnSacar = new JButton("Sacar");
		btnSacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double saldo = Integer.parseInt(textSaldoInicial.getText());
				double valor = Integer.parseInt(textValor.getText());

				
			    if (saldo > valor) {
			    	saldo = saldo - valor;
			    	JOptionPane.showMessageDialog(null, "Saque finalizado com sucesso!! \n O saldo atual é: " +saldo);
			      } else {
			    	  saldo = (saldo + 1) - 1;
			    	  JOptionPane.showMessageDialog(null, "Saldo insuficiente");
			      }
			
			}
		});
		btnSacar.setBounds(10, 229, 147, 23);
		frame.getContentPane().add(btnSacar);
		
		JButton btnVerificarSaldo = new JButton("Verificar saldo");
		btnVerificarSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saque finalizado com sucesso!! \n O saldo atual é: ");
			}
		});
		btnVerificarSaldo.setBounds(10, 269, 308, 23);
		frame.getContentPane().add(btnVerificarSaldo);
		
		textValor = new JTextField();
		textValor.setColumns(10);
		textValor.setBounds(113, 188, 205, 20);
		frame.getContentPane().add(textValor);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(10, 191, 136, 14);
		frame.getContentPane().add(lblValor);
		
		JLabel lblSaldoInicial = new JLabel("Saldo Inicial");
		lblSaldoInicial.setBounds(10, 148, 136, 14);
		frame.getContentPane().add(lblSaldoInicial);
		
		textSaldoInicial = new JTextField();
		textSaldoInicial.setColumns(10);
		textSaldoInicial.setBounds(113, 145, 205, 20);
		frame.getContentPane().add(textSaldoInicial);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(330, 124, -319, 14);
		frame.getContentPane().add(separator);
	}
}
