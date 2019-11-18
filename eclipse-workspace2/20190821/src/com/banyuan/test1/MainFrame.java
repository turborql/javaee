package com.banyuan.test1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTable table;
	private JTextField scoretf;
	private JTextField agetf;
	private JTextField tfSex;
	private JTextField sextf;
	private Vector data;
	private Vector colName;
	private DefaultTableModel dtm;
	private JTextField nametf;
	private JTextField oldName;
	private JTextField sortName;
	private JTextField updateName;
	private JTextField updateAge;
	private JTextField updateSex;
	private JTextField updateScore;
	private JTextField tfSort;

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
		data = new Vector();
		Vector row1 = new Vector();
		row1.add("zhangsan");
		row1.add(20);
		row1.add("男");
		row1.add(80);

		Vector row2 = new Vector();
		row2.add("lisi");
		row2.add(21);
		row2.add("女");
		row2.add(85);

		data.add(row1);
		data.add(row2);

		colName = new Vector();
		colName.add("姓名");
		colName.add("年龄");
		colName.add("性别");
		colName.add("分数");
		dtm = new DefaultTableModel(data, colName);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1221, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.NORTH);

		JPanel addpanel1 = new JPanel();
		tabbedPane.addTab("add", null, addpanel1, null);

		JLabel NamelblNewLabel = new JLabel("姓名");
		NamelblNewLabel.setBounds(82, 11, 26, 16);
		addpanel1.add(NamelblNewLabel);

		scoretf = new JTextField();
		scoretf.setBounds(318, 6, 130, 26);

		scoretf.setColumns(10);

		nametf = new JTextField();
		addpanel1.add(nametf);
		nametf.setColumns(10);

		JLabel AgelblNewLabel = new JLabel("年龄");
		AgelblNewLabel.setBounds(113, 11, 26, 16);
		addpanel1.add(AgelblNewLabel);

		agetf = new JTextField();
		agetf.setBounds(144, 6, 130, 26);
		addpanel1.add(agetf);
		agetf.setColumns(10);

		JButton addButton = new JButton("add");
		addButton.setBounds(619, 5, 75, 29);
		addButton.addActionListener(this);

		JLabel SexlblNewLabel = new JLabel("性别");
		SexlblNewLabel.setBounds(453, 11, 26, 16);

		addpanel1.add(SexlblNewLabel);

		sextf = new JTextField();
		sextf.setBounds(484, 6, 130, 26);

		sextf.setColumns(10);

		addpanel1.add(sextf);

		JLabel ScorelblNewLabel = new JLabel("Score");
		ScorelblNewLabel.setBounds(279, 11, 34, 16);
		addpanel1.add(ScorelblNewLabel);

		addpanel1.add(scoretf);
		addpanel1.add(addButton);

		JPanel deletpanel = new JPanel();
		tabbedPane.addTab("delete", null, deletpanel, null);

		JLabel lblOldname = new JLabel("oldName");
		deletpanel.add(lblOldname);

		oldName = new JTextField();
		deletpanel.add(oldName);
		oldName.setColumns(10);

		JButton deleteButton = new JButton("delete");
		deleteButton.addActionListener(this);
		deletpanel.add(deleteButton);

		JPanel updatepanel = new JPanel();
		tabbedPane.addTab("updata", null, updatepanel, null);

		JLabel uptatelblNewLabel = new JLabel("sortName");
		updatepanel.add(uptatelblNewLabel);

		sortName = new JTextField();
		updatepanel.add(sortName);
		sortName.setColumns(10);

		JLabel lblUpdatename = new JLabel("updataName");
		updatepanel.add(lblUpdatename);

		updateName = new JTextField();
		updatepanel.add(updateName);
		updateName.setColumns(10);

		JLabel lblUpdateage = new JLabel("updateAge");
		updatepanel.add(lblUpdateage);

		updateAge = new JTextField();
		updatepanel.add(updateAge);
		updateAge.setColumns(10);

		JLabel updateSexLabel = new JLabel("updateSex");
		updatepanel.add(updateSexLabel);

		updateSex = new JTextField();
		updatepanel.add(updateSex);
		updateSex.setColumns(10);

		JLabel updatelblNewLabel = new JLabel("updateScore");
		updatepanel.add(updatelblNewLabel);

		updateScore = new JTextField();
		updatepanel.add(updateScore);
		updateScore.setColumns(10);

		JButton upbtnNewButton = new JButton("update");
		upbtnNewButton.addActionListener(this);
		updatepanel.add(upbtnNewButton);

		JPanel sort1panel = new JPanel();
		tabbedPane.addTab("Sort", null, sort1panel, null);

		tfSort = new JTextField();
		sort1panel.add(tfSort);
		tfSort.setColumns(10);

		JButton SortbtnNewButton = new JButton("Sort");
		SortbtnNewButton.addActionListener(this);

		sort1panel.add(SortbtnNewButton);

		tfSex = new JTextField();

		tfSex.setColumns(10);

		table = new JTable(dtm);
		JScrollPane scrollPane = new JScrollPane(table);

		contentPane.add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("add".equals(e.getActionCommand())) {
			Vector row3 = new Vector();
			String name = nametf.getText();
			row3.add(name);
			String age = agetf.getText();
			row3.add(age);
			String sex = sextf.getText();
			row3.add(sex);
			String score = scoretf.getText();
			row3.add(score);

			data.add(row3);
			dtm.setDataVector(data, colName);
		} else {
			if ("delete".equals(e.getActionCommand())) {
				String name = oldName.getText();
				for (int i = 0; i < data.size(); i++) {
					Object d = data.get(i);
					Vector v = (Vector) d;
//					System.out.println(v.get(0));
					if (v.get(0).equals(name)) {
						data.remove(i);
						dtm.setDataVector(data, colName);
					}

				}

			} else {
				if ("update".equals(e.getActionCommand())) {
					String name = sortName.getText();

					for (int i = 0; i < data.size(); i++) {
						Object d = data.get(i);
						Vector v = (Vector) d;
						if (name.equals(v.get(0))) {
							data.remove(i);
							Vector row4 = new Vector();
							String upname = updateName.getText();
							row4.add(upname);
							String upage = updateAge.getText();
							row4.add(upage);
							String upsex = updateSex.getText();
							row4.add(upsex);
							String upscore = updateScore.getText();
							row4.add(upscore);

							data.add(row4);
							dtm.setDataVector(data, colName);

						}

					}

				}else {
					if("Sort".equals(e.getActionCommand())) {
						
					}
				}
			}

		}

	}

}
