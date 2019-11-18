package com.banyuan.veiw;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class StorageJFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfpdy;
	private JTextField tfpdt;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StorageJFrame frame = new StorageJFrame();
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
	public StorageJFrame() {
		setTitle("生成报表");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 843, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("盘点员");
		lblNewLabel.setBounds(87, 62, 61, 16);
		panel.add(lblNewLabel);
		
		tfpdy = new JTextField();
		tfpdy.setBounds(160, 57, 130, 26);
		panel.add(tfpdy);
		tfpdy.setColumns(10);
		
		JLabel label = new JLabel("盘点时间");
		label.setBounds(352, 62, 61, 16);
		panel.add(label);
		
		tfpdt = new JTextField();
		tfpdt.setBounds(436, 57, 130, 26);
		panel.add(tfpdt);
		tfpdt.setColumns(10);
		
		JButton btreport = new JButton("生成报表");
		btreport.addActionListener(this);
		btreport.setBounds(643, 57, 117, 29);
		panel.add(btreport);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 142, 843, 408);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 831, 396);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tfpdy.getText();
		tfpdt.getText();
		tfpdy.setText(" ");
		tfpdt.setText(" ");
	}

}
