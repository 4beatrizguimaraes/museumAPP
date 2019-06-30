package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;


public class TelaCadastrarObra {

	private JFrame frmArtFounder;
	private JTextField nomeObra;
	private JTextField localizacaoObra;
	private JTextField nomeAutor;
	private JTextField nacionalidadeAutor;

	
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
		frmArtFounder.getContentPane().setFont(new Font("Lucida Sans Unicode", Font.BOLD, 14));
		frmArtFounder.setResizable(false);
		frmArtFounder.getContentPane().setBackground(Color.GRAY);
		frmArtFounder.setTitle("Art Founder");
		frmArtFounder.setBounds(100, 100, 800, 500);
		frmArtFounder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmArtFounder.getContentPane().setLayout(null);
		
		//PAINEL JPANEL
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 180, 477);
		frmArtFounder.getContentPane().add(panel);
		
		//BOTÃO VOLTAR MENU
		JButton btnVoltarMenu = new JButton("Voltar Menu");
		btnVoltarMenu.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 10));
		btnVoltarMenu.setBounds(6, 66, 147, 28);
		panel.add(btnVoltarMenu);
		//AÇÕES
		btnVoltarMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicio.main(null);
				frmArtFounder.dispose();
				frmArtFounder.setVisible(false);
			}
		});
		
		
		//JLABELS (TEXTO E IMAGENS)
		JLabel lblCadastrarObraDe = new JLabel("CADASTRAR OBRA DE ARTE");
		lblCadastrarObraDe.setForeground(Color.ORANGE);
		lblCadastrarObraDe.setFont(new Font("Lucida Sans", Font.BOLD, 24));
		lblCadastrarObraDe.setBounds(192, 0, 359, 64);
		frmArtFounder.getContentPane().add(lblCadastrarObraDe);
		
		JLabel fundo = new JLabel("");
		fundo.setIcon(new ImageIcon(TelaCadastrarObra.class.getResource("/imgs/abstrato.png")));
		fundo.setBounds(445, -12, 512, 512);
		frmArtFounder.getContentPane().add(fundo);
		
		JLabel lblNomeDaObra = new JLabel("Nome da Obra de Arte");
		lblNomeDaObra.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblNomeDaObra.setBounds(267, 76, 166, 16);
		frmArtFounder.getContentPane().add(lblNomeDaObra);
		
		JLabel lblAutor = new JLabel("Autor");
		lblAutor.setForeground(Color.ORANGE);
		lblAutor.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 17));
		lblAutor.setBounds(323, 306, 55, 16);
		frmArtFounder.getContentPane().add(lblAutor);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblCategoria.setBounds(267, 131, 74, 16);
		frmArtFounder.getContentPane().add(lblCategoria);
		
		JLabel lblLocalizacaoObra = new JLabel("Localiza\u00E7\u00E3o no Museu");
		lblLocalizacaoObra.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblLocalizacaoObra.setBounds(267, 239, 166, 16);
		frmArtFounder.getContentPane().add(lblLocalizacaoObra);
		
		JLabel lblMuseu = new JLabel("Museu");
		lblMuseu.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblMuseu.setBounds(267, 185, 55, 16);
		frmArtFounder.getContentPane().add(lblMuseu);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblNome.setBounds(270, 329, 55, 16);
		frmArtFounder.getContentPane().add(lblNome);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 13));
		lblNacionalidade.setBounds(267, 369, 107, 16);
		frmArtFounder.getContentPane().add(lblNacionalidade);
		

		//BOX INSERIR DADOS
		nomeObra = new JTextField();
		nomeObra.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		nomeObra.setBounds(267, 91, 166, 28);
		frmArtFounder.getContentPane().add(nomeObra);
		nomeObra.setColumns(10);
	
		
		localizacaoObra = new JTextField();
		localizacaoObra.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		localizacaoObra.setBounds(267, 254, 166, 28);
		frmArtFounder.getContentPane().add(localizacaoObra);
		localizacaoObra.setColumns(10);
		
		nomeAutor = new JTextField();
		nomeAutor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		nomeAutor.setBounds(267, 343, 166, 28);
		frmArtFounder.getContentPane().add(nomeAutor);
		nomeAutor.setColumns(10);
		
		nacionalidadeAutor = new JTextField();
		nacionalidadeAutor.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		nacionalidadeAutor.setBounds(267, 383, 166, 28);
		frmArtFounder.getContentPane().add(nacionalidadeAutor);
		nacionalidadeAutor.setColumns(10);
		String nacionalidade = nacionalidadeAutor.getText();
		
		JComboBox categoriaObra = new JComboBox();
		categoriaObra.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		categoriaObra.setModel(new DefaultComboBoxModel(new String[] {"Pintura", "Retrato", "Escultura", "Fotografia", "Reliquia"}));
		categoriaObra.setBounds(267, 145, 166, 28);
		frmArtFounder.getContentPane().add(categoriaObra);
		
		
		JComboBox museuObra = new JComboBox();
		museuObra.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
		museuObra.setModel(new DefaultComboBoxModel(new String[] {"Museu X"}));
		museuObra.setBounds(267, 201, 166, 26);
		frmArtFounder.getContentPane().add(museuObra);
		
		//BOTÃO CADASTRAR
				//*CRIAR EXCEÇÃO DE ERRO PARA FALTA DE INFORMAÇÕES
				//*COLOCAR MUSEU NA OBRA DE ARTE
		//Lista de Obras de Arte
		ArrayList<ObradeArte> listaObrasdeArte = new ArrayList<ObradeArte>();
		
				JButton btnCadastrar = new JButton("CADASTRAR");
				btnCadastrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String nome = nomeObra.getText();
						
						String loc = localizacaoObra.getText();
						
						String autorNome = nomeAutor.getText();
						String autorNacionalidade = nacionalidadeAutor.getText();
						Autor autor = new Autor(autorNome, autorNacionalidade);
						
						Categoria categoria = new Categoria();
						categoria.nome =  categoriaObra.getSelectedItem().toString();	
						
						ObradeArte obradearte = new ObradeArte(nome, loc, categoria, autor);
						
						listaObrasdeArte.add(obradearte);
						JOptionPane.showMessageDialog(null, "Cadastro Realizado com Sucesso");
					}
				});
				btnCadastrar.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 13));
				btnCadastrar.setBounds(290, 423, 120, 28);
				frmArtFounder.getContentPane().add(btnCadastrar);

	}
}
