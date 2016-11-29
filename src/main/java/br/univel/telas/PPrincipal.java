package br.univel.telas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagConstraints;

/**
 * Frame inicial, qual temos a inserção do MENU com as opções que dão continuidade (Cliente/Profissional)
 * @author Cecilia Vanin
 *
 */



public class PPrincipal extends JFrame {

	private JPanel contentPane;
	private JTabbedPane tabbedPane;
	private String titulo;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PPrincipal frame = new PPrincipal();
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
	public PPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 274);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 674, 0 };
		gbl_contentPane.rowHeights = new int[] { 36, 200, -99, 0 };
		gbl_contentPane.columnWeights = new double[] { 1.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JMenuBar menuBar = new JMenuBar();
		GridBagConstraints gbc_menuBar = new GridBagConstraints();
		gbc_menuBar.fill = GridBagConstraints.BOTH;
		gbc_menuBar.insets = new Insets(0, 0, 5, 0);
		gbc_menuBar.gridx = 0;
		gbc_menuBar.gridy = 0;
		contentPane.add(menuBar, gbc_menuBar);

		JMenu mnCadastro = new JMenu("Menu");
		menuBar.add(mnCadastro);

		JMenuItem mntmCadastroClientes = new JMenuItem("Cad. Cliente");
		mnCadastro.add(mntmCadastroClientes);
		mntmCadastroClientes.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				TelaCliente();
			}

		});

		JMenuItem mntmCadastroDeProfissionais = new JMenuItem("Cad. Profissional");
		mnCadastro.add(mntmCadastroDeProfissionais);
		
		JMenuItem mntmRelatrios = new JMenuItem("Relat\u00F3rios");
		mnCadastro.add(mntmRelatrios);
		mntmCadastroDeProfissionais.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				TelaProfissional();
			}

		});

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 2;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 0);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 1;
		contentPane.add(tabbedPane, gbc_tabbedPane);

	}

	private void TelaProfissional() {
		titulo = "Profissional";
		for (int i = 0; i < tabbedPane.getTabCount(); i++) {
			if (tabbedPane.getTitleAt(i).equals(titulo)) {
				tabbedPane.setSelectedIndex(i);
				return;
			}

		}
		CadProfi telaProfissional = new CadProfi();
		tabbedPane.addTab(titulo, telaProfissional);
		mostra();
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	private void TelaCliente() {
		titulo = "Cliente";
		for (int i = 0; i < tabbedPane.getTabCount(); i++) {
			if (tabbedPane.getTitleAt(i).equals(titulo)) {
				tabbedPane.setSelectedIndex(i);
				return;
			}

		}
		CadCliente telacliente = new CadCliente();
		tabbedPane.addTab(titulo, telacliente);
		mostra();
	}

	private void mostra() {
		tabbedPane.setSelectedIndex(tabbedPane.getTabCount() - 1);
	}
}

