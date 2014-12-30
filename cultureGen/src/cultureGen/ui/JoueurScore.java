package cultureGen.ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class JoueurScore extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JoueurScore frame = new JoueurScore("", "");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the frame.
	 */
	public JoueurScore(String nom, String prenom) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblJoueur = new JLabel("joueur : ");

		JLabel lblNewLabel = new JLabel(nom);

		JLabel lblNewLabel_1 = new JLabel(prenom);

		JLabel lblScore = new JLabel("score : ");

		final JLabel label = new JLabel("");

		JButton btnRaffrichire = new JButton("Rafra\u00EEchir");
		btnRaffrichire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(Integer.toString(FenetrePrincipale.score));
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
																		.addGap(20)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								lblScore)
																						.addComponent(
																								lblJoueur))
																		.addGap(35)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblNewLabel)
																										.addGap(54)
																										.addComponent(
																												lblNewLabel_1))
																						.addComponent(
																								label)))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				btnRaffrichire)))
										.addContainerGap(164, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(55)
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(lblJoueur)
												.addComponent(lblNewLabel)
												.addComponent(lblNewLabel_1))
								.addGap(53)
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(lblScore)
												.addComponent(label))
								.addPreferredGap(ComponentPlacement.RELATED,
										51, Short.MAX_VALUE)
								.addComponent(btnRaffrichire).addGap(42)));
		contentPane.setLayout(gl_contentPane);
	}

}
