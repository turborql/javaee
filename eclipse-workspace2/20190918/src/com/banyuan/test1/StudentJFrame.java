package com.banyuan.test1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JTextArea;

public class StudentJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JTextArea textArea;
	private Vector data;
	private Vector colname;
private DefaultTableModel tm ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentJFrame frame = new StudentJFrame();
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
	public StudentJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 798, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 6, 786, 511);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 101, 720, 404);
		panel.add(scrollPane);

//		Vector data=new Vector();
		data = getDBData();
		colname = new Vector();
		colname.add("id");
		colname.add("name");

		// table模型，看源代码,TableModel是接口
		 tm = new DefaultTableModel(data, colname);
		// 把tm放入JTable
		table = new JTable(tm);
		scrollPane.setViewportView(table);

		JButton btnInsert = new JButton("insert");
		btnInsert.addActionListener(this);
		btnInsert.setBounds(153, 49, 117, 29);
		panel.add(btnInsert);

		textArea = new JTextArea();
		textArea.setBounds(329, 32, 278, 46);
		panel.add(textArea);
	}

	private void insertDBData(String content) {
		
		try {

			// 1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");//
			System.out.println("ok");
			// 2.获取mysql数据库连接
			String url = "jdbc:mysql://localhost:3306/ql";
			String user = "root";
			String password = "Root_123";
			// 驱动管理器DriverManager
			Connection conn = DriverManager.getConnection(url, user, password);

			// 3、构造sql语句
			String sql = "insert into student5(name) values(?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, content);
			// 4、执行插入的内容，在终端查看
			ps.executeUpdate();
			
			
			
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private Vector getDBData() {
		Vector d = new Vector();
		try {

			// 1.加载驱动
			Class.forName("com.mysql.cj.jdbc.Driver");//
			System.out.println("ok");
			// 2.获取mysql数据库连接
			String url = "jdbc:mysql://localhost:3306/ql";
			String user = "root";
			String password = "Root_123";
			// 驱动管理器DriverManager
			Connection conn = DriverManager.getConnection(url, user, password);

			// 3、构造sql语句
			String sql = "select * from student5";
			PreparedStatement ps = conn.prepareStatement(sql);
			// 查询结果--查询
			ResultSet rs = ps.executeQuery();
			// rs.next()能不能取到下一行
			while (rs.next()) {
				// 从1开始的
//				System.out.println(rs.getObject(1) + " " + rs.getObject(2));
				Vector line = new Vector();
				line.add(rs.getObject(1));
				line.add(rs.getObject(2));
				d.add(line);
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return d;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String content = textArea.getText();
		insertDBData(content);
		tm.setDataVector(getDBData(), colname);
		//清空输入的文字
		textArea.setText("");
	}
}
