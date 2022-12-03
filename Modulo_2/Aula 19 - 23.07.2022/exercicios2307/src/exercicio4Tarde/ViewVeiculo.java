package exercicio4Tarde;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewVeiculo {

	private JFrame frame;
	private JTextField textAno;
	private JTextField textModelo;
	private JTextField textCor;
	private JTextField textQuilometragem;
	
	Veiculo veiculo1 = new Veiculo(1990, "GT", "Preto", 40.000);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewVeiculo window = new ViewVeiculo();
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
	public ViewVeiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 799, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAno = new JLabel("Ano");
		lblAno.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblAno);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 39, 46, 14);
		frame.getContentPane().add(lblModelo);
		
		JLabel lblCor = new JLabel("Cor");
		lblCor.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblCor);
		
		JLabel lblQuilometragem = new JLabel("Quilometragem");
		lblQuilometragem.setBounds(10, 97, 138, 14);
		frame.getContentPane().add(lblQuilometragem);
		
		textAno = new JTextField();
		textAno.setBounds(110, 11, 111, 20);
		frame.getContentPane().add(textAno);
		textAno.setColumns(10);
		
		textModelo = new JTextField();
		textModelo.setColumns(10);
		textModelo.setBounds(110, 39, 111, 20);
		frame.getContentPane().add(textModelo);
		
		textCor = new JTextField();
		textCor.setColumns(10);
		textCor.setBounds(110, 67, 111, 20);
		frame.getContentPane().add(textCor);
		
		textQuilometragem = new JTextField();
		textQuilometragem.setColumns(10);
		textQuilometragem.setBounds(110, 94, 111, 20);
		frame.getContentPane().add(textQuilometragem);
		
		JButton btnVerificarManutencao = new JButton("Verificar Manutenção");
		btnVerificarManutencao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double quilometragem = Integer.parseInt(textQuilometragem.getText());
				
				if (quilometragem <= 25000) {
					JOptionPane.showMessageDialog(null, "Tudo OK");
				    } else if (quilometragem > 25000 && quilometragem <= 75000) {
				    	JOptionPane.showMessageDialog(null, "Realizar revisão parcial");
				    } else {
				    	JOptionPane.showMessageDialog(null, "Realizar revisão completa");
				    }
			}
		});
		btnVerificarManutencao.setBounds(10, 136, 211, 23);
		frame.getContentPane().add(btnVerificarManutencao);
		
		JButton btnMudarCor = new JButton("Mudar Cor");
		btnMudarCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cor = textCor.getText();
				
				veiculo1.setCor(textCor.getText());
				
				JOptionPane.showMessageDialog(null, "A cor foi alterada para " + cor);
				
				
			}
		});
		btnMudarCor.setBounds(10, 170, 211, 23);
		frame.getContentPane().add(btnMudarCor);
		
		JButton btnExibirCor = new JButton("Exibir Cor");
		btnExibirCor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "A cor do veículo é: " + veiculo1.getCor());
				
			}
		});
		btnExibirCor.setBounds(10, 204, 211, 23);
		frame.getContentPane().add(btnExibirCor);
	}

}
