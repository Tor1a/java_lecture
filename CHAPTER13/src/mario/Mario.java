package mario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
class GamePanel extends JPanel implements Runnable {
	private Thread th;
	private Image bg = new ImageIcon("images/bg.jpg").getImage();
	private Image mario = new ImageIcon("images/super-mario.png").getImage();
	private Image mushroom = new ImageIcon("images/mushroom.png").getImage();
	private int marioX = 200;
	private int marioY = 200;
	private int mushX = 400;
	private int mushY = 400;
	private int score = 0;
	private boolean up,down,left,right;
	public GamePanel() {
		this.setPreferredSize(new Dimension(800,600));
		this.setFocusable(true);
		this.requestFocus();
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {
				switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT:
						left = false;
						break;
					case KeyEvent.VK_RIGHT:
						right = false;
						break;
					case KeyEvent.VK_UP:
						up = false;
						break;
					case KeyEvent.VK_DOWN:
						down = false;
						break;
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				//System.out.println(e.getKeyCode());
				switch(e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					left = true;
					break;
				case KeyEvent.VK_RIGHT:
					right = true;
					break;
				case KeyEvent.VK_UP:
					up = true;
					break;
				case KeyEvent.VK_DOWN:
					down = true;
					break;
				}
			}
		});
		
		th = new Thread(this);
		th.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(bg, 0,0, null);
		g.drawImage(mario, marioX, marioY, null);
		g.drawImage(mushroom, mushX, mushY, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("맑은 고딕",Font.BOLD,24));
		g.drawString("SCORE : "+score, 50, 50);
	}
	
	private void marioMove() {
		if(left) {
			marioX-=5;
			if(marioX<-50) {
				marioX = 800;
			}
			//System.out.println("marioX좌표는 "+marioX);
		} 
		if(right) {
			marioX+=5;
			if(marioX > 800) {
				marioX = -50;
			}
			//System.out.println("marioX좌표는 "+marioX);
		} 
		if(up) {
			marioY-=5;
			if(marioY<-50) {
				marioY = 600;
			}
			//System.out.println("marioX좌표는 "+marioY);
		} 
		if(down) {
			marioY+=5;
			if(marioY>600) {
				marioY = -50;
			}
			//System.out.println("marioX좌표는 "+marioY);
		} 
		repaint();
	}
	private void hitMushroom() {
		//충돌을 판별... 피타고라스의 정리를 이용해봅시다.
		double distX = marioX - mushX;
		double distY = marioY - mushY;
		double distance = Math.sqrt(distX*distX + distY*distY);
		if(distance<20) {
			//System.out.println("충돌");
			mushX = (int)(Math.random()*700) + 50;   // 50  <=   mushX      <= 750
			mushY = (int)(Math.random()*500) + 50;
			score+=10;
			//System.out.println(mushX+"==="+mushY);
		}
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//System.out.println("주구장창");
			marioMove();
			hitMushroom();
		}
	}
}
public class Mario extends JFrame {
	public Mario() {
		this.setTitle("MARIO GO GO GO");
		this.setSize(800,600);
		this.setResizable(false);
		this.setLocationRelativeTo(null); // 화면 가운데 띄우기...
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new GamePanel());// 원래 있던 Container를 GamePanel로 바꿈...
		this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		new Mario();
	}
}









