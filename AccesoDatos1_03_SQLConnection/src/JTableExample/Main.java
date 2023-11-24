package JTableExample;

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
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldStatement;
	private JTable tableResult;
	private DefaultTableModel model;
	private Connection myConnection;

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
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldStatement = new JTextField();
		textFieldStatement.setName("textFieldStatement");
		textFieldStatement.setBounds(10, 10, 466, 40);
		contentPane.add(textFieldStatement);
		textFieldStatement.setColumns(10);
		
		tableResult = new JTable();
		tableResult.setName("tableResult");
		tableResult.setBounds(10, 130, 466, 323);
		contentPane.add(tableResult);
		
		model = new DefaultTableModel();
		tableResult.setModel(model);
		
		JButton btnExecute = new JButton("EJECUTAR");
		btnExecute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String statement = textFieldStatement.getText();
				
				try {
					Statement st = myConnection.createStatement();
					ResultSet rs = st.executeQuery(statement);
					ResultSetMetaData rsmd = rs.getMetaData();
					
					// SET TABLE COLUMNS AND NAMES
					model.setColumnCount(rsmd.getColumnCount());
					for (int i = 0; i < rsmd.getColumnCount(); i++) {
						model.addColumn(rsmd.getColumnName(i + 1));
						System.out.println(rsmd.getColumnName(i + 1));
					}
					
					// FILL TABLE
					while (rs.next()) {
						Object[] row = new Object[rsmd.getColumnCount()];
						for (int i = 0; i < rsmd.getColumnCount(); i++) {
							try {
								row[i] = rs.getObject(i + 1);
							} catch (Exception e1) {
							}
						}
						model.addRow(row);
					}
					
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
		});
		btnExecute.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExecute.setName("btnExecute");
		btnExecute.setBounds(10, 60, 110, 40);
		contentPane.add(btnExecute);
		
		DBConnector dbc = new DBConnector("localhost", "3306", "root", "");
		myConnection = dbc.getConnector();
		
		try {
			Statement db = myConnection.createStatement();
			db.execute("use northwind;");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
