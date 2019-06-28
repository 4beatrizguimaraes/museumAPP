package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;

public class Tela2 {

	private JFrame frmArtFounder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
					window.frmArtFounder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArtFounder = new JFrame();
		frmArtFounder.getContentPane().setBackground(Color.GRAY);
		frmArtFounder.setTitle("Art Founder");
		frmArtFounder.setBounds(100, 100, 800, 500);
		frmArtFounder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArtFounder.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, -24, 162, 477);
		frmArtFounder.getContentPane().add(panel);
		
		JButton btnVoltarMenu = new JButton("Voltar Menu");
		btnVoltarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnVoltarMenu.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		btnVoltarMenu.setBounds(6, 66, 147, 28);
		panel.add(btnVoltarMenu);
		
		JLabel lblCadastrarObraDe = new JLabel("CADASTRAR OBRA DE ARTE");
		lblCadastrarObraDe.setForeground(Color.ORANGE);
		lblCadastrarObraDe.setFont(new Font("Lucida Sans", Font.BOLD, 24));
		lblCadastrarObraDe.setBounds(167, 24, 359, 64);
		frmArtFounder.getContentPane().add(lblCadastrarObraDe);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\MIchelly\\workspace\\MuseuTrabFinal\\src\\imgs\\abstrato.png"));
		label.setBounds(445, -12, 512, 512);
		frmArtFounder.getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(174, 160, 12, 24);
		frmArtFounder.getContentPane().add(textPane);
	}
}
