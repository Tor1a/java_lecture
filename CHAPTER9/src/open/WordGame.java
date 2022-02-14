package open;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class NorthPanel extends JPanel{
	public NorthPanel() {
		this.setBackground(Color.GRAY);
		this.setOpaque(true);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		this.add(new JButton("open"));
		this.add(new JButton("read"));
		this.add(new JButton("close"));
	}
}
class CenterPanel extends JPanel{
	public CenterPanel() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setOpaque(true);
		this.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
		
		JLabel label01 = new JLabel("Hello");
		label01.setBounds(50,50,100,20);
		
		JLabel label02 = new JLabel("Love");
		label01.setBounds(10,120,100,20);
		
		JLabel label03 = new JLabel("Java");
		label01.setBounds(150,180,100,20);
		this.add(label01);
		this.add(label02);
		this.add(label03);
	}
}

public class WordGame extends JFrame{
	
		   public WordGame() {
		      this.setTitle("GridLayout");
		      this.setSize(300,400);
		      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      this.setLocationRelativeTo(null);

		      Container contentPane = this.getContentPane(); 
		      contentPane.setLayout(new BorderLayout());
		      contentPane.add(new NorthPanel(), BorderLayout.NORTH);
		      contentPane.add(new CenterPanel(), BorderLayout.CENTER);
		    
		      
		      this.setVisible(true); // �ٸ� Container �Ǵ� Component�� ���� �ε��ϰ� �������� ���̰� �ϱ� ���ؼ� �Ʒ��ʿ� ����δ°� ����.
		   }
	
	public static void main(String[] args) {
		new WordGame();
	}
}
