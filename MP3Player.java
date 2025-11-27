package polymorphismPorblemActivity;

public class MP3Player implements MediaPlayer{
	
	@Override
	public String playAudio() {
		return "MP3Player playing audio.";
	}
	
	@Override
	public String playVideo() {
		return "MP3Player cannot play video.";
	}
}


