package Interface;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.factories.DefaultComponentFactory;


public class Tela1 {

	private JFrame frmArtFounder;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window1 = new Tela1();
					window1.frmArtFounder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArtFounder = new JFrame();
		frmArtFounder.setTitle("Art Founder");
		frmArtFounder.setBackground(Color.ORANGE);
		frmArtFounder.setResizable(false);
		frmArtFounder.getContentPane().setBackground(Color.GRAY);
		frmArtFounder.getContentPane().setForeground(Color.ORANGE);
		frmArtFounder.setBounds(100, 100, 800, 500);
		frmArtFounder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArtFounder.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 162, 477);
		frmArtFounder.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnEncontrarObraDe = new JButton("Encontrar Obra de Arte");
		btnEncontrarObraDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnEncontrarObraDe.setBackground(Color.LIGHT_GRAY);
		btnEncontrarObraDe.setBounds(1, 98, 147, 28);
		btnEncontrarObraDe.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		panel.add(btnEncontrarObraDe);
		
		JButton btnNewButton = new JButton("Cadastrar Obra de Arte");
		btnNewButton.setBounds(-1, 224, 149, 28);
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela2.main(null);
			}
		});
		panel.add(btnNewButton);
		
		JButton btnCadastrarMuseu = new JButton("Cadastrar Museu");
		btnCadastrarMuseu.setBounds(1, 350, 147, 28);
		panel.add(btnCadastrarMuseu);
		btnCadastrarMuseu.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		
		JLabel lblArtFounder = DefaultComponentFactory.getInstance().createTitle("ART FOUNDER");
		lblArtFounder.setBackground(Color.GRAY);
		lblArtFounder.setForeground(Color.ORANGE);
		lblArtFounder.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 27));
		lblArtFounder.setBounds(552, 190, 215, 28);
		frmArtFounder.getContentPane().add(lblArtFounder);
		
		JLabel lblDesenvPorMichelly = new JLabel("Por MichellyLima e BeatrizGuimar\u00E3es");
		lblDesenvPorMichelly.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblDesenvPorMichelly.setBounds(541, 443, 253, 16);
		frmArtFounder.getContentPane().add(lblDesenvPorMichelly);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\MIchelly\\workspace\\MuseuTrabFinal\\src\\imgs\\arte.png"));
		lblNewLabel.setBounds(163, 0, 512, 477);
		frmArtFounder.getContentPane().add(lblNewLabel);

	}
}
