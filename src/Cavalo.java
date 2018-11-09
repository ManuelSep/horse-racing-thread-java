import javax.swing.JTextField;

public class Cavalo extends Thread {
	private int state = 30;
	private JTextField text;
	public Cavalo(JTextField text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}

	@Override
	public void run() {
		try {
			for (int i = state ; i > 0; i--) {
				text.setText(Integer.toString(i));
				double rand = Math.random();
				int dorme =(int)((rand + 1)*1000);
				Thread.sleep(dorme);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
