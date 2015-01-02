package cultureGen.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NombreDetective extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int i = 1;

	/**
	 * Create the frame.
	 */
	public NombreDetective() {
		final int nombre;

		Random random = new Random();
		nombre = random.nextInt(50);

		System.out.println(nombre);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel label = new JLabel("");

		JLabel lblDevinezLeNombre = new JLabel(
				"devinez le nombre (entre 0 et 50)");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel lblVotreChoix = new JLabel("votre choix :");

		JButton btnVerifier = new JButton("verifier");
		btnVerifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int nombreIntroduit = Integer.valueOf(textField.getText());
				if (i < 11) {
					if (nombreIntroduit == nombre) {
						JOptionPane.showMessageDialog(null,
							    "bravo vous avez deviné le nombre exact ...");
						FenetrePrincipale.score+=10;
						dispose();
					} else {
						JOptionPane.showMessageDialog(null,
								"repetez ... encore " + (10 - i)
								+ "tentatives ");
						
						

					}
					i++;
				} else {
					System.err.println("tentative ecoulés ");
				}

			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(41)
																		.addComponent(
																				label))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblVotreChoix)
																										.addGap(42)
																										.addComponent(
																												textField,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE))
																						.addComponent(
																								lblDevinezLeNombre))))
										.addContainerGap(240, Short.MAX_VALUE))
						.addGroup(
								Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addContainerGap(244, Short.MAX_VALUE)
										.addComponent(btnVerifier).addGap(91)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(22)
										.addComponent(label)
										.addGap(18)
										.addComponent(lblDevinezLeNombre)
										.addGap(64)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																textField,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblVotreChoix))
										.addGap(62).addComponent(btnVerifier)
										.addContainerGap(29, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
