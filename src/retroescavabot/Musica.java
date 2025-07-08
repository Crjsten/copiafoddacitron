package retroescavabot;

import java.io.File;
import java.util.concurrent.ThreadLocalRandom;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Musica {
	
	public static void tocar() {
		try {
			File pasta = new File("./son");
			File[] lista = pasta.listFiles();
			int randomNum = ThreadLocalRandom.current().nextInt(0,lista.length);
			String caminho = "/son/" + lista[randomNum].getName();
			AudioInputStream aui = AudioSystem.getAudioInputStream(Musica.class.getResource(caminho));
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(aui);
				clip.start();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}catch(Exception e) {
			
		}

	}
}