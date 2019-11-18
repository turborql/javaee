package com.banyuan.test1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MyJFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JScrollPane scrollPane;
	private JTable table;
	private Vector data;
	private Vector colName;
	private JTextArea taCurPage;
	private JTextArea taCount;
	private DefaultTableModel dm;
	//单例设计模式，每个窗口只打开一个
    private static MyJFrame mf=new MyJFrame();
    public static MyJFrame getInstance() {
    	return mf;
    }
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJFrame frame = new MyJFrame();
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
	public MyJFrame() {
		setVisible(true);
		setTitle("学生信息表");
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//在一个JFrame窗口中设置一个按钮点击实现打开另一个新的窗口，现在关闭掉刚刚点击按钮打开的窗口后，原来的窗口也跟着一起关闭了，解决方法很简单
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		
//		设置居中
//		setBounds(100, 100, 721, 462);
		setSize(721,462);
		setLocationRelativeTo(null);
		
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

		data = getData(1, 3);
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

	public Vector getData(int curPage, int count) {
		Vector date = new Vector();
		ResultSet rs = null;
		PreparedStatement ps = null;
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties p = new Properties();
			p.load(new FileReader("db.properties"));
			String url = p.getProperty("url");
			String user = p.getProperty("user");
			String password = p.getProperty("password");
			conn = DriverManager.getConnection(url, user, password);
			String sql = "select * from stu_info1 limit ?,?";
			ps = conn.prepareStatement(sql);
			// 第1页 2 3
			// 0,3 3,3 6,3
			// 0,2 2,2 4,2

			ps.setObject(1, (curPage - 1) * count);
			ps.setObject(2, count);
			rs = ps.executeQuery();
//			System.out.println("id\tname\tage\tbirthday");
			while (rs.next()) {
//				System.out.println(
//						rs.getObject(1) + " \t" + rs.getObject(2) + "\t" + rs.getObject(3) + "\t" + rs.getObject(4));
				Vector line = new Vector();
				line.add(rs.getObject(1));
				line.add(rs.getObject(2));
				line.add(rs.getObject(3));
				line.add(rs.getObject(4));

				date.add(line);
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return date;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int curpage = Integer.parseInt(taCurPage.getText());
		int count = Integer.valueOf(taCount.getText());
		Vector data = getData(curpage, count);
		dm.setDataVector(data, colName);
	}
}
