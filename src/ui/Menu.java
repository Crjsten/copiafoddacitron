package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import retroescavabot.Main;
import retroescavabot.Robo;

public class Menu implements ActionListener{
	
	int tempo;
	Robo robo = new Robo();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(Main.tela.botaoC.getText().equals("Começar")) {
			comecaRobo(Main.tela.texto.getText());
			return;
		}
		
		if(Main.tela.botaoC.getText().equals("Continuar")) {
			comecaRobo(Main.tela.contador.getText());
			return;
		}
		if(robo.i>-1) Main.tela.botaoC.setText("Continuar");
		robo.timer.cancel();
		robo = new Robo();
	}
	
	private void comecaRobo(String textoCaixa) {
		robo = new Robo();
		Main.tela.botaoC.setText("Pausar");
		String[] tempoTexto = textoCaixa.split(":");
		try {
			tempo = Integer.parseInt(tempoTexto[0])*60;
			if(tempoTexto.length>1) tempo+= Integer.parseInt(tempoTexto[1]);
			Main.tela.alteraLabel("bom garoto");
			robo.funfa(tempo);
		} catch (Exception e2) {
			Main.tela.botaoC.setText("Começar");
			Main.tela.addLabel("ESCREVE UM TEMPO DIREITO DOENTE");
		}
	}

}
