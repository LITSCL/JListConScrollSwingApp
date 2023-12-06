package cl.inacap.jlistconscrollswingapp;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;

public class StartFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartFrame frame = new StartFrame();
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
	public StartFrame() {
		setTitle("JListConScrollSwingApp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane(); //1. Se crea el ScrollPane.
		scrollPane.setBounds(10, 11, 345, 242); //2. Se le asignan dimensiones al ScrollPane.
		contentPane.add(scrollPane);
		
		JList list = new JList(); //3. Se crea la lista.
		scrollPane.setViewportView(list); //4. Se a�ade la lista al ScrollPane.
		
		DefaultListModel mo = new DefaultListModel(); //5. Se crea el modelo de la lista.
		
		for (int i = 0; i < 50; i++) {
			mo.addElement("Daniel Alvarez " + (i + 1)); //6. Se a�aden elementos a la lista.
		}
		
		list.setModel(mo); //7. Se le carga el modelo a la lista.
	}
}
