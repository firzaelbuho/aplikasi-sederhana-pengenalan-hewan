package tugas_pbo;
import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class window3 {
Hewan myHewan;
	public static String hewan;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window3 window = new window3();
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
	public window3() {
		cek_hewan(this.hewan);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton button_5 = new JButton("<");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame.dispose();
				new window2();
				
			}
		});
		button_5.setBounds(42, 11, 49, 23);
		frame.getContentPane().add(button_5);
		
		JLabel lblNewLabel = new JLabel("Nama : "+myHewan.getNama());
		lblNewLabel.setBounds(42, 59, 179, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("Jenis : "+myHewan.getJenis());
		label.setBounds(42, 90, 179, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Cara Berkembang biak : "+myHewan.getReproduksi());
		label_1.setBounds(42, 124, 179, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Alat Pernafasan : "+myHewan.getBernapas());
		label_2.setBounds(42, 161, 179, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Jumlah kaki : "+myHewan.getKaki());
		label_3.setBounds(42, 194, 179, 14);
		frame.getContentPane().add(label_3);
		ImageIcon ii = new ImageIcon("images/"+hewan+".jpg");
		
		
		JLabel lblNewLabel_1 = new JLabel(ii);
		lblNewLabel_1.setBounds(268, 59, 156, 116);
		frame.getContentPane().add(lblNewLabel_1);
		
		//setIconImage(ii.getImage());
		
		frame.setVisible(true);
	}
	
 public void cek_hewan(String x) {
	 //Polimorfisme
	 
	 switch(x) {
	 
	 case "gajah":
		 myHewan = new Mamalia(x);
		 break;
	 case "sapi":
		 myHewan = new Mamalia(x);
		 break;
		 
	 case "kerbau":
		 myHewan = new Mamalia(x);
		 break;
	 case "harimau":
		 myHewan = new Mamalia(x);
		 break;
	 case "kambing":
		 myHewan = new Mamalia(x);
		 break;
	 case "monyet":
		 myHewan = new Mamalia(x);
		 break;
		 
	 case "ayam":
		 myHewan = new Unggas(x,"paru-paru");
		 break;
	 case "merpati":
		 myHewan = new Unggas(x,"kantung udara");
		 break;
		 
	 case "bebek":
		 myHewan = new Unggas(x,"paru-paru");
		 break;
	 case "angsa":
		 myHewan = new Unggas(x,"paru-paru");
		 break;
	 case "elang":
		 myHewan = new Unggas(x,"kantung udara");
		 break;
	 case "rajawali":
		 myHewan = new Unggas(x,"kantung udara");
		 break;
		 
		 
	 case "ular":
		 myHewan = new Reptil(x,0);
		 break;
	 case "cicak":
		 myHewan = new Reptil(x,4);
		 break;
		 
	 case "buaya":
		 myHewan = new Reptil(x,4);
		 break;
	 case "biawak":
		 myHewan = new Reptil(x,4);
	 case "komodo":
		 myHewan = new Reptil(x,4);
		 break;
	 case "aligator":
		 myHewan = new Reptil(x,4);
		 break;
		 
		 
		 case "belalang":
			 myHewan = new Serangga(x,0);
			 break;
		 case "jangkrik":
			 myHewan = new Serangga(x,0);
			 break;
			 
		 case "ngengat":
			 myHewan = new Serangga(x,0);
			 break;
		 case "kalajengking":
			 myHewan = new Serangga(x,0);
		 case "kecoa":
			 myHewan = new Serangga(x,0);
			 break;
		 case "lebah":
			 myHewan = new Serangga(x,0);
			 break;
		 
		 
		 
	default:
		break;
	 
	 }
	 
 }
}
