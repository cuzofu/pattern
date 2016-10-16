package com.cuzofu.pattern.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new Mp4Player();
		} else {
			advancedMusicPlayer = null;
		}
	}

	public void play(String audioType, String fileName) {
		if (advancedMusicPlayer == null) {
			System.out.println("空对象");
		}
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		} else {
			System.out.println("对象类型不明");
		}
	}

}
