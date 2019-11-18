package com.banyuan.test4;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class BankJFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	Bank bank;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BankJFrame frame = new BankJFrame();
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
	public BankJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 689);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.add(ta_b, BorderLayout.CENTER);
		
		JTextArea ta_a = new JTextArea();
		ta_a.setBounds(65, 100, 300, 400);
		//contentPane.add(ta_a);

		JScrollPane scrollPane = new JScrollPane(ta_a);
		scrollPane.setBounds(65, 100, 300, 400);
		contentPane.add(scrollPane);
		
		
		JTextArea ta_b = new JTextArea();
		ta_b.setBounds(450, 135, 300, 400);
		//contentPane.add(ta_b);
		
		JScrollPane scrollPane_1 = new JScrollPane(ta_b);
		scrollPane_1.setBounds(450, 100, 300, 400);
		contentPane.add(scrollPane_1);
		
		JLabel lblA = new JLabel("A账户");
		lblA.setBounds(65, 67, 61, 16);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B账户");
		lblB.setBounds(451, 72, 61, 16);
		contentPane.add(lblB);
		
		 bank=new Bank(ta_a,ta_b,true);
		
		JButton bt_start = new JButton("开始交易");
		bt_start.setBounds(445, 512, 117, 29);
		contentPane.add(bt_start);
		bt_start.addActionListener(this);
		
		JButton bt_stop = new JButton("停止交易");
		bt_stop.setBounds(75, 512, 117, 29);
		contentPane.add(bt_stop);
		bt_stop.addActionListener(this);
		
		
		MyThread mt1=new MyThread("A",bank);
		MyThread mt2=new MyThread("B",bank);
		Thread t1=new Thread(mt1);
		Thread t2=new Thread(mt2);
		t1.start();
		t2.start();
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		bank.setFlag(false);
	}
}
