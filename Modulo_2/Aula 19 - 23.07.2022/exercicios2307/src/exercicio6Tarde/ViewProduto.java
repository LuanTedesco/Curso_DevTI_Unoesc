package exercicio6Tarde;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewProduto {

	private JFrame frame;
	private JTextField textNome;
	private JTextField textPeso;
	private JTextField textPreco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewProduto window = new ViewProduto();
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
	public ViewProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 544);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome: ");
		lblNewLabel.setBounds(31, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPeso = new JLabel("Peso: ");
		lblPeso.setBounds(31, 43, 46, 14);
		frame.getContentPane().add(lblPeso);
		
		JLabel lblPreo = new JLabel("Preço: ");
		lblPreo.setBounds(31, 78, 46, 14);
		frame.getContentPane().add(lblPreo);
		
		textNome = new JTextField();
		textNome.setBounds(87, 8, 156, 20);
		frame.getContentPane().add(textNome);
		textNome.setColumns(10);
		
		textPeso = new JTextField();
		textPeso.setColumns(10);
		textPeso.setBounds(87, 40, 156, 20);
		frame.getContentPane().add(textPeso);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(87, 75, 156, 20);
		frame.getContentPane().add(textPreco);
		
		JButton btnAumentarPreco = new JButton("Aumentar Preço");
		btnAumentarPreco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double preco = Integer.parseInt(textPreco.getText());
				
				JOptionPane.showMessageDialog(null, "Preço atual: " + preco);

			    if (preco < 50) {
			      preco = preco + (preco * 0.20);
			    } else {
			      preco = preco - (preco * 0.10);
			    }

			    JOptionPane.showMessageDialog(null, "Preco com o reajuste: " + preco);

			}
		});
		btnAumentarPreco.setBounds(31, 113, 212, 23);
		frame.getContentPane().add(btnAumentarPreco);
	}

}
