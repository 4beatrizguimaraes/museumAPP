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

public class TelaCadastrarObra {

	private JFrame frmArtFounder;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastrarObra window = new TelaCadastrarObra();
					window.frmArtFounder.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Construtor TelaInicio()
	public TelaCadastrarObra() {
		initialize();
	}

	//initialize() contém os elementos da tela
	private void initialize() {
		frmArtFounder = new JFrame();
		frmArtFounder.getContentPane().setBackground(Color.GRAY);
		frmArtFounder.setTitle("Art Founder");
		frmArtFounder.setBounds(100, 100, 800, 500);
		frmArtFounder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArtFounder.getContentPane().setLayout(null);
		
		//PAINEL JPANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, -24, 162, 477);
		frmArtFounder.getContentPane().add(panel);
		
		//BOTÃO VOLTAR MENU
		JButton btnVoltarMenu = new JButton("Voltar Menu");
		btnVoltarMenu.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		btnVoltarMenu.setBounds(6, 66, 147, 28);
		panel.add(btnVoltarMenu);
		//AÇÕES
		btnVoltarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//JLABELS (TEXTO E IMAGENS)
		JLabel lblCadastrarObraDe = new JLabel("CADASTRAR OBRA DE ARTE");
		lblCadastrarObraDe.setForeground(Color.ORANGE);
		lblCadastrarObraDe.setFont(new Font("Lucida Sans", Font.BOLD, 24));
		lblCadastrarObraDe.setBounds(167, 24, 359, 64);
		frmArtFounder.getContentPane().add(lblCadastrarObraDe);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(TelaCadastrarObra.class.getResource("/imgs/abstrato.png")));
		fundo.setBounds(445, -12, 512, 512);
		frmArtFounder.getContentPane().add(fundo);
	}
}
