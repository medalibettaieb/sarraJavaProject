package cultureGen.ui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModifierCartoon extends JPanel implements ItemListener {
	JCheckBox chinButton;
	JCheckBox glassesButton;
	JCheckBox hairButton;
	JCheckBox teethButton;

	StringBuffer choices;
	JLabel pictureLabel;

	public ModifierCartoon() {
		super(new BorderLayout());

		chinButton = new JCheckBox("Chin");
		chinButton.setMnemonic(KeyEvent.VK_C);
		chinButton.setSelected(true);

		glassesButton = new JCheckBox("Glasses");
		glassesButton.setMnemonic(KeyEvent.VK_G);
		glassesButton.setSelected(true);

		hairButton = new JCheckBox("Hair");
		hairButton.setMnemonic(KeyEvent.VK_H);
		hairButton.setSelected(true);

		teethButton = new JCheckBox("Teeth");
		teethButton.setMnemonic(KeyEvent.VK_T);
		teethButton.setSelected(true);

		chinButton.addItemListener(this);
		glassesButton.addItemListener(this);
		hairButton.addItemListener(this);
		teethButton.addItemListener(this);

		choices = new StringBuffer("cght");

		pictureLabel = new JLabel();
		pictureLabel.setFont(pictureLabel.getFont().deriveFont(Font.ITALIC));
		updatePicture();

		JPanel checkPanel = new JPanel(new GridLayout(0, 1));
		checkPanel.add(chinButton);
		checkPanel.add(glassesButton);
		checkPanel.add(hairButton);
		checkPanel.add(teethButton);

		add(checkPanel, BorderLayout.LINE_START);
		add(pictureLabel, BorderLayout.CENTER);
		setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
	}

	/** Listens to the check boxes. */
	public void itemStateChanged(ItemEvent e) {
		int index = 0;
		char c = '-';
		Object source = e.getItemSelectable();

		if (source == chinButton) {
			index = 0;
			c = 'c';
		} else if (source == glassesButton) {
			index = 1;
			c = 'g';
		} else if (source == hairButton) {
			index = 2;
			c = 'h';
		} else if (source == teethButton) {
			index = 3;
			c = 't';
		}

		if (e.getStateChange() == ItemEvent.DESELECTED) {
			c = '-';
		}

		choices.setCharAt(index, c);

		updatePicture();
	}

	protected void updatePicture() {
		ImageIcon icon = createImageIcon("images/geek-"
				+ choices.toString() + ".gif");
		
		pictureLabel.setIcon(icon);
		pictureLabel.setToolTipText(choices.toString());
		if (icon == null) {
			pictureLabel.setText("Missing Image");
		} else {
			pictureLabel.setText(null);
		}
	}

	/** Returns an ImageIcon, or null if the path was invalid. */
	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = ModifierCartoon.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}


	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Modifier Cartoon");
		JComponent newContentPane = new ModifierCartoon();
		newContentPane.setOpaque(true); // content panes must be opaque
		frame.setContentPane(newContentPane);
		frame.setBounds(910, 0, 450, 300);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}