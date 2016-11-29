package br.univel.telas;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.text.ParseException;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

/**
 * Tela cadastro de CLIENTE.
 * 
 * @author Cecilia Vanin
 *
 */

public class CadCliente extends JPanel {
	private JTextField txtNome;
	private JFormattedTextField data;//campo para data  
	private MaskFormatter ftmData;//Atributo formatador para data  
	private JTextField txtCpf;
	private JTextField txtRg;

	/**
	 * Create the panel.
	 * @return 
	 */
	
	
	
	public CadCliente() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 226, 316, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		add(lblNome, gbc_lblNome);

		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 2;
		gbc_txtNome.insets = new Insets(0, 0, 5, 0);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel = new JLabel("Data de Nascimento:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);

		JFormattedTextField frmtdtxtfldData = new JFormattedTextField();
		GridBagConstraints gbc_frmtdtxtfldData = new GridBagConstraints();
		gbc_frmtdtxtfldData.fill = GridBagConstraints.HORIZONTAL;
		gbc_frmtdtxtfldData.insets = new Insets(0, 0, 5, 5);
		gbc_frmtdtxtfldData.gridx = 1;
		gbc_frmtdtxtfldData.gridy = 2;
		add(frmtdtxtfldData, gbc_frmtdtxtfldData);
		MaskFormatter formato = new MaskFormatter();
		try{
			formato.setMask("##/##/####");
			formato.install(frmtdtxtfldData);
		}catch(ParseException pe){
			pe.printStackTrace();
		}

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		txtCpf = new JTextField();
		GridBagConstraints gbc_txtCpf = new GridBagConstraints();
		gbc_txtCpf.insets = new Insets(0, 0, 5, 5);
		gbc_txtCpf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCpf.gridx = 1;
		gbc_txtCpf.gridy = 3;
		add(txtCpf, gbc_txtCpf);
		txtCpf.setColumns(10);
		MaskFormatter formatocpf = new MaskFormatter();
		try{
			formato.setMask("###.###.###-##");
			formato.install(frmtdtxtfldData);
		}catch(ParseException pe){
			pe.printStackTrace();
		}


		JLabel lblNewLabel_2 = new JLabel("RG:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtRg = new JTextField();
		GridBagConstraints gbc_txtRg = new GridBagConstraints();
		gbc_txtRg.insets = new Insets(0, 0, 5, 5);
		gbc_txtRg.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRg.gridx = 1;
		gbc_txtRg.gridy = 4;
		add(txtRg, gbc_txtRg);
		txtRg.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.gridx = 2;
		gbc_btnCadastrar.gridy = 6;
		add(btnCadastrar, gbc_btnCadastrar);
		
	}

}
