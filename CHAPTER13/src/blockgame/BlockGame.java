package blockgame;

import java.awt.Container;

import javax.swing.JFrame;

public class BlockGame extends JFrame {
	public BlockGame() {
		// 생성자...
		this.setTitle("벽돌깨기");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GamePanel gamePanel  = new GamePanel();
		Container contentPane = this.getContentPane();
		contentPane.add(gamePanel);
		//this.setSize(GamePanel.GAME_WIDTH,GamePanel.GAME_HEIGHT);
		this.setVisible(true);
		this.pack();
	}
	public static void main(String[] args) {
		new BlockGame();
	}
}
