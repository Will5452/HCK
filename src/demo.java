import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import support.HintTextFieldUI;
import support.PullDown;

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
import java.awt.Choice;
import java.awt.List;
import java.awt.Label;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;

public class demo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private Border bdKetQua;
	private JLabel lbTHA,lbKU;
	private JTextField lbKetQuaTha,  lbKetQuaKu;
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
	private JTextField textEmail;
	private JLabel lblHienThi;
//	private JButton pullDaiLy,pullXH;
	private JComboBox<String> pullDaiLy,pullXH,pullXH_K,pullDaiLy_K,pullFB;
//	private JButton pullXH_K,pullDaiLy_K,pullFB;
	private JTextField textBDK;
	
	//biến dùng chung
	private String xung_ho,xung_ho_k = "";
	private String ma_dai_ly,ma_dai_ly_k = "";
	private JButton btnHDDK;
	

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
		setBounds(100, 100, 1019, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnKiemTra = new JButton("KIỂM TRA");
		btnKiemTra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				containerFunc();
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
		lbKetQuaKu = new JTextField("");
		lbKetQuaKu.setHorizontalAlignment(SwingConstants.LEFT);
		lbKetQuaKu.setFont(new Font("Tahoma", Font.BOLD, 11));
//		lbKetQuaKu.setBorder(bdKetQua);
		lbKetQuaKu.setBorder(BorderFactory.createCompoundBorder(
				textField.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		//Will : Duplicate border
		lbKetQuaTha = new JTextField("");
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
		
		btnDKC = new JButton("Đăng Ký Chưa");
		btnDKC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDKC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				containerFunc();
			}
		});
		
		btnNC = new JButton("Nạp Chưa");
		btnNC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				containerFunc();
				String s = textField.getText().toString().trim() + " *-nạp lần đầu* chưa "+ xung_ho +" *("+ ma_dai_ly+")*";
				lblHienThi.setText(s);
				StringSelection stringSelection = new StringSelection(lblHienThi.getText().toString());
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
			}
		});

		
		btnTNC = new JButton("Tái Nạp Chưa");
		btnTNC.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnCK = new JButton("Có Không");
		btnCK.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnCCK = new JButton("Còn Chơi Không");
		
		btnTTTK = new JButton("Trạng Thái TK");
		
		btnCLC = new JButton("Chuyển Link Chưa");
		
		btnNTC = new JButton("Nạp Thêm Chưa");
		
		textBD = new JTextField();
		textBD.setColumns(10);
		textBD.setBorder(BorderFactory.createCompoundBorder(
				textBD.getBorder(), 
		        BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		textSDT = new JTextField();
		textSDT.setColumns(10);
		textSDT.setBorder(BorderFactory.createCompoundBorder(
				textSDT.getBorder(), 				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBorder(BorderFactory.createCompoundBorder(				textEmail.getBorder(), 				BorderFactory.createEmptyBorder(5, 5, 5, 5)));
		
		lblHienThi = new JLabel("");
		lblHienThi.setBorder(bdKetQua);
		
		
		
		JLabel lblKTEAM = new JLabel("KTEAM");
		lblKTEAM.setHorizontalAlignment(SwingConstants.CENTER);
		lblKTEAM.setForeground(Color.BLUE);
		lblKTEAM.setFont(new Font("Times New Roman", Font.BOLD, 16));
		
		String[] choices = { "KU","THA", "DV31","DV32","DV35","DV36","DV38","DV39","DV358","DV597","DV598","DV599",};
	    String[] xungho = { "em","mình"};
	    String[] mxh = { "Facebook","Telegram","Zalo"};
	    
		
//		pullDaiLy = new JButton();
//		pullXH = new JButton();
//		pullFB = new JButton();
//		pullXH_K = new JButton();
//		pullDaiLy_K = new JButton();
		
		pullDaiLy_K = new JComboBox<String>(choices);
		pullXH_K = new JComboBox<String>(xungho);
		pullFB = new JComboBox<String>(mxh);
		pullXH = new JComboBox<String>(xungho);
	    pullDaiLy = new JComboBox<String>(choices);
		
		textBDK = new JTextField();
		textBDK.setColumns(10);
		
		btnHDDK = new JButton("HD ĐĂNG KÝ");
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMKT)
							.addGap(351)
							.addComponent(lblKTEAM))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 120, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnKiemTra, GroupLayout.DEFAULT_SIZE, 120, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lbTHA, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbKU, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lbKetQuaTha, GroupLayout.DEFAULT_SIZE, 500, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbKetQuaKu, GroupLayout.DEFAULT_SIZE, 500, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(pullXH, GroupLayout.DEFAULT_SIZE, 59, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pullDaiLy, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
								.addComponent(textEmail, Alignment.LEADING, 146, 146, 146)
								.addComponent(textSDT, Alignment.LEADING, 146, 146, 146)
								.addComponent(textBD, Alignment.LEADING, 146, 146, 146))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnDKC, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNC, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTNC, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCK, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCCK, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnTTTK, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCLC, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNTC, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnHDDK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(pullFB, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pullXH_K, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textBDK, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pullDaiLy_K, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addComponent(lblHienThi, GroupLayout.PREFERRED_SIZE, 835, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(158, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField, GroupLayout.DEFAULT_SIZE, 34, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbKU))
						.addComponent(lbKetQuaKu, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lbKetQuaTha, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnKiemTra, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
								.addComponent(lbTHA))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblMKT)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(pullFB, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textBDK, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(1)
											.addComponent(pullXH_K, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(pullDaiLy_K, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)))
									.addGap(3)
									.addComponent(btnHDDK, GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnCCK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnDKC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(textBD, GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(textSDT, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(textEmail, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnNC, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnTNC, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnTTTK, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnCLC, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(pullDaiLy, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
											.addComponent(pullXH, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
										.addComponent(btnCK, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNTC, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
						.addComponent(lblKTEAM, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblHienThi, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addGap(16))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
	//Will : Function
	private void containerFunc() {
		getXH();
		getXH_K();
		getMDL();
		getMDL_K();
	}
	
	private String getXH() {
		if(pullXH.getSelectedItem().toString().equals("mình")) {
			xung_ho = "nhé";	
		}else {
			xung_ho = "ạ";
		}
		return xung_ho;
	}
	
	private String getXH_K() {
		if(pullXH_K.getSelectedItem().toString().equals("mình")) {
			xung_ho_k = "nhé";	
		}else {
			xung_ho_k = "ạ";
		}
		return xung_ho_k;
	}
	
	private String getMDL() {
		ma_dai_ly = pullDaiLy.getSelectedItem().toString();
		return ma_dai_ly;
	}
	
	private String getMDL_K() {
		ma_dai_ly_k = pullDaiLy_K.getSelectedItem().toString();
		return ma_dai_ly_k;
	}
}
