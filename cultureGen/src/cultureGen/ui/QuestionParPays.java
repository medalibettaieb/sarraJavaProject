package cultureGen.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import cultureGen.pays.Pays;

public class QuestionParPays extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public QuestionParPays(final String abbrev) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblQuelEstLa = new JLabel("quelle est la capitale de ce pays?");

		JLabel lblNewLabel = new JLabel("");

		JButton btnConfirmer = new JButton("confirmer");
		btnConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String reponse = textField.getText();
				String capitaleRecherche;
				Pays[] pays = Pays.values();
				for (int i = 0; i < pays.length; i++) {
					if (pays[i].getAbbreviation().equalsIgnoreCase(abbrev)) {
						capitaleRecherche = pays[i].getCapitale();
						if (capitaleRecherche.equalsIgnoreCase(reponse)) {
							dispose();
							// bonne reponse
							FenetrePrincipale.score++;
							System.out.println(FenetrePrincipale.score);

						} else {
							System.err.println("capitale erroné");
						}
					} else {
						System.err.println("abréviation non existente");

					}

				}
			}

		});

		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_contentPane.createSequentialGroup().addGap(171)
								.addComponent(lblNewLabel).addGap(207))
				.addGroup(
						Alignment.TRAILING,
						gl_contentPane.createSequentialGroup()
								.addContainerGap(289, Short.MAX_VALUE)
								.addComponent(btnConfirmer).addGap(58))
				.addGroup(
						gl_contentPane.createSequentialGroup().addGap(126)
								.addComponent(lblQuelEstLa)
								.addContainerGap(141, Short.MAX_VALUE))
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(155)
								.addComponent(textField,
										GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(183, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				Alignment.TRAILING,
				gl_contentPane
						.createSequentialGroup()
						.addGap(76)
						.addComponent(lblQuelEstLa, GroupLayout.PREFERRED_SIZE,
								28, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 39,
								Short.MAX_VALUE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(lblNewLabel).addGap(29)
						.addComponent(btnConfirmer).addGap(19)));
		contentPane.setLayout(gl_contentPane);
	}

}
