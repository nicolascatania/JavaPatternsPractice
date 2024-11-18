package iteratorPractice.songPlaylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist implements Iterable<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator<Song> iterator() {
        return new SequentialIterator(songs);
    }

    public Iterator<Song> createSequentialIterator() {
        return new SequentialIterator(songs);
    }

    public Iterator<Song> createRandomIterator() {
        return new RandomIterator(new ArrayList<>(songs));
    }

    public Iterator<Song> createGenreIterator(String genre) {
        return new GenreIterator(songs, genre);
    }
}
