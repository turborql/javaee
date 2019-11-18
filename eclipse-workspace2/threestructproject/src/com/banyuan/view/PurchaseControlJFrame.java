package com.banyuan.view;

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

import com.banyuan.dao.impl.PurchaseControlDaoImpl;
import com.banyuan.entity.Commodity;
import com.banyuan.service.MyThread;
import com.banyuan.util.PurchaseControlBD;

public class PurchaseControlJFrame extends JFrame implements ActionListener {



	private JPanel contentPane;
	private JTable table;
	private JTextField tfNum;
	private JTextField tfperson;
	private JTextField tfCount;
	private JTextField tfgoodsSum;
	private JTextField tfmoneySum;
	private Vector data;
	private Vector colName;
	private DefaultTableModel tm;
	private JTextField tfTime;
	PurchaseControlDaoImpl pc=new PurchaseControlDaoImpl();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PurchaseControlJFrame frame = new PurchaseControlJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
//		PurchaseControlJFrame frame = new PurchaseControlJFrame();
//		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public PurchaseControlJFrame() {
		setTitle("进货单");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 870, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(6, 216, 858, 329);
		contentPane.add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 6, 846, 317);
		panel.add(scrollPane);

//		PurchaseControlBD pcbd = new PurchaseControlBD();
//		data = pcbd.getDBData();
		colName = new Vector();
		colName.add("商品名称");
		colName.add("商品编号");
		colName.add("单位");
		colName.add("单价");
		colName.add("数量");
		colName.add("入库时间");
		colName.add("保质期");
		colName.add("操作员");
		
		tm = new DefaultTableModel(data, colName);

		table = new JTable(data, colName);
		scrollPane.setViewportView(table);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 858, 211);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JLabel label = new JLabel("商品编号");
		label.setBounds(24, 17, 61, 16);
		panel_1.add(label);

		tfNum = new JTextField();
		tfNum.setBounds(97, 12, 130, 26);
		panel_1.add(tfNum);
		tfNum.setColumns(10);

		JLabel label_1 = new JLabel("进货员");
		label_1.setBounds(24, 55, 61, 16);
		panel_1.add(label_1);

		tfperson = new JTextField();
		tfperson.setBounds(97, 50, 130, 26);
		panel_1.add(tfperson);
		tfperson.setColumns(10);

		JLabel label_2 = new JLabel("商品数量");
		label_2.setBounds(308, 17, 61, 16);
		panel_1.add(label_2);

		JLabel label_3 = new JLabel("货品总数");
		label_3.setBounds(308, 54, 61, 16);
		panel_1.add(label_3);

		tfCount = new JTextField();
		tfCount.setBounds(388, 12, 130, 26);
		panel_1.add(tfCount);
		tfCount.setColumns(10);

		tfgoodsSum = new JTextField();
		tfgoodsSum.setBounds(388, 49, 130, 26);
		panel_1.add(tfgoodsSum);
		tfgoodsSum.setColumns(10);

		JLabel label_4 = new JLabel("入库时间");
		label_4.setBounds(597, 17, 61, 16);
		panel_1.add(label_4);

		tfTime = new JTextField();
		tfTime.setBounds(684, 14, 168, 21);
		panel_1.add(tfTime);
		tfTime.setColumns(10);
		MyThread mt = new MyThread(tfTime);
		mt.start();

		JLabel label_5 = new JLabel("合计金额");
		label_5.setBounds(597, 54, 61, 16);
		panel_1.add(label_5);

		tfmoneySum = new JTextField();
		tfmoneySum.setBounds(683, 49, 169, 26);
		panel_1.add(tfmoneySum);
		tfmoneySum.setColumns(10);

		JButton Button_add = new JButton("添加");
		Button_add.addActionListener(this);
		Button_add.setBounds(157, 140, 117, 29);
		panel_1.add(Button_add);

		JButton Button_putin = new JButton("入库");
		Button_putin.addActionListener(this);
		Button_putin.setBounds(355, 140, 117, 29);
		panel_1.add(Button_putin);

		JButton Button_giveup = new JButton("放弃入库");
		Button_giveup.addActionListener(this);
		Button_giveup.setBounds(565, 140, 117, 29);
		panel_1.add(Button_giveup);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 获取按钮信息
		String str = e.getActionCommand();
		System.out.println(str);
//		PurchaseControlBD pcbd = new PurchaseControlBD();

		if ("添加".equals(str)) {
			
 
 String Num = tfNum.getText();
			//通过输入的商品编号，查询该商品的所有信息
			Commodity comm=pc.findCommodity(Num);
			data.add(comm);
			System.out.println(comm);
			tm.setDataVector(data, colName);
	
//			tm.setDataVector(data, colName);
			
			if(comm==null) {
				System.out.println("没有此商品信息");
			}else {
				System.out.println(comm);
			}
		}

			String Num = tfNum.getText();
			String operator = tfperson.getText();
			String count = tfCount.getText();
			String goodsSum = tfgoodsSum.getText();
			String warhousingtime = tfTime.getText();
			String moneySum = tfmoneySum.getText();
			//PurchaseControlBD pcbd = new PurchaseControlBD();
			//这步有错
			//pcbd.insertDBData(Num, operator, count, goodsSum, warhousingtime, moneySum);

			
			
			
			tfNum.setText(" ");
			tfperson.setText("");
			tfCount.setText("");
			tfgoodsSum.setText("");
			tfTime.setText("");
			tfmoneySum.setText("");
//		} else if ("入库".equals(str)) {
//
//		} else if ("放弃入库".equals(str)) {
//
//		}

	}
}
