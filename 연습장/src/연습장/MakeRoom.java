package ������;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class MakeRoom extends JDialog{
	JTextField tf1 = new JTextField(10);
	JTextField tf2 = new JTextField(10);
	JButton bt1 = new JButton("�� ����");
	JButton bt2 = new JButton("���");
	
	public MakeRoom(Frame frame, String title) {
		super(frame,title);
		setLayout(new FlowLayout());
		add(tf1); add(tf2);
		add(bt1); add(bt2);
		setSize(480, 320);
		//��ġ ������
		setModal(true);
		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
			}
		});
		
	}
	
}
