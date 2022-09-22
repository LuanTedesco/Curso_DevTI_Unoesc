package exercicio2Tarde;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewAluno {

	private JFrame frame;
	private JTextField textNota1;
	private JTextField textNota2;
	private JTextField textNota3;

	Aluno aluno1 = new Aluno("Rafael", 18);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAluno window = new ViewAluno();
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
	public ViewAluno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 757, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("1ª Nota");
		lblNewLabel.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNota2 = new JLabel("2ª Nota");
		lblNota2.setBounds(10, 39, 46, 14);
		frame.getContentPane().add(lblNota2);

		JLabel lblNota = new JLabel("3ª Nota");
		lblNota.setBounds(10, 67, 46, 14);
		frame.getContentPane().add(lblNota);

		textNota1 = new JTextField();
		textNota1.setBounds(66, 11, 86, 20);
		frame.getContentPane().add(textNota1);
		textNota1.setColumns(10);

		textNota2 = new JTextField();
		textNota2.setColumns(10);
		textNota2.setBounds(66, 39, 86, 20);
		frame.getContentPane().add(textNota2);

		textNota3 = new JTextField();
		textNota3.setColumns(10);
		textNota3.setBounds(66, 67, 86, 20);
		frame.getContentPane().add(textNota3);

		JButton btnCalcMedia = new JButton("Calcular Média");
		btnCalcMedia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double nota1 = Integer.parseInt(textNota1.getText());
				double nota2 = Integer.parseInt(textNota2.getText());
				double nota3 = Integer.parseInt(textNota3.getText());

				double media = (nota1 + nota2 + nota3) / 3;

				aluno1.setMedia(media);

				JOptionPane.showMessageDialog(null, "A media é: " + media);

			}
		});
		btnCalcMedia.setBounds(10, 98, 142, 23);
		frame.getContentPane().add(btnCalcMedia);

		JButton btnVerificarAprovacao = new JButton("Verificar Aprovação");
		btnVerificarAprovacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (aluno1.getMedia() >= 7.0 && aluno1.getMedia() <= 10.0) {
					JOptionPane.showMessageDialog(null, "Aprovado");
				} else if (aluno1.getMedia() < 7.0 && aluno1.getMedia() >= 5.0) {
					JOptionPane.showMessageDialog(null, "Em exame");
				} else if (aluno1.getMedia() < 5.0 && aluno1.getMedia() >= 0.0) {
					JOptionPane.showMessageDialog(null, "Reprovado");
				} else {
					JOptionPane.showMessageDialog(null, "Nota inválida");
				}
			}
		});
		btnVerificarAprovacao.setBounds(10, 132, 142, 23);
		frame.getContentPane().add(btnVerificarAprovacao);
	}

}
