package tugas_pbo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class window2 {
	
	String hewan[] = new String[6];

	private JFrame frame;
	public static String passValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window2 window = new window2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public window2() {
		
		cek_jenis(this.passValue);
		
		initialize();
	}
	
	//method
	public void cek_jenis(String x) {
		switch(x) {
		case "mamalia":
			hewan[0]="gajah";
			hewan[1]="sapi";
			hewan[2]="kerbau";
			hewan[3]="monyet";
			hewan[4]="harimau";
			hewan[5]="kambing";
			break;
		case "unggas":
			hewan[0]="ayam";
			hewan[1]="merpati";
			hewan[2]="bebek";
			hewan[3]="angsa";
			hewan[4]="elang";
			hewan[5]="rajawali";
			break;
		case "reptil":
			hewan[0]="ular";
			hewan[1]="buaya";
			hewan[2]="komodo";
			hewan[3]="biawak";
			hewan[4]="aligator";
			hewan[5]="cicak";
			break;
		case "serangga":
			hewan[0]="belalang";
			hewan[1]="kecoa";
			hewan[2]="jangkrik";
			hewan[3]="ngengat";
			hewan[4]="lebah";
			hewan[5]="kalajengking";
			break;
		default:
			break;
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pilih hewan "+passValue);
		lblNewLabel.setBounds(145, 40, 172, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton(hewan[0]);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.hewan=hewan[0];
				frame.dispose();
				new window3();
				
			}
		});
		btnNewButton.setBounds(50, 96, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton(hewan[1]);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.hewan=hewan[1];
				frame.dispose();
				new window3();
				
			}
		});
		button.setBounds(185, 96, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton(hewan[2]);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.hewan=hewan[2];
				frame.dispose();
				new window3();
				
			}
		});
		button_1.setBounds(312, 96, 97, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton(hewan[3]);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.hewan=hewan[3];
				frame.dispose();
				new window3();
				
			}
		});
		button_2.setBounds(50, 168, 89, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton(hewan[4]);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.hewan=hewan[4];
				frame.dispose();
				new window3();
				
			}
		});
		button_3.setBounds(185, 168, 89, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton(hewan[5]);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window3.hewan=hewan[5];
				frame.dispose();
				new window3();
				
			}
		});
		button_4.setBounds(312, 168, 97, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("<");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//window2.passValue="mamalia";
				frame.dispose();
				new Main();
				
			}
		});
		button_5.setBounds(42, 11, 49, 23);
		frame.getContentPane().add(button_5);
		frame.setVisible(true);
	}

}
