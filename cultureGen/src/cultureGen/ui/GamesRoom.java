package cultureGen.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cultureGen.pays.Pays;

public class GamesRoom extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public GamesRoom(final String nom, final String prenom) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblChoisisezVotreJeu = new JLabel(" Choisissez votre jeu");

		JButton btnJeuDePays = new JButton("jeu de pays");
		btnJeuDePays.addActionListener(new ActionListener() {
			private AbstractButton textField_1;
			private AbstractButton textField;

			public void actionPerformed(ActionEvent e) {
				Drapeaux drapaux;

				JoueurScore joueurScore = new JoueurScore(nom, prenom);
				joueurScore.setVisible(true);
				joueurScore.setBounds(910, 0, 450, 300);
				try {
					Pays[] pays = Pays.values();
					for (int i = 0; i < pays.length; i++) {
						drapaux = new Drapeaux(pays[i].getAbbreviation());
						drapaux.setVisible(true);

					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		JButton btnNombreDetective = new JButton("nombre detective");
		btnNombreDetective.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NombreDetective nombreDetective = new NombreDetective();
				nombreDetective.setVisible(true);
			}
		});

		JButton btnJeu = new JButton("jeu 3");
		btnJeu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(btnJeuDePays)
										.addGap(36)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				btnNombreDetective)
																		.addGap(38)
																		.addComponent(
																				btnJeu))
														.addComponent(
																lblChoisisezVotreJeu))
										.addContainerGap(45, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(27)
								.addComponent(lblChoisisezVotreJeu)
								.addGap(69)
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnJeuDePays)
												.addComponent(
														btnNombreDetective)
												.addComponent(btnJeu))
								.addContainerGap(119, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

}
