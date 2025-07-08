package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import retroescavabot.Main;
import retroescavabot.Robo;

public class Menu implements ActionListener{
	
	int tempo;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Robo robo = new Robo();
		String textoCaixa = Main.tela.texto.getText();
		int numeroTexto = 0;
		try {
			numeroTexto = Integer.parseInt(textoCaixa);
			tempo = numeroTexto;
			Main.tela.alteraLabel();
			robo.funfa(tempo);
		} catch (Exception e2) {
			Main.tela.addLabel("ESCREVE UM NUMERO INTEIRO DOENTE");
		}
	}

}
