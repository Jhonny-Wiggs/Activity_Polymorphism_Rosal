package polymorphismPorblemActivity;

public class MP4Player implements MediaPlayer{
	
	@Override
	public void playAudio() {
		System.out.print("MP4Player playing audio.");
	}
	
	@Override
	public void playVideo() {
		System.out.print("MP4Player playing audio.");
	}
}

