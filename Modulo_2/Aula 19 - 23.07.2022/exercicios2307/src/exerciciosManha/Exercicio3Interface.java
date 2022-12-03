package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio3Interface {

	private JFrame frame;
	private JTextField textAnosFuma;
	private JTextField textNCigarros;
	private JTextField textPrecoCigarros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio3Interface window = new Exercicio3Interface();
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
	public Exercicio3Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 857, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAnosFumo = new JLabel("Digite o nº de anos que você fuma:");
		lblAnosFumo.setBounds(24, 27, 320, 14);
		frame.getContentPane().add(lblAnosFumo);
		
		textAnosFuma = new JTextField();
		textAnosFuma.setBounds(354, 21, 174, 20);
		frame.getContentPane().add(textAnosFuma);
		textAnosFuma.setColumns(10);
		
		JLabel lblCigarrosPDia = new JLabel("Digite o numero de cigarros consumidos por dia:");
		lblCigarrosPDia.setBounds(24, 68, 320, 14);
		frame.getContentPane().add(lblCigarrosPDia);
		
		textNCigarros = new JTextField();
		textNCigarros.setColumns(10);
		textNCigarros.setBounds(354, 62, 174, 20);
		frame.getContentPane().add(textNCigarros);
		
		JLabel lblDigiteOPreo = new JLabel("Digite o preço da carteira de cigarros:");
		lblDigiteOPreo.setBounds(24, 109, 320, 14);
		frame.getContentPane().add(lblDigiteOPreo);
		
		textPrecoCigarros = new JTextField();
		textPrecoCigarros.setColumns(10);
		textPrecoCigarros.setBounds(354, 106, 174, 20);
		frame.getContentPane().add(textPrecoCigarros);
		
		JButton btnCalc = new JButton("Calcular");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int anosFuma = Integer.parseInt(textAnosFuma.getText());
				int nCigarros = Integer.parseInt(textAnosFuma.getText());
				int precoCigarros= Integer.parseInt(textAnosFuma.getText());
				
				anosFuma = anosFuma * 365;

				precoCigarros = precoCigarros / 20;

				nCigarros = (nCigarros * precoCigarros);

				precoCigarros = (nCigarros * anosFuma);
				
				JOptionPane.showMessageDialog(null, "Você já gastou $" + precoCigarros + " com cigarro");

				
			}
		});
		btnCalc.setBounds(24, 159, 150, 23);
		frame.getContentPane().add(btnCalc);
	}

}
