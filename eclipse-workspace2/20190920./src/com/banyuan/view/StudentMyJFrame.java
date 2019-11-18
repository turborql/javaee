package com.banyuan.view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.banyuan.service.StudentService;
import com.banyuan.serviceimpl.StudentServiceImpl;

public class StudentMyJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private Vector data;
	private Vector colName;
	private JTextArea taCurPage;
	private JTextArea taCount;
	private DefaultTableModel dm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMyJFrame frame = new StudentMyJFrame();
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
	public StudentMyJFrame() {
		setTitle("学生信息表");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 141, 709, 293);
		contentPane.add(panel);
		panel.setLayout(null);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 697, 281);
		panel.add(scrollPane);

		//接口                      实现类
		StudentService ss=new StudentServiceImpl();
		data = ss.getData(1, 3);
		colName = new Vector();
		colName.add("id");
		colName.add("name");
		colName.add("age");
		colName.add("birthday");

		dm = new DefaultTableModel(data, colName);
		table = new JTable(dm);
		scrollPane.setViewportView(table);

		JLabel label = new JLabel("跳转到第");
		label.setBounds(6, 70, 61, 16);
		contentPane.add(label);

		taCurPage = new JTextArea();
		taCurPage.setBounds(62, 70, 38, 16);
		contentPane.add(taCurPage);

		JLabel label_1 = new JLabel("页");
		label_1.setBounds(103, 70, 61, 16);
		contentPane.add(label_1);

		JButton button = new JButton("跳转");
		button.addActionListener(this);
		button.setBounds(356, 65, 117, 29);
		contentPane.add(button);

		JLabel label_2 = new JLabel("每页");

		label_2.setBounds(159, 70, 97, 16);
		contentPane.add(label_2);

		taCount = new JTextArea();
		taCount.setBounds(191, 70, 50, 16);
		contentPane.add(taCount);

		JLabel label_3 = new JLabel("条");
		label_3.setBounds(244, 70, 61, 16);
		contentPane.add(label_3);

	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		String strCurPage=taCurPage.getText();
		String strCount=taCount.getText();
		//if(strCurPageString.trim().length()==0
		boolean falg=Pattern.matches("\\d+",strCurPage );
		if(!falg) {
			String message="请输入要跳转的页面";
			JOptionPane.showMessageDialog(null, message);
		}
		
			}
}
