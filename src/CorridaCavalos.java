import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class CorridaCavalos {

	private JFrame frame;
	private String name;
	public CorridaCavalos(String name) {
		this.name = name;
		frame = new JFrame(name);
		
		// para que o botao de fechar a janela termine a aplicacao
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		addFrameContent();
		
		// para que a janela se redimensione de forma a ter todo o seu conteudo visivel
		frame.pack();
	}

	public void open(int width, int height) {
		frame.setSize(width, height);
		// para abrir a janela (torna-la visivel)
		frame.setVisible(true);
	}
	
	private void addFrameContent() {
		
		
		/* para organizar o conteudo em grelha (linhas x colunas)
		se um dos valores for zero, o numero de linhas ou colunas (respetivamente) fica indefinido,
		e estas sao acrescentadas automaticamente */
		frame.setLayout(new GridLayout(0,3));

		JTextField text1 = new JTextField("cavalo1");
		frame.add(text1);
		Cavalo cavalo1 = new Cavalo(text1);
			
		JTextField text2 = new JTextField("cavalo2");
		frame.add(text2);
		Cavalo cavalo2 = new Cavalo(text2); 
			
		JTextField text3 = new JTextField("cavalo3");
		frame.add(text3);
		Cavalo cavalo3 = new Cavalo(text3);
		
		JButton button = new JButton("Inicia");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cavalo1.start();
				cavalo2.start();
				cavalo3.start();
			}
		});
		frame.add(button);	
	}
	
	public static void main(String[] args) {
		CorridaCavalos window = new CorridaCavalos("Corrida");
		
		
		window.open(300, 150);
	}
}
