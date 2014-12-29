package cultureGen.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Drapeaux extends JFrame {

	private JPanel contentPane;
	private BufferedImage image;
	private JTextField textField;

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Drapeaux(final String abbrev) throws IOException {
		setTitle("drapeaux pays");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		BufferedImage myPicture = ImageIO.read(new File("images/" + abbrev
				+ ".jpg"));

		JLabel lblQuestion = new JLabel("c'est le drapeau de quel pays ?");

		JLabel label = new JLabel("");

		JLabel label_1 = new JLabel("");
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));

		JLabel label_2 = new JLabel("");

		textField = new JTextField();
		textField.setColumns(10);

		JLabel label_3 = new JLabel("");

		JLabel label_4 = new JLabel("");

		JButton btnConfirmer = new JButton("confirmer");
		btnConfirmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reponse = textField.getText();

				if (abbrev.equalsIgnoreCase(reponse)) {
					dispose();
					System.out.println("bravo");
					QuestionParPays questionParPays = new QuestionParPays();
					questionParPays.setVisible(true);
				} else {
					System.err.println("mauvaise reponse ...");
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
																		.addComponent(
																				lblQuestion,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				label,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				label_1,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				picLabel,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				label_2,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				textField,
																				GroupLayout.DEFAULT_SIZE,
																				131,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				label_3,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				label_4,
																				GroupLayout.PREFERRED_SIZE,
																				141,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnConfirmer,
																				GroupLayout.DEFAULT_SIZE,
																				131,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)))
										.addGap(1)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblQuestion,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																label,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																label_1,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE))
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																picLabel,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																label_2,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(54)
																		.addComponent(
																				textField,
																				GroupLayout.PREFERRED_SIZE,
																				30,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																btnConfirmer,
																GroupLayout.PREFERRED_SIZE,
																37,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																label_3,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																label_4,
																GroupLayout.PREFERRED_SIZE,
																84,
																GroupLayout.PREFERRED_SIZE))));
		contentPane.setLayout(gl_contentPane);
	}

}
