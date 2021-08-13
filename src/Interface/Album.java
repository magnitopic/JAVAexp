package Interface;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private SongList songs;

	public Album(String name, String artist) {
		this.name = name;
		this.artist = artist;
		this.songs = new SongList();
	}

	public boolean addSong(String title, double duration) {
		if (this.songs.findSong(title) == null) {
			Song song = new Song(title, duration);
			return this.songs.add(song);
		}
		return false;
	}

	public boolean addToPlayList(int songNum, LinkedList<Song> playlist) {
		Song checkedSong = this.songs.findSong(songNum);
		if (checkedSong != null) {
			playlist.add(checkedSong);
			return true;
		}
		return false;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		if (this.songs.findSong(title) != null) {
			playlist.add(this.songs.findSong(title));
			return true;
		}
		return false;
	}

	public static class SongList {
		private ArrayList<Song> songs;

		private SongList() {
			this.songs = new ArrayList<>();
		}

		private boolean add(Song song) {
			if (findSong(song.getTitle()) == null) {
				return songs.add(song);
			}
			return false;
		}

		private Song findSong(String title) {
			for (int i = 0; i <= this.songs.size(); i++) {
				if (this.songs.get(i).getTitle().equals(title)) {
					return this.songs.get(i);
				}
			}
			return null;
		}

		private Song findSong(int number) {
			if (songs.get(number) != null) {
				return this.songs.get(number);
			}
			return null;
		}
	}
}
