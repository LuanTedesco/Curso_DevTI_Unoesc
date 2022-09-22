package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Aluno;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class TelaAluno {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtMedia;
	
	Aluno aluno = new Aluno();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaAluno window = new TelaAluno();
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
	public TelaAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(10, 11, 60, 20);
		frame.getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblIdade.setBounds(10, 57, 60, 20);
		frame.getContentPane().add(lblIdade);
		
		JLabel lblMedia = new JLabel("M\u00E9dia:");
		lblMedia.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMedia.setBounds(135, 59, 60, 20);
		frame.getContentPane().add(lblMedia);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNome.setBounds(65, 11, 266, 25);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIdade.setColumns(10);
		txtIdade.setBounds(65, 55, 60, 25);
		frame.getContentPane().add(txtIdade);
		
		txtMedia = new JTextField();
		txtMedia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMedia.setColumns(10);
		txtMedia.setBounds(205, 57, 126, 25);
		frame.getContentPane().add(txtMedia);
		
		JPanel panel = new JPanel();
		panel.setBounds(64, 101, 191, 33);
		frame.getContentPane().add(panel);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		panel.add(rdbtnMasculino);
		panel.add(rdbtnFeminino);
		
		rdbtnMasculino.setSelected(true);
		
		rdbtnMasculino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnMasculino.setSelected(true);
				rdbtnFeminino.setSelected(false);
			}
		});
		
		
		rdbtnFeminino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnFeminino.setSelected(true);
				rdbtnMasculino.setSelected(false);
			}
		});
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 107, 39, 17);
		frame.getContentPane().add(lblSexo);
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				aluno.setNome(txtNome.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				aluno.setMedia(Double.parseDouble(txtMedia.getText()));
				
				if(rdbtnMasculino.isSelected()) {
					aluno.setSexo('M');
				} else {
					aluno.setSexo('F');
				}
				
				JOptionPane.showMessageDialog(null, "Aluno salvo com sucesso!\n"+aluno.toString());
			}
		});
		btnSalvar.setMnemonic('s');
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalvar.setBounds(10, 166, 89, 30);
		frame.getContentPane().add(btnSalvar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNome.setText(null);
				txtIdade.setText(null);
				txtMedia.setText(null);
			}
		});
		btnLimpar.setMnemonic('l');
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.setBounds(126, 166, 89, 30);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setMnemonic('a');
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.setBounds(242, 166, 89, 30);
		frame.getContentPane().add(btnSair);
	}
}
