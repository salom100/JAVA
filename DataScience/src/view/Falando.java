package view;
import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;



public class Falando {
	public static void main(String[] args) {
		
		
		
	}
	public void relatorio(String descricao){
		VoiceManager maneger = VoiceManager.getInstance();
		Voice voz = maneger.getVoice("kevin16");
		voz.allocate();
		voz.speak(descricao);     
		voz.deallocate();
	}

}

