package 연습장;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainForm extends JFrame{
	WaitRoom wr = new WaitRoom();
	MakeRoom mr;
	
	public MainForm(){
		
		add(wr);	
		setSize(1024, 768);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mr = new MakeRoom(this, "방 만들기");
		wr.b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				mr.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();
	}

}
