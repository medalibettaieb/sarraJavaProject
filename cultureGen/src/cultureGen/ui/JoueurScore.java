package cultureGen.ui;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class JoueurScore extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public JoueurScore(String nom, String prenom) {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblJoueur = new JLabel("joueur :");

		JLabel label = new JLabel(nom);

		JLabel lblNewLabel = new JLabel(prenom);

		JLabel lblScore = new JLabel("score :");

		JLabel lblNewLabel_1 = new JLabel(
				Integer.toString(FenetrePrincipale.score));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(66)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(lblScore)
														.addComponent(lblJoueur))
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(56)
																		.addComponent(
																				label))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(30)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblNewLabel_1)
																						.addComponent(
																								lblNewLabel))))
										.addContainerGap(236, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(57)
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(lblJoueur)
												.addComponent(label)
												.addComponent(lblNewLabel))
								.addGap(33)
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(lblScore)
												.addComponent(lblNewLabel_1))
								.addContainerGap(134, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

}
