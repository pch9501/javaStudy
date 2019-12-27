import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
 * 	JFrame
 * 	JPanel
 * 	JWindow
 * 	JDialog
 * 
 */
import java.awt.*; // window와 관련된 클래스
public class Login extends JPanel{
	Image back;
	// Login login=new Login()
	JLabel la1,la2;
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2;
	Login()
	{
		setLayout(null);
		back=Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg");
		la1=new JLabel("ID",JLabel.RIGHT);
		la1.setForeground(Color.pink);
		la2=new JLabel("Password",JLabel.RIGHT);
		la2.setForeground(Color.pink);
		
		tf=new JTextField();
		pf=new JPasswordField();
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		
		// 배치
		la1.setBounds(390,330,80,30);
		tf.setBounds(475, 330, 150, 30);
		
		la2.setBounds(390,365,80,30);
		pf.setBounds(475, 365, 150, 30);
		
		JPanel p=new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(390, 405, 235, 35);
		p.setOpaque(false);
		add(la1);
		add(tf);
		add(la2);
		add(pf);
		add(p);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
	}
	
}
