package polymorphismPorblemActivity;

public class MP4Player implements MediaPlayer{
	
	@Override
	public String playAudio() {
		return "MP4Player playing audio.";
	}
	
	@Override
	public String playVideo() {
		return "MP4Player playing video.";
	}
}
