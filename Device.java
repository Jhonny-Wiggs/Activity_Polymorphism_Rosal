package polymorphismPorblemActivity;

public class Device {
	
	private MediaPlayer mediaPlayer;
	
	public Device(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	
	public String  playAudio() {
		return mediaPlayer.playAudio();
	}
	
	public String  playVideo() {
		return mediaPlayer.playVideo();
	}
}
