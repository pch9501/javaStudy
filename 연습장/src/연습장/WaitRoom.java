package 연습장;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class WaitRoom extends JPanel{
	JTable table1, table2;
	DefaultTableModel model1,model2;
	JTextPane tp;
	JTextField tf;
	JButton b1,b2,b3;
	
	WaitRoom(){
		String[] col1= {"방 이름","공개/비공개","인원"};
		String[][] row1=new String[0][3];
		model1=new DefaultTableModel(row1,col1);
		table1=new JTable(model1);
		JScrollPane js1=new JScrollPane(table1);
		
		String[] col2= {"ID","이름","성별","위치"};
		String[][] row2=new String[0][4];
		model2=new DefaultTableModel(row2,col2);
		table2=new JTable(model2);
		JScrollPane js2=new JScrollPane(table2);
		
		setLayout(null);
		js1.setBounds(10, 55, 600, 380);
		js2.setBounds(615, 55, 380, 380);
		
		tp=new JTextPane();
		tf=new JTextField();
		b1=new JButton("방 만들기");
		b2=new JButton("방 들어가기");
		b3=new JButton("게임 나가기");
		
		JScrollPane js3=new JScrollPane(tp);
		js3.setBounds(10, 440, 600, 240); 
		
		tf.setBounds(10, 680, 600, 30);
		add(tf);
		
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p.add(b1);p.add(b2);
		p.add(b3);
		
		p.setBounds(10, 10, 600, 50);
		add(js1);
		add(js2);
		add(js3);
		add(p);
		
	}
}
