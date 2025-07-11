package retroescavabot;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Robo {
	
	JFrame cara = new JFrame();
	private int i = -1;

	public void funfa(int tempo) {
		Timer timer = new Timer();
		TimerTask popup = new TimerTask() {
			@Override
			public void run() {
				Musica.tocar();
				timer.cancel();
			}
		};
		timer.scheduleAtFixedRate(new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				i++;
				Main.tela.getContador().setText(converteTempo(tempo-i));
				if(tempo-i<=0) {
					timer.cancel();
					popup.run();
				}
			}
			
		}, 0, 1000);
		i=-1;
	}
	
	private String converteTempo(int tempo) {
		
		int minutos = tempo/60;
		int segundos = tempo%60;
		
		return String.format("%02d:%02d", minutos, segundos);
	}
}
