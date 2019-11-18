package com.banyuan.test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JTextField tfName;
	private JTextField tfAge;
	private JTextField tfSex;
	private JTextField tfScore;
	private Vector data;
	private Vector colName;
	private DefaultTableModel dtm;
	private JTextField textField;

    	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {	
		data=new Vector();
		Vector row1=new Vector();
		row1.add("zhangsan");
		row1.add(20);
		row1.add("男");
		row1.add(80);
		
		Vector row2=new Vector();
		row2.add("lisi");
		row2.add(21);
		row2.add("女");
		row2.add(85);

        data.add(row1);
        data.add(row2);
        
        colName=new Vector();
		colName.add("姓名");
		colName.add("年龄");
		colName.add("性别");
		colName.add("分数");
		dtm=new DefaultTableModel(data,colName);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 924, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel1 = new JPanel();
//		panel1.setLayout(null);
		contentPane.add(panel1, BorderLayout.NORTH);
		
		JLabel NamelblNewLabel = new JLabel("姓名");
		NamelblNewLabel.setBounds(82, 11, 26, 16);
		panel1.add(NamelblNewLabel);
		
		tfName = new JTextField();
		tfName.setBounds(318, 6, 130, 26);
		
		tfName.setColumns(10);
		
		
		
		
		panel1.add(tfName);
		
		JLabel AgelblNewLabel = new JLabel("年龄");
		AgelblNewLabel.setBounds(113, 11, 26, 16);
		panel1.add(AgelblNewLabel);
		
		tfAge = new JTextField();
		tfAge.setBounds(144, 6, 130, 26);
		panel1.add(tfAge);
		tfAge.setColumns(10);
		
		JLabel SexlblNewLabel = new JLabel("性别");
		SexlblNewLabel.setBounds(453, 11, 26, 16);
		
		
		tfSex = new JTextField();
		
		tfSex.setColumns(10);
		
		JLabel ScorelblNewLabel = new JLabel("Score");
		ScorelblNewLabel.setBounds(279, 11, 34, 16);
		panel1.add(ScorelblNewLabel);
		
		JButton addButton = new JButton("add");
		addButton.setBounds(619, 5, 75, 29);
		addButton.addActionListener(this);
		
		
		table = new JTable(dtm);
		JScrollPane scrollPane = new JScrollPane(table);
		
		tfScore = new JTextField();
		tfScore.setBounds(484, 6, 130, 26);
		
		tfScore.setColumns(10);
		
		panel1.add(tfScore);
		
		panel1.add(SexlblNewLabel);
		
		textField = new JTextField();
		panel1.add(textField);
		textField.setColumns(10);
		panel1.add(addButton);
		
		
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		
		//contentPane.add(table, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Vector row3=new Vector();
		String name=tfName.getText();
		row3.add(name);
		String age=tfAge.getText();
		row3.add(age);
		String sex=tfSex.getText();
		row3.add(sex);
		String score=tfScore.getText();
		row3.add(score);
		
		data.add(row3);			
	}

}
