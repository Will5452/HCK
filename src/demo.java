import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import support.HintTextFieldUI;

import javax.swing.JInternalFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.sound.sampled.Line;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Canvas;
import java.awt.TextField;
import javax.swing.DropMode;

public class demo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Border bdKetQua;
	private JLabel lbTHA,lbKU ,lbKetQuaTha,  lbKetQuaKu;
	private JLabel lblMKT;
	private JButton btnDKC;
	private JButton btnNC;
	private JButton btnTNC;
	private JButton btnCK;
	private JButton btnCCK;
	private JButton btnTTTK;
	private JButton btnCLC;
	private JButton btnNTC;
	private JTextField textBD;
	private JTextField textSDT;
	private JTextField textField_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					demo frame = new demo();
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
	public demo() {
		setTitle("HCK Tools");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnKiemTra = new JButton("KIỂM TRA");
		btnKiemTra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbKetQuaKu.setText("Không có nhé !");
				lbKetQuaTha.setText("Không có nhé !");
			}
		});
		
		/**
		 * Will : tam thoi ko set Hint
		 */
		final HintTextFieldUI textFieldA = new HintTextFieldUI("Tên tài khoản",false);
		textField = new JTextField();
		textField.setColumns(10);
//		textField.setUI(textFieldA);
		textField.setBorder(BorderFactory.createCompoundBorder(
				textField.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		//Will : Duplicate border
		bdKetQua = BorderFactory.createLineBorder(Color.BLUE, 2);
		lbKetQuaKu = new JLabel("");
		lbKetQuaKu.setHorizontalAlignment(SwingConstants.LEFT);
		lbKetQuaKu.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lbKetQuaKu.setBorder(bdKetQua);
		lbKetQuaKu.setBorder(BorderFactory.createCompoundBorder(
				textField.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		//Will : Duplicate border
		lbKetQuaTha = new JLabel("");
		lbKetQuaTha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbKetQuaTha.setHorizontalAlignment(SwingConstants.LEFT);
//		lbKetQuaTha.setBorder(bdKetQua);
		lbKetQuaTha.setBorder(BorderFactory.createCompoundBorder(
				textField.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		lbKU = new JLabel("KU");
		lbKU.setHorizontalAlignment(SwingConstants.CENTER);
		lbKU.setForeground(new Color(0, 0, 255));
		lbKU.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		lbTHA = new JLabel("THA");
		lbTHA.setHorizontalAlignment(SwingConstants.CENTER);
		lbTHA.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbTHA.setForeground(new Color(0, 0, 255));
		
		lblMKT = new JLabel("MKT");
		lblMKT.setForeground(new Color(0, 0, 255));
		lblMKT.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblMKT.setHorizontalAlignment(SwingConstants.CENTER);
		
		btnDKC = new JButton("New button");
		btnDKC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDKC.setMargin(new Insets(0, 0, 0, 0));
		
		btnNC = new JButton("New button");
		btnNC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNC.setMargin(new Insets(0, 0, 0, 0));

		
		btnTNC = new JButton("New button");
		btnTNC.setMargin(new Insets(0, 0, 0, 0));
		
		btnCK = new JButton("New button");
		btnCK.setMargin(new Insets(0, 0, 0, 0));
		
		btnCCK = new JButton("New button");
		btnCCK.setMargin(new Insets(0, 0, 0, 0));
		
		btnTTTK = new JButton("New button");
		btnTTTK.setMargin(new Insets(0, 0, 0, 0));
		
		btnCLC = new JButton("New button");
		btnCLC.setMargin(new Insets(0, 0, 0, 0));
		
		btnNTC = new JButton("New button");
		btnNTC.setMargin(new Insets(0, 0, 0, 0));
		
		textBD = new JTextField();
		textBD.setColumns(10);
		textBD.setBorder(BorderFactory.createCompoundBorder(
				textBD.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		textBD.setMargin(new Insets(0, 0, 0, 0));
		
		textSDT = new JTextField();
		textSDT.setMargin(new Insets(0, 0, 0, 0));
		textSDT.setColumns(10);
		textSDT.setBorder(BorderFactory.createCompoundBorder(
						textBD.getBorder(), 
				        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		textField_1 = new JTextField();
		textField_1.setMargin(new Insets(0, 0, 0, 0));
		textField_1.setColumns(10);
		textField_1.setBorder(BorderFactory.createCompoundBorder(
								textBD.getBorder(), 
						        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblMKT)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
						.addComponent(btnKiemTra, GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbTHA, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbKU, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lbKetQuaTha, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
						.addComponent(lbKetQuaKu, GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textBD, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 84, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnTNC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCLC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnCK, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNTC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDKC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNC, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCCK, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTTTK, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(260, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbKU))
						.addComponent(lbKetQuaKu, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lbKetQuaTha, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnKiemTra, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(lbTHA))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblMKT)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnDKC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textBD, 0, 0, Short.MAX_VALUE))
						.addComponent(btnCCK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnNC)
							.addComponent(btnTTTK))
						.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnTNC)
								.addComponent(btnCLC))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCK)
								.addComponent(btnNTC)))
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(46))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
