package tugas_pbo;

/*
 *TUGAS PBO
 *Anggota :
 *
 *Firza Nanda Rio Aditya 4611418017
 *Iqbal 4611418008
 *Muhammad Naufal Sadid 46114180
 */

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

	private JFrame frame;
	//JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//SCRIPT ANDA
	}

	/**
	 * Create the application.
	 */
	public Main() {
		//
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
		frame.setTitle("Program Belajar");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		JLabel lblNewLabel = new JLabel("Aplikasi Pengenalan Hewan");
		lblNewLabel.setBounds(125, 56, 223, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Mamalia");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window2.passValue="mamalia";
				frame.dispose();
				new window2();
				
			}
		});
		btnNewButton.setBounds(98, 100, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton button = new JButton("Unggas");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window2.passValue="unggas";
				frame.dispose();
				new window2();
				
			}
		});
		button.setBounds(259, 100, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Reptil");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window2.passValue="reptil";
				frame.dispose();
				new window2();
				
			}
		});
		button_1.setBounds(98, 159, 89, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Serangga");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				window2.passValue="serangga";
				frame.dispose();
				new window2();
				
			}
		});
		button_2.setBounds(259, 159, 89, 23);
		frame.getContentPane().add(button_2);
	}
}
