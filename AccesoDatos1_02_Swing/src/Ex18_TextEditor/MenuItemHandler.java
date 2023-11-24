package Ex18_TextEditor;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MenuItemHandler implements ActionListener {
	
	private JMenuItem menuItem;
	private JTextArea textArea;
	private JFrame frame;
	
	JFileChooser fileChooser;
	File file;
	BufferedReader bufferedReader;
	BufferedWriter bufferedWriter;

	public MenuItemHandler(JMenuItem menuItem, JTextArea textArea) {
		this.menuItem = menuItem;
		this.textArea = textArea;
	}

	public JMenuItem getMenuItem() {
		return menuItem;
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JMenuItem menuItem = (JMenuItem) e.getSource();
		
		if (menuItem.getName().equals("mnItemNew")) {
			frame = new Ex18_TextEditor.Main();
			frame.setSize(500, 500);
			frame.setVisible(true);
		}
		
		if (menuItem.getName().equals("mnItemOpenFile")) {
			fileChooser = new JFileChooser();
			int result = fileChooser.showOpenDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) {
				file = fileChooser.getSelectedFile();
				try {
					bufferedReader = new BufferedReader(new FileReader(file));
					textArea.read(bufferedReader, null);
					bufferedReader.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
		if (menuItem.getName().equals("mnItemSave")) {
			fileChooser = new JFileChooser();
			int result = fileChooser.showSaveDialog(null);
			if (result == JFileChooser.APPROVE_OPTION) {
				file = fileChooser.getSelectedFile();
				try {
					bufferedWriter = new BufferedWriter(new FileWriter(file));
					textArea.write(bufferedWriter);
					bufferedWriter.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		
		if (menuItem.getName().equals("mnItemClose")) System.exit(0);
		
		if (menuItem.getName().equals("mnItemCut")) textArea.cut();
		
		if (menuItem.getName().equals("mnItemCopy")) textArea.copy();
				
		if (menuItem.getName().equals("mnItemPaste")) textArea.paste();
		
		if (menuItem.getName().equals("mnItemBgColor")) {
			Color color = JColorChooser.showDialog(null, "Select Background Color", Color.WHITE);
			textArea.setBackground(color);
		}
		
		if (menuItem.getName().equals("mnItemTextSize")) {
			int size = Integer.parseInt(JOptionPane.showInputDialog("Select Font Size"));
			Font currentFont = textArea.getFont();
			textArea.setFont(new Font(currentFont.getName(), currentFont.getStyle(), size));
		}
		
		if (menuItem.getName().equals("mnItemTextColor")) {
			Color color = JColorChooser.showDialog(null, "Select Text Color", Color.BLACK);
			textArea.setForeground(color);
		}
	}

}
