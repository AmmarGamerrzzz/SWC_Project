package vaccination;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

@SuppressWarnings("serial")
public class WelcomePage extends JFrame {

	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();
	JLabel lblNewLabel = new JLabel("");
	private final JPanel PicturePanel = new JPanel();
	private final JLabel lblNewLabel_1 = new JLabel("");
	
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar.setBounds(10, 353, 417, 39);
		contentPane.add(progressBar);
		
		lblNewLabel.setBounds(10, 320, 84, 23);
		contentPane.add(lblNewLabel);
		
		PicturePanel.setBackground(Color.LIGHT_GRAY);
		PicturePanel.setBounds(84, 28, 271, 257);
		contentPane.add(PicturePanel);
		PicturePanel.setLayout(null);
		
		lblNewLabel_1.setBounds(10, 5, 251, 242);
		PicturePanel.add(lblNewLabel_1);
	}
}
