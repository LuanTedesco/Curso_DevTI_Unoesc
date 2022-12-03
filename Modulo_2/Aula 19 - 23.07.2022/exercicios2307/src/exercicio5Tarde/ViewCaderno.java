package exercicio5Tarde;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCaderno {

	private JFrame frame;
	private JTextField textAnotacao;
	
	ArrayList<String> listaAnotacoes = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCaderno window = new ViewCaderno();
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
	public ViewCaderno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 832, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textAnotacao = new JTextField();
		textAnotacao.setBounds(123, 26, 286, 20);
		frame.getContentPane().add(textAnotacao);
		textAnotacao.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Digite a anotação: ");
		lblNewLabel.setBounds(10, 29, 222, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnVisualizarAnotacoes = new JButton("Visualizar Anotações");
		btnVisualizarAnotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, listaAnotacoes);
			}
		});
		btnVisualizarAnotacoes.setBounds(10, 113, 178, 23);
		frame.getContentPane().add(btnVisualizarAnotacoes);
		
		JButton btnApagarAnotacoes = new JButton("Apagar Anotações");
		btnApagarAnotacoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaAnotacoes.clear();
				JOptionPane.showMessageDialog(null, "As anotações foram apagaradas");
			}
		});
		btnApagarAnotacoes.setBounds(231, 69, 178, 23);
		frame.getContentPane().add(btnApagarAnotacoes);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(231, 113, 178, 23);
		frame.getContentPane().add(btnSair);
		
		JButton btnAdicionarAnotao = new JButton("Adicionar Anotação");
		btnAdicionarAnotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				listaAnotacoes.add(textAnotacao.getText());
				JOptionPane.showMessageDialog(null, "Anotação adicionada com sucesso!!");
			}
		});
		btnAdicionarAnotao.setBounds(10, 69, 178, 23);
		frame.getContentPane().add(btnAdicionarAnotao);
	}

}
