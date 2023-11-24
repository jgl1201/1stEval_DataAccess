package Ex02_FormJTable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel model;
	private Connection myConnection;
	private JTextField textFieldServer;
	private JTextField textFieldPort;
	private JTextField textFieldUser;
	private JPasswordField passwordField;
	private JTable tableRes;
	private JComboBox<String> comboBoxDBs;
	private JComboBox<String> comboBoxTables;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(25, 25, 25));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLabels = new JPanel();
		panelLabels.setBackground(new Color(25, 25, 25));
		panelLabels.setForeground(new Color(192, 192, 192));
		panelLabels.setBounds(10, 10, 250, 200);
		contentPane.add(panelLabels);
		panelLabels.setLayout(new GridLayout(4, 1, 10, 10));
		
		JLabel lblServer = new JLabel("SERVER:");
		lblServer.setForeground(new Color(0, 0, 0));
		lblServer.setBackground(new Color(192, 192, 192));
		lblServer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblServer.setOpaque(true);
		panelLabels.add(lblServer);
		
		JLabel lblPort = new JLabel("PORT:");
		lblPort.setForeground(new Color(0, 0, 0));
		lblPort.setBackground(new Color(192, 192, 192));
		lblPort.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPort.setOpaque(true);
		panelLabels.add(lblPort);
		
		JLabel lblUser = new JLabel("USER:");
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setBackground(new Color(192, 192, 192));
		lblUser.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblUser.setOpaque(true);
		panelLabels.add(lblUser);
		
		JLabel lblPassword = new JLabel("PASSWORD:");
		lblPassword.setForeground(new Color(0, 0, 0));
		lblPassword.setBackground(new Color(192, 192, 192));
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblPassword.setOpaque(true);
		panelLabels.add(lblPassword);
		
		JPanel panelFields = new JPanel();
		panelFields.setBackground(new Color(25, 25, 25));
		panelFields.setBounds(270, 10, 250, 200);
		contentPane.add(panelFields);
		panelFields.setLayout(new GridLayout(4, 1, 10, 10));
		
		textFieldServer = new JTextField();
		textFieldServer.setForeground(new Color(0, 0, 0));
		textFieldServer.setText("localhost");
		textFieldServer.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		panelFields.add(textFieldServer);
		textFieldServer.setColumns(10);
		
		textFieldPort = new JTextField();
		textFieldPort.setForeground(new Color(0, 0, 0));
		textFieldPort.setText("3306");
		textFieldPort.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldPort.setColumns(10);
		panelFields.add(textFieldPort);
		
		textFieldUser = new JTextField();
		textFieldUser.setForeground(new Color(0, 0, 0));
		textFieldUser.setText("root");
		textFieldUser.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		textFieldUser.setColumns(10);
		panelFields.add(textFieldUser);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		panelFields.add(passwordField);
		
		JPanel panelComboBoxes = new JPanel();
		panelComboBoxes.setBackground(new Color(25, 25, 25));
		panelComboBoxes.setBounds(530, 10, 346, 200);
		contentPane.add(panelComboBoxes);
		panelComboBoxes.setLayout(new GridLayout(4, 1, 10, 10));
		
		JLabel lblDBs = new JLabel("DATA BASES");
		lblDBs.setForeground(new Color(0, 0, 0));
		lblDBs.setHorizontalAlignment(SwingConstants.CENTER);
		lblDBs.setOpaque(true);
		lblDBs.setBackground(new Color(192, 192, 192));
		lblDBs.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panelComboBoxes.add(lblDBs);
		
		comboBoxDBs = new JComboBox<>();
		comboBoxDBs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dbName = (String) comboBoxDBs.getSelectedItem();
				
				try {
					Statement getTables = myConnection.createStatement();
					ResultSet tables = getTables.executeQuery("SHOW TABLES FROM " + dbName);
					
					// CLEAR THE TABLES SHOWN IN ORDER TO UPDATE
					comboBoxTables.removeAllItems();
					
					while (tables.next()) {
						comboBoxTables.addItem(tables.getString(1));
					}
					comboBoxTables.setEnabled(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		comboBoxDBs.setForeground(new Color(0, 0, 0));
		comboBoxDBs.setEnabled(false);
		comboBoxDBs.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panelComboBoxes.add(comboBoxDBs);
		
		JLabel lblTables = new JLabel("TABLES");
		lblTables.setForeground(new Color(0, 0, 0));
		lblTables.setHorizontalAlignment(SwingConstants.CENTER);
		lblTables.setOpaque(true);
		lblTables.setBackground(new Color(192, 192, 192));
		lblTables.setFont(new Font("Times New Roman", Font.BOLD, 18));
		panelComboBoxes.add(lblTables);
		
		comboBoxTables = new JComboBox<>();
		comboBoxTables.setForeground(new Color(0, 0, 0));
		comboBoxTables.setEnabled(false);
		comboBoxTables.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panelComboBoxes.add(comboBoxTables);
		
		JScrollPane scrollPane = new JScrollPane(tableRes, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setBounds(10, 260, 866, 293);
		contentPane.add(scrollPane);
		
		tableRes = new JTable();
		tableRes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane.setViewportView(tableRes);
		tableRes.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		model = new DefaultTableModel();
		tableRes.setModel(model);
		
		JButton btnConnect = new JButton("CONECTAR");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String server = textFieldServer.getText();
				String port = textFieldPort.getText();
				String user = textFieldUser.getText();
				String password = new String(passwordField.getPassword());
				
				DBConnector dbConnector = new DBConnector(server, port, user, password);
				myConnection = dbConnector.getConnector();
				
				try {
					Statement getDBs = myConnection.createStatement();
					ResultSet resultSet = getDBs.executeQuery("SHOW DATABASES");
					while(resultSet.next()) {
						comboBoxDBs.addItem(resultSet.getString(1));
					}
					comboBoxDBs.setEnabled(true);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnConnect.setForeground(new Color(0, 0, 0));
		btnConnect.setName("btnConnect");
		btnConnect.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnConnect.setBounds(10, 220, 250, 30);
		contentPane.add(btnConnect);
		
		JButton btnExecute = new JButton("SELECT * FROM");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String db = (String) comboBoxDBs.getSelectedItem();
				String table = (String) comboBoxTables.getSelectedItem();
			
				try {
					Statement selectFrom = myConnection.createStatement();
					ResultSet rs = selectFrom.executeQuery("SELECT * FROM " + db + "." + table);
					ResultSetMetaData rsmd = rs.getMetaData();
					
					//model.setColumnCount(rsmd.getColumnCount());
					model.setRowCount(0);
					for (int i = 1; i <= rsmd.getColumnCount(); i++) {
						model.addColumn(rsmd.getColumnName(i));
					}
					
					while (rs.next()) {
						Vector<Object> row = new Vector<>();
						for (int i = 1; i <= rsmd.getColumnCount(); i++) {
							try {
								row.add(rs.getObject(i));
							} catch (SQLException e1) {
								
							}
						}
						if (!row.isEmpty()) {
							model.addRow(row);
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnExecute.setName("btnExecute");
		btnExecute.setForeground(Color.BLACK);
		btnExecute.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnExecute.setBounds(270, 220, 250, 30);
		contentPane.add(btnExecute);
	}
}
