package Ex01_ConnectionForm;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("rawtypes")
public class FormConnector extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldServer;
	private JTextField textFieldPort;
	private JTextField textFieldRoot;
	private JPasswordField passwordField;
	private JLabel lblDBs;
	private JComboBox comboBox;
	private JComboBox comboBoxTables;
	private DBConnector db;
	private JLabel lblTables;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormConnector frame = new FormConnector();
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
	public FormConnector() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblServer = new JLabel("SERVER");
		lblServer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblServer.setName("lblServer");
		lblServer.setBounds(10, 10, 138, 30);
		contentPane.add(lblServer);

		JLabel lblPort = new JLabel("PORT");
		lblPort.setName("lblPort");
		lblPort.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPort.setBounds(10, 50, 138, 30);
		contentPane.add(lblPort);

		JLabel lblUser = new JLabel("USER");
		lblUser.setName("lblUser");
		lblUser.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblUser.setBounds(10, 90, 138, 30);
		contentPane.add(lblUser);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setName("lblPassword");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblPassword.setBounds(10, 130, 138, 30);
		contentPane.add(lblPassword);

		textFieldServer = new JTextField();
		textFieldServer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldServer.setText("localhost");
		textFieldServer.setName("textFieldServer");
		textFieldServer.setBounds(331, 10, 345, 30);
		contentPane.add(textFieldServer);
		textFieldServer.setColumns(10);

		textFieldPort = new JTextField();
		textFieldPort.setText("3306");
		textFieldPort.setName("textFieldPort");
		textFieldPort.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldPort.setColumns(10);
		textFieldPort.setBounds(331, 50, 345, 30);
		contentPane.add(textFieldPort);

		textFieldRoot = new JTextField();
		textFieldRoot.setText("root");
		textFieldRoot.setName("textFieldRoot");
		textFieldRoot.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldRoot.setColumns(10);
		textFieldRoot.setBounds(331, 90, 345, 30);
		contentPane.add(textFieldRoot);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		passwordField.setBounds(331, 130, 345, 30);
		contentPane.add(passwordField);

		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				String selection = (String) comboBox.getSelectedItem();
				if (selection.equalsIgnoreCase("northwind")) {
					Connection con = db.getConnector();
					comboBoxTables.setEnabled(true);
					try {
						Statement statement = con.createStatement();
						statement.execute("use northwind");
						Statement statement2 = con.createStatement();
						ResultSet resultSet = statement2.executeQuery("show tables;");
						while (resultSet.next()) {
							comboBoxTables.addItem(resultSet.getString(1));
						}
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
		comboBox.setEnabled(false);
		comboBox.setBounds(158, 233, 237, 30);
		contentPane.add(comboBox);

		comboBoxTables = new JComboBox();
		comboBoxTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selection = (String) comboBoxTables.getSelectedItem();
				Connection con = db.getConnector();

				try {
					Statement statement = con.createStatement();
					ResultSet resultSet = statement.executeQuery("select * from " + selection);
					ResultSetMetaData metaData = resultSet.getMetaData();
					int columnCount = metaData.getColumnCount();
					
					while (resultSet.next()) {
						for (int i = 1; i <= columnCount; i++) {
							System.out.println(resultSet.getString(i) + " ");
						}
						System.out.println();
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});
		comboBoxTables.setEnabled(false);
		comboBoxTables.setBounds(158, 295, 237, 30);
		contentPane.add(comboBoxTables);

		JButton btnConnect = new JButton("CONECTAR");
		btnConnect.addActionListener(new ActionListener() {
			@SuppressWarnings("unchecked")
			public void actionPerformed(ActionEvent e) {
				String host = textFieldServer.getText();
				String port = textFieldPort.getText();
				String user = textFieldRoot.getText();
				String password = new String(passwordField.getPassword());

				db = new DBConnector(host, port, user, password);
				Connection con = db.getConnector();

				try {
					Statement statement = con.createStatement();
					ResultSet resultSet = statement.executeQuery("show databases;");
					while (resultSet.next()) {
						comboBox.addItem(resultSet.getString(1));
					}
					comboBox.setEnabled(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConnect.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnConnect.setName("btnConnect");
		btnConnect.setBounds(439, 170, 237, 45);
		contentPane.add(btnConnect);

		lblDBs = new JLabel("Data Bases");
		lblDBs.setName("lblDBs");
		lblDBs.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDBs.setBounds(10, 232, 138, 30);
		contentPane.add(lblDBs);

		lblTables = new JLabel("Tables");
		lblTables.setName("lblTables");
		lblTables.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTables.setBounds(10, 295, 138, 30);
		contentPane.add(lblTables);

	}
}
