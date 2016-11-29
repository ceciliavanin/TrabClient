package br.univel.telas;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
/**
 * 
 * Tela cadastro de PROFISSIONAL
 * @author Cecilia Vanin
 *
 */

public class CadProfi extends JPanel {
	private JTextField txtNome;
	private JTextField txtData;
	private JTextField txtData_1;
	private JTextField txtRg2;


	public CadProfi() {


		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 226, 316, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13));
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.anchor = GridBagConstraints.EAST;
		gbc_lblNome.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 1;
		add(lblNome, gbc_lblNome);
		
		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.gridwidth = 2;
		gbc_txtNome.insets = new java.awt.Insets(0, 0, 5, 0);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 1;
		add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);

		JLabel lblNewLabel = new JLabel("Data de Nascimento:");
		lblNewLabel.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		MaskFormatter formato = new MaskFormatter();
		try{
			formato.setMask("##/##/####");
		}catch(ParseException pe){
			pe.printStackTrace();
		}
		
		txtData = new JTextField();
		GridBagConstraints gbc_txtData = new GridBagConstraints();
		gbc_txtData.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_txtData.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtData.gridx = 1;
		gbc_txtData.gridy = 2;
		add(txtData, gbc_txtData);
		txtData.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("CPF:");
		lblNewLabel_1.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 3;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		MaskFormatter formatocpf = new MaskFormatter();
		try{
			formato.setMask("###.###.###-##");
		}catch(ParseException pe){
			pe.printStackTrace();
		}
		
		txtData_1 = new JTextField();
		GridBagConstraints gbc_txtData_1 = new GridBagConstraints();
		gbc_txtData_1.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_txtData_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtData_1.gridx = 1;
		gbc_txtData_1.gridy = 3;
		add(txtData_1, gbc_txtData_1);
		txtData_1.setColumns(10);
		

		JLabel lblNewLabel_2 = new JLabel("RG:");
		lblNewLabel_2.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 4;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		txtRg2 = new JTextField();
		GridBagConstraints gbc_txtRg2 = new GridBagConstraints();
		gbc_txtRg2.insets = new java.awt.Insets(0, 0, 5, 5);
		gbc_txtRg2.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRg2.gridx = 1;
		gbc_txtRg2.gridy = 4;
		add(txtRg2, gbc_txtRg2);
		txtRg2.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		GridBagConstraints gbc_btnCadastrar = new GridBagConstraints();
		gbc_btnCadastrar.gridx = 2;
		gbc_btnCadastrar.gridy = 6;
		add(btnCadastrar, gbc_btnCadastrar);

	}

}

	