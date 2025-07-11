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
		String[] tempoTexto = textoCaixa.split(":");
		try {
			tempo = Integer.parseInt(tempoTexto[0])*60;
			if(tempoTexto.length>1) tempo+= Integer.parseInt(tempoTexto[1]);
			Main.tela.alteraLabel("bom garoto");
			robo.funfa(tempo);
		} catch (Exception e2) {
			Main.tela.addLabel("ESCREVE UM TEMPO DIREITO DOENTE");
		}
	}

}
