package br.edu.devmedia.jdbc.gui;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

import javax.swing.WindowConstants;
import javax.swing.border.TitledBorder;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class MainFrame extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7973973234717597809L;
	private JPanel panelCadastro;
	private JLabel lblEndereco;
	private JButton btnCadastrar;
	private JTextField txtNascimento;
	private JLabel lblNascimento;
	private ButtonGroup grpSexo;
	private JTextField txtEndereco;
	private JLabel lblSexo;
	private JRadioButton rbtFeminino;
	private JRadioButton rbtMasculino;
	private JTextField txtCPF;
	private JLabel lblCPF;
	private JTextField jTextField1;
	private JLabel lblNome;
	private JPanel paneListagem;
	private JTabbedPane mainTabbedPane;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainFrame inst = new MainFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public MainFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			getContentPane().setLayout(thisLayout);
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setTitle("Principal");
			{
				mainTabbedPane = new JTabbedPane();
				{
					panelCadastro = new JPanel();
					GroupLayout panelCadastroLayout = new GroupLayout((JComponent)panelCadastro);
					panelCadastro.setLayout(panelCadastroLayout);
					mainTabbedPane.addTab("Cadastro", null, panelCadastro, null);
					{
						lblNome = new JLabel();
						lblNome.setText("Nome: ");
					}
					{
						rbtMasculino = new JRadioButton();
						rbtMasculino.setText("Masculino");
						getGrpSexo().add(rbtMasculino);
					}
					{
						rbtFeminino = new JRadioButton();
						rbtFeminino.setText("Feminino");
						getGrpSexo().add(rbtFeminino);
					}
					{
						lblSexo = new JLabel();
						lblSexo.setText("Sexo: ");
					}
					{
						lblEndereco = new JLabel();
						lblEndereco.setText("Endereço");
					}
					{
						txtEndereco = new JTextField();
					}
					{
						jTextField1 = new JTextField();
					}
					{
						lblCPF = new JLabel();
						lblCPF.setText("CPF:");
					}
					{
						txtCPF = new JTextField();
					}
					panelCadastroLayout.setHorizontalGroup(panelCadastroLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelCadastroLayout.createParallelGroup()
						    .addGroup(panelCadastroLayout.createSequentialGroup()
						        .addGroup(panelCadastroLayout.createParallelGroup()
						            .addComponent(lblCPF, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						            .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						                .addComponent(lblSexo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						                .addGap(17))
						            .addComponent(lblNome, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						            .addComponent(lblEndereco, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						        .addGroup(panelCadastroLayout.createParallelGroup()
						            .addGroup(panelCadastroLayout.createSequentialGroup()
						                .addComponent(txtEndereco, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						                .addGap(0, 0, Short.MAX_VALUE))
						            .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						                .addComponent(rbtMasculino, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						                .addGroup(panelCadastroLayout.createParallelGroup()
						                    .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						                        .addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
						                        .addGap(0, 35, Short.MAX_VALUE))
						                    .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						                        .addGap(20)
						                        .addComponent(rbtFeminino, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE)
						                        .addGap(0, 0, Short.MAX_VALUE)))
						                .addGap(104))
						            .addGroup(panelCadastroLayout.createSequentialGroup()
						                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						                .addGap(0, 0, Short.MAX_VALUE))
						            .addGroup(panelCadastroLayout.createSequentialGroup()
						                .addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						                .addGap(0, 0, Short.MAX_VALUE))))
						    .addGroup(GroupLayout.Alignment.LEADING, panelCadastroLayout.createSequentialGroup()
						        .addComponent(getLblNascimento(), GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						        .addGap(7)
						        .addComponent(getTxtNascimento(), GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						        .addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap(120, 120));
					panelCadastroLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {lblEndereco, lblCPF, lblNome});
					panelCadastroLayout.setVerticalGroup(panelCadastroLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(panelCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(jTextField1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(lblNome, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(panelCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(txtCPF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(lblCPF, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(panelCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(txtEndereco, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(lblEndereco, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(22)
						.addGroup(panelCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(rbtMasculino, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(rbtFeminino, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(lblSexo, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(17)
						.addGroup(panelCadastroLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						    .addComponent(getTxtNascimento(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
						    .addComponent(getLblNascimento(), GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(0, 22, Short.MAX_VALUE)
						.addComponent(getBtnCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(30, 30));
				}
				{
					paneListagem = new JPanel();
					GroupLayout paneListagemLayout = new GroupLayout((JComponent)paneListagem);
					paneListagem.setLayout(paneListagemLayout);
					mainTabbedPane.addTab("Listagem", null, paneListagem, null);
					paneListagemLayout.setVerticalGroup(paneListagemLayout.createParallelGroup());
					paneListagemLayout.setHorizontalGroup(paneListagemLayout.createParallelGroup());
				}
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(mainTabbedPane, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(39, Short.MAX_VALUE));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(mainTabbedPane, 0, 513, Short.MAX_VALUE)
				.addContainerGap());
			pack();
			this.setSize(553, 386);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}
	
	private ButtonGroup getGrpSexo() {
		if(grpSexo == null) {
			grpSexo = new ButtonGroup();
		}
		return grpSexo;
	}
	
	private JLabel getLblNascimento() {
		if(lblNascimento == null) {
			lblNascimento = new JLabel();
			lblNascimento.setText("Data de Nascimento:");
		}
		return lblNascimento;
	}
	
	private JTextField getTxtNascimento() {
		if(txtNascimento == null) {
			txtNascimento = new JTextField();
		}
		return txtNascimento;
	}
	
	private JButton getBtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton();
			btnCadastrar.setText("Cadastrar");
		}
		return btnCadastrar;
	}

}
