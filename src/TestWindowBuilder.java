import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class TestWindowBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField txtTest;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestWindowBuilder frame = new TestWindowBuilder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void btnTest_Clic(ActionEvent e) {
		txtTest.setText("Hello !");
	}

	/**
	 * Create the frame.
	 */
	public TestWindowBuilder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTest = new JButton("test");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 btnTest_Clic(e);
			}
		});
		btnTest.setBounds(27, 1, 134, 50);
		contentPane.add(btnTest);
		
		txtTest = new JTextField();
		txtTest.setBounds(238, 11, 86, 20);
		contentPane.add(txtTest);
		txtTest.setColumns(10);
		
		JLabel Perle = new JLabel("");
		String chemin = "perle200_200.jpg";
		String resource = getClass().getClassLoader().getResource(chemin).getPath();
		Perle.setIcon(new ImageIcon(resource));
		Perle.setBounds(192, 42, 200, 200);
		contentPane.add(Perle);
	}
}
