package exerciciosManha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Exercicio1Interface {

	private JFrame frame;
	private JTextField txtsucessor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio1Interface window = new Exercicio1Interface();
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
	public Exercicio1Interface() {
		initialize(); }

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 661, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblsucessor = new JLabel("Digite o numero: ");
		lblsucessor.setBounds(28, 26, 100, 14);
		frame.getContentPane().add(lblsucessor);
		
		txtsucessor = new JTextField();
		txtsucessor.setBounds(138, 23, 86, 20);
		frame.getContentPane().add(txtsucessor);
		txtsucessor.setColumns(10);
		
		JButton btnsucessor = new JButton("Calcular");
		btnsucessor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sucessor;
				sucessor = Integer.parseInt(txtsucessor.getText());
				sucessor += 1;
				JOptionPane.showMessageDialog(null, sucessor);
				
			}
		});
		btnsucessor.setBounds(28, 113, 89, 23);
		frame.getContentPane().add(btnsucessor);
	}
}
