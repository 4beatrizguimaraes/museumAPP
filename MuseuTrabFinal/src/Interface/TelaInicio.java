package Interface;

import java.awt.EventQueue;
import java.awt.Font;
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

public class TelaInicio {

	private JFrame frmArtFounder;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicio window1 = new TelaInicio();
					window1.frmArtFounder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Construtor TelaInicio()
	
	public TelaInicio() {
		initialize();
	}

	//initialize() contém os elementos da tela
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
		
		//PAINEL JPANEL
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 174, 477);
		frmArtFounder.getContentPane().add(panel);
		panel.setLayout(null);
		
		//BOTÃO ENCONTRAR OBRA DE ARTE
		JButton btnEncontrarObra = new JButton("Encontrar Obra de Arte");
		btnEncontrarObra.setBackground(Color.LIGHT_GRAY);
		btnEncontrarObra.setBounds(14, 97, 147, 28);
		btnEncontrarObra.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		panel.add(btnEncontrarObra);
		//AÇÕES
		btnEncontrarObra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		
		// BOTÃO CADASTRAR OBRA DE ARTE
		JButton btnCadastrarObra = new JButton("Cadastrar Obra de Arte");
		btnCadastrarObra.setBounds(12, 225, 149, 28);
		btnCadastrarObra.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		panel.add(btnCadastrarObra);
		//AÇÕES
		btnCadastrarObra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		// BOTÃO CADASTRAR MUSEU
		JButton btnCadastrarMuseu = new JButton("Cadastrar Museu");
		btnCadastrarMuseu.setBounds(14, 349, 147, 28);
		panel.add(btnCadastrarMuseu);
		btnCadastrarMuseu.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		//AÇÕES
		btnCadastrarMuseu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		
		
		//JLABELS (TEXTOS E IMAGENS)//
		
		JLabel lblArtFounder = DefaultComponentFactory.getInstance().createTitle("ART FOUNDER");
		lblArtFounder.setBackground(Color.GRAY);
		lblArtFounder.setForeground(Color.ORANGE);
		lblArtFounder.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 27));
		lblArtFounder.setBounds(552, 190, 215, 28);
		frmArtFounder.getContentPane().add(lblArtFounder);
		
		JLabel lblDesenvPorMichelly = new JLabel("Por MichellyLima e BeatrizGuimar\u00E3es");
		lblDesenvPorMichelly.setForeground(Color.BLACK);
		lblDesenvPorMichelly.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 12));
		lblDesenvPorMichelly.setBounds(541, 443, 253, 16);
		frmArtFounder.getContentPane().add(lblDesenvPorMichelly);
		
		JLabel lblFundo = new JLabel("");
		lblFundo.setIcon(new ImageIcon(TelaInicio.class.getResource("/imgs/arte.png")));
		lblFundo.setBounds(168, 0, 512, 477);
		frmArtFounder.getContentPane().add(lblFundo);

	}
}