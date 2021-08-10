package javaExp;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new ArrayList<>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			Song song = new Song(title, duration);
			return this.songs.add(song);
		}
		return false;
	}

	private Song findSong(String title) {
		for (int i = 0; i < songs.size(); i++) {
			if (songs.get(i).getTitle() == title) {
				return songs.get(i);
			}
		}
		return null;
	}

	public boolean addToPlayList(int songNum, LinkedList<Song> playlist) {
		if ((songNum > 0) && (songNum <= this.songs.size())) {
			return playlist.add(this.songs.get(songNum - 1));
		}
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		if (findSong(title) != null) {
			playlist.add(findSong(title));
			return true;
		}
		return false;
	}
}
