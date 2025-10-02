package polymorphismPorblemActivity;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"     Adrian Louis C. Rosal\n" + 
										   "                BSIT - 2B\n" +
										   "             IT - OOPROG\n");
		
		MediaPlayer mp3 = new MP3Player();
		MediaPlayer mp4 = new MP4Player();
		Device d1 = new Device(new MP3Player());
		Device d2 = new Device(new MP4Player());
		
		String output = "  'POLYMORPHISM ACTIVITY'\n\n" + 
						"'SAMPLE OUTPUT 1'\n" + "Output:\n" + mp3.playAudio() + "\n" + mp3.playVideo() +
						"\n\n'SAMPLE OUTPUT 2'\n" + "Output:\n" + mp4.playAudio() + "\n" + mp4.playVideo() +
						"\n\n'SAMPLE OUTPUT 3'\n" + "Output:\n" + d1.playAudio() + "\n" + d1.playVideo() +  "\n" + d2.playAudio() + "\n" + d2.playVideo() + "\n\n";
		JOptionPane.showMessageDialog(null, output);
	}
}
