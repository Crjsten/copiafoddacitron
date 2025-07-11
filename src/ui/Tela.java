package ui;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Tela extends JFrame {

	public JButton botaoC = new JButton();
	JLabel msg = new JLabel();
	JTextField texto = new JTextField();
	JLabel contador = new JLabel();
	Menu menu = new Menu();
	int i=-1;
	
	public Tela() {
		java.net.URL imgUrl = Tela.class.getResource("../img/icone.png");
		ImageIcon icon = new ImageIcon(imgUrl);
		botao();
		contador();
		caixa();
		setLayout(null);
		setTitle("Retroescavabot");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setIconImage(icon.getImage());
	}
	
	private void botao() {
		botaoC.setBounds(300,410,100,60);
		botaoC.setText("Começar");
		botaoC.addActionListener(menu);
		add(botaoC);
	}
	
	private void contador() {
		contador.setBounds(300,350,100,60);
		add(contador);
		
	}
	
	private void caixa() {
		texto.setBounds(200, 290, 300, 40);
		add(texto);
	}
	
	public JLabel getContador() {
		return contador;
	}
	
	public void addLabel(String mensagem) {
		add(msg);
		msg.setBounds(250,150,300,60);
		msg.setText(mensagem);
	}
	
	public void alteraLabel(String mensagem) {
		msg.setText(mensagem);
	}
}
