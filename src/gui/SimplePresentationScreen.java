package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Toolkit;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public SimplePresentationScreen(Student studentData) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png")));
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setResizable(false);
		setContentPane(contentPane);
		
		init();
		setVisible(true);
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Información del alumno", null, tabInformation, "Muestra la información declarada por el alumno");
		
		lblNewLabel_2 = new JLabel("LU");
		
		JLabel lblNewLabel_3 = new JLabel("Apellido");
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		
		JLabel lblNewLabel_6 = new JLabel("Github URL");
		
		textField = new JTextField(Integer.toString(studentData.getId()));
		textField.setColumns(10);
		
		textField_1 = new JTextField(studentData.getLastName());
		textField_1.setColumns(10);
		
		textField_2 = new JTextField(studentData.getFirstName());
		textField_2.setColumns(10);
		
		textField_3 = new JTextField(studentData.getMail());
		textField_3.setColumns(10);
		
		textField_4 = new JTextField(studentData.getGithubURL());
		textField_4.setColumns(10);
		GroupLayout gl_tabInformation = new GroupLayout(tabInformation);
		gl_tabInformation.setHorizontalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_4))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_5))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(10)
							.addComponent(lblNewLabel_6))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_3)))
					.addGap(32)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.LEADING, gl_tabInformation.createSequentialGroup()
							.addComponent(textField, 320, 320, 320)
							.addContainerGap())
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGroup(gl_tabInformation.createParallelGroup(Alignment.TRAILING)
								.addComponent(textField_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
								.addComponent(textField_2, Alignment.LEADING, 320, 320, Short.MAX_VALUE)
								.addComponent(textField_4, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
							.addContainerGap())))
		);
		gl_tabInformation.setVerticalGroup(
			gl_tabInformation.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_tabInformation.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_tabInformation.createSequentialGroup()
							.addGap(9)
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(9)
					.addGroup(gl_tabInformation.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_6)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		tabInformation.setLayout(gl_tabInformation);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		
		panel = new JPanel();
		
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/nerdfacecover.jpg")).getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT)));
		panel.add(lblNewLabel);
		
		
		crearRegistroFecha();

	}
	
	private void crearRegistroFecha() {
		JLabel lblNewLabel_1 = new JLabel("Esta ventana fue generada el " + new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime()) + " a las: " + new SimpleDateFormat("HH:mm:ss").format(new Date()));
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
	}
}
