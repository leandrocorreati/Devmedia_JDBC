package br.edu.devmedia.jdbc.gui;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

import br.edu.devmedia.jdbc.bo.LoginBO;
import br.edu.devmedia.jdbc.dto.LoginDTO;
import br.edu.devmedia.jdbc.exception.NegocioException;
import br.edu.devmedia.jdbc.util.MensagensUtil;


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
public class LoginFrame extends javax.swing.JFrame {
	
	private static final long serialVersionUID = -8213196153490347106L;
	
	private JButton btnSair;
	private JPanel panelLogin;
	private JPasswordField passSenha;
	private JTextField txtLogin;
	private JLabel jLabel1;
	private JLabel lblLogin;
	private JButton btnLogar;

	{
		//Set Look & Feel
		try {
			javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				LoginFrame inst = new LoginFrame();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public LoginFrame() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			GroupLayout thisLayout = new GroupLayout((JComponent)getContentPane());
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			getContentPane().setLayout(thisLayout);
			{
				btnSair = new JButton();
				btnSair.setText("Sair");
				btnSair.setFont(new java.awt.Font("Segoe UI",1,16));
				btnSair.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						System.exit(0);
					}
				});
			}
			{
				btnLogar = new JButton();
				btnLogar.setText("Logar");
				btnLogar.setFont(new java.awt.Font("Segoe UI",1,16));
				btnLogar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent evt) {
						LoginDTO loginDTO = new LoginDTO();
						loginDTO.setNome(txtLogin.getText());
						loginDTO.setSenha(new String (passSenha.getPassword()));
						//loginDTO.setSenha(passSenha.getPassword().toString());
						
						LoginBO loginBO = new LoginBO();
						try {
							if (loginBO.logar(loginDTO)) {
								LoginFrame.this.dispose();
								MainFrame mainFrame = new MainFrame();
								mainFrame.setLocationRelativeTo(null);
								mainFrame.setVisible(true);
								
							} else {
								MensagensUtil.addMsg(LoginFrame.this, "Dados inv�lidos!");
							}
						} catch (NegocioException e) {
							e.printStackTrace();
							MensagensUtil.addMsg(LoginFrame.this, e.getMessage());
						}
					}
				});
			}
			{
				panelLogin = new JPanel();
				GroupLayout panelLoginLayout = new GroupLayout((JComponent)panelLogin);
				panelLogin.setLayout(panelLoginLayout);
				panelLogin.setBorder(BorderFactory.createTitledBorder("Login"));
				panelLogin.setFont(new java.awt.Font("Segoe UI",1,20));
				{
					lblLogin = new JLabel();
					lblLogin.setText("Login:");
					lblLogin.setFont(new java.awt.Font("Segoe UI",1,20));
				}
				{
					txtLogin = new JTextField();
				}
				{
					jLabel1 = new JLabel();
					jLabel1.setText("Senha:");
					jLabel1.setFont(new java.awt.Font("Segoe UI",1,20));
				}
				{
					passSenha = new JPasswordField();
				}
					panelLoginLayout.setHorizontalGroup(panelLoginLayout.createSequentialGroup()
					.addContainerGap(21, 21)
					.addGroup(panelLoginLayout.createParallelGroup()
					    .addGroup(GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
					        .addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
					    .addComponent(jLabel1, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(panelLoginLayout.createParallelGroup()
					    .addGroup(panelLoginLayout.createSequentialGroup()
					        .addComponent(txtLogin, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 0, Short.MAX_VALUE))
					    .addGroup(GroupLayout.Alignment.LEADING, panelLoginLayout.createSequentialGroup()
					        .addComponent(passSenha, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
					        .addGap(0, 94, Short.MAX_VALUE)))
					.addContainerGap(33, 33));
					panelLoginLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {passSenha, txtLogin});
					panelLoginLayout.setVerticalGroup(panelLoginLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(panelLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(lblLogin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(txtLogin, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
					.addGroup(panelLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					    .addComponent(jLabel1, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
					    .addComponent(passSenha, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(35, 35));
					panelLoginLayout.linkSize(SwingConstants.VERTICAL, new Component[] {passSenha, txtLogin});
			}
			thisLayout.setVerticalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addComponent(panelLogin, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE)
				.addGap(0, 0, Short.MAX_VALUE)
				.addGroup(thisLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    .addComponent(btnSair, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
				    .addComponent(btnLogar, GroupLayout.Alignment.BASELINE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(124, 124));
			thisLayout.setHorizontalGroup(thisLayout.createSequentialGroup()
				.addContainerGap()
				.addGroup(thisLayout.createParallelGroup()
				    .addComponent(panelLogin, GroupLayout.Alignment.LEADING, 0, 359, Short.MAX_VALUE)
				    .addGroup(GroupLayout.Alignment.LEADING, thisLayout.createSequentialGroup()
				        .addGap(158)
				        .addComponent(btnLogar, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
				        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 0, Short.MAX_VALUE)
				        .addComponent(btnSair, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))));
			thisLayout.linkSize(SwingConstants.HORIZONTAL, new Component[] {btnLogar, btnSair});
			pack();
			this.setSize(463, 300);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
