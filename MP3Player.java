package polymorphismPorblemActivity;

public class MP3Player implements MediaPlayer{
	
	@Override
	public void playAudio() {
		System.out.print("MP3Player playing audio.");
	}
	
	@Override
	public void playVideo() {
		System.out.print("MP3Player cannot play audio.");
	}
}

