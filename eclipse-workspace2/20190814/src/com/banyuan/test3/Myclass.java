package com.banyuan.test3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Myclass extends JFrame implements ActionListener{
//	private String title;
//	public void setTitle(String title) {
//		this.title=title;
//	}
	private JLabel name;
	public Myclass() {

        super();
//		super.setSize(300,200);
//		this.setSize(300, 200);
//		super(title);
		setSize(300, 300);
//		FlowLayout out = new FlowLayout();
//		LayoutManager manger = out;
		this.setLayout(new FlowLayout());
		
	    name=new JLabel("zhangsan");
		JButton button=new JButton("click");
//		ActionListener listener=new Myclass();
//		button.addActionListener(new Myclass());
		button.addActionListener(this);
		this.add(name);
		this.add(button);
		this.setVisible(true);
		this.setLocation(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("全世界最帅");
		name.setText("肖战");
	}


}
