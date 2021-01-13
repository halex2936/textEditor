import javax.swing.*;

public class TextInterface extends JFrame{
	private JTextArea textArea;
	private JMenu fileMenu,editMenu,formatMenu,viewMenu,helpMenu;
	private JMenuBar menuBar;
	private JMenuItem aNewItem, aNewWItem, aOpenItem, aSaveItem, aSaveAsItem, aExitItem;
	public TextInterface(){
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane (textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		//create menu bar
		menuBar = new JMenuBar();
		//fileMenu initilization
		fileMenu = new JMenu("File");
		fileInit();
		menuBar.add(fileMenu);	
		//editMenu
		editMenu = new JMenu("Edit");

		menuBar.add(editMenu);
		//formatMenu
		formatMenu = new JMenu("Format");

		menuBar.add(formatMenu);
		//viewMenu
		viewMenu = new JMenu("View");

		menuBar.add(viewMenu);
		//helpMenu
		helpMenu = new JMenu("Help");


		menuBar.add(helpMenu);
		//adding to class 
		this.setJMenuBar(menuBar);
		this.add(scroll);
		this.setVisible(true);
		this.setSize(800,640); 
		this.setTitle("Untitled");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void fileInit(){
		//initialization
		aNewItem = new JMenuItem("New");
		aNewWItem = new JMenuItem("New Window");
		aOpenItem = new JMenuItem("Open");
		aSaveItem = new JMenuItem("Save");
		aSaveAsItem = new JMenuItem("Save As");
		aExitItem = new JMenuItem("Exit");

		//add to fileMenu
		fileMenu.add(aNewItem);
		fileMenu.add(aNewWItem);
		fileMenu.add(aOpenItem);
		fileMenu.add(aSaveItem);
		fileMenu.add(aSaveAsItem);
		fileMenu.add(aExitItem);
	}
	
}