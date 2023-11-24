package Ex18_TextEditor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	private final static String ROOT = "src\\Ex18_TextEditor\\";
	private final static int IMG_SIDE = 28;
	private boolean saved = false;
	
	JFileChooser fileChooser;
	File file;
	BufferedWriter bufferedWriter;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setSize(500, 500);
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
		setBackground(new Color(255, 255, 255));
		setTitle("TEXT EDITOR");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (!saved) {
					int option = JOptionPane.showConfirmDialog(Main.this, "El archivo no ha sido guardado. "
							+ "¿Desea guardar los cambios?", "Advertencia", JOptionPane.YES_NO_OPTION);
					if (option == JOptionPane.YES_OPTION) {
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
						saved = true;
						dispose();
					} else if (option == JOptionPane.NO_OPTION) dispose();
				} else dispose();
			}
		});
		
		textArea = new JTextArea();
		textArea.setBackground(new Color(255, 255, 255));
		JScrollPane scrollPane = new JScrollPane(textArea);
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 128, 128));
		setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuFile.setForeground(new Color(0, 0, 0));
		menuFile.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuFile.setName("menuFile");
		menuBar.add(menuFile);
		
		JMenuItem mnItemNew = new JMenuItem("New File");
		mnItemNew.addActionListener(new MenuItemHandler(mnItemNew, textArea));
		mnItemNew.setBackground(new Color(192, 192, 192));
		mnItemNew.setForeground(new Color(0, 0, 0));
		mnItemNew.setName("mnItemNew");
		ImageIcon iconNew = new ImageIcon(ROOT + "newFile.png");
		Image scaledNew = iconNew.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemNew.setIcon(new ImageIcon(scaledNew));
		menuFile.add(mnItemNew);
		
		JMenuItem mnItemOpenFile = new JMenuItem("Open File");
		mnItemOpenFile.addActionListener(new MenuItemHandler(mnItemOpenFile, textArea));
		mnItemOpenFile.setBackground(new Color(192, 192, 192));
		mnItemOpenFile.setForeground(new Color(0, 0, 0));
		mnItemOpenFile.setName("mnItemOpenFile");
		ImageIcon iconOpen = new ImageIcon(ROOT + "openFile.png");
		Image scaledOpen = iconOpen.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemOpenFile.setIcon(new ImageIcon(scaledOpen));
		menuFile.add(mnItemOpenFile);
		
		JMenuItem mnItemSave = new JMenuItem("Save");
		mnItemSave.addActionListener(new MenuItemHandler(mnItemSave, textArea));
		mnItemSave.setBackground(new Color(192, 192, 192));
		mnItemSave.setForeground(new Color(0, 0, 0));
		mnItemSave.setName("mnItemSave");
		ImageIcon iconSave = new ImageIcon(ROOT + "saveFile.png");
		Image scaledSave = iconSave.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemSave.setIcon(new ImageIcon(scaledSave));
		menuFile.add(mnItemSave);
		
		JMenuItem mnItemClose = new JMenuItem("Close");
		mnItemClose.addActionListener(new MenuItemHandler(mnItemClose, textArea));
		mnItemClose.setBackground(new Color(192, 192, 192));
		mnItemClose.setForeground(new Color(0, 0, 0));
		mnItemClose.setName("mnItemClose");
		ImageIcon iconClose = new ImageIcon(ROOT + "close.png");
		Image scaledClose = iconClose.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemClose.setIcon(new ImageIcon(scaledClose));
		menuFile.add(mnItemClose);
		
		JMenu menuEdit = new JMenu("Edition");
		menuEdit.setForeground(new Color(0, 0, 0));
		menuEdit.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuEdit.setName("menuEdit");
		menuBar.add(menuEdit);
		
		JMenuItem mnItemCut = new JMenuItem("Cut");
		mnItemCut.addActionListener(new MenuItemHandler(mnItemCut, textArea));
		mnItemCut.setBackground(new Color(192, 192, 192));
		mnItemCut.setForeground(new Color(0, 0, 0));
		mnItemCut.setName("mnItemCut");
		ImageIcon iconCut = new ImageIcon(ROOT + "cut.png");
		Image scaledCut = iconCut.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemCut.setIcon(new ImageIcon(scaledCut));
		menuEdit.add(mnItemCut);
		
		JMenuItem mnItemCopy = new JMenuItem("Copy");
		mnItemCopy.addActionListener(new MenuItemHandler(mnItemCopy, textArea));
		mnItemCopy.setBackground(new Color(192, 192, 192));
		mnItemCopy.setForeground(new Color(0, 0, 0));
		mnItemCopy.setName("mnItemCopy");
		ImageIcon iconCopy = new ImageIcon(ROOT + "copy.png");
		Image scaledCopy = iconCopy.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemCopy.setIcon(new ImageIcon(scaledCopy));
		menuEdit.add(mnItemCopy);
		
		JMenuItem mnItemPaste = new JMenuItem("Paste");
		mnItemPaste.addActionListener(new MenuItemHandler(mnItemPaste, textArea));
		mnItemPaste.setBackground(new Color(192, 192, 192));
		mnItemPaste.setForeground(new Color(0, 0, 0));
		mnItemPaste.setName("mnItemPaste");
		ImageIcon iconPaste = new ImageIcon(ROOT + "paste.png");
		Image scaledPaste = iconPaste.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemPaste.setIcon(new ImageIcon(scaledPaste));
		menuEdit.add(mnItemPaste);
				
		JMenu menuSettings = new JMenu("Settings");
		menuSettings.setForeground(new Color(0, 0, 0));
		menuSettings.setFont(new Font("Segoe UI", Font.BOLD, 16));
		menuSettings.setName("menuSettings");
		menuBar.add(menuSettings);
		
		JMenuItem mnItemBgColor = new JMenuItem("Background");
		mnItemBgColor.addActionListener(new MenuItemHandler(mnItemBgColor, textArea));
		mnItemBgColor.setBackground(new Color(192, 192, 192));
		mnItemBgColor.setForeground(new Color(0, 0, 0));
		mnItemBgColor.setName("mnItemBgColor");
		ImageIcon iconBgColor = new ImageIcon(ROOT + "backgroundColor.png");
		Image scaledBgColor = iconBgColor.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemBgColor.setIcon(new ImageIcon(scaledBgColor));
		menuSettings.add(mnItemBgColor);
		
		JMenuItem mnItemTextSize = new JMenuItem("Text Size");
		mnItemTextSize.addActionListener(new MenuItemHandler(mnItemTextSize, textArea));
		mnItemTextSize.setBackground(new Color(192, 192, 192));
		mnItemTextSize.setForeground(new Color(0, 0, 0));
		mnItemTextSize.setName("mnItemTextSize");
		ImageIcon iconTextSize = new ImageIcon(ROOT + "textSize.png");
		Image scaledTextSize = iconTextSize.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemTextSize.setIcon(new ImageIcon(scaledTextSize));
		menuSettings.add(mnItemTextSize);
		
		JMenuItem mnItemTextColor = new JMenuItem("Text Color");
		mnItemTextColor.addActionListener(new MenuItemHandler(mnItemTextColor, textArea));
		mnItemTextColor.setBackground(new Color(192, 192, 192));
		mnItemTextColor.setForeground(new Color(0, 0, 0));
		mnItemTextColor.setName("mnItemTextColor");
		ImageIcon iconTextColor = new ImageIcon(ROOT + "textColor.png");
		Image scaledTextColor = iconTextColor.getImage().getScaledInstance(IMG_SIDE,  IMG_SIDE, Image.SCALE_SMOOTH);
		mnItemTextColor.setIcon(new ImageIcon(scaledTextColor));
		menuSettings.add(mnItemTextColor);
	}
}
