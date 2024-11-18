package iteratorPractice.songPlaylist;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RandomIterator implements Iterator<Song> {
    private List<Song> songs;
    private int position = 0;

    public RandomIterator(List<Song> songs) {
        this.songs = songs;
        Collections.shuffle(this.songs);
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        return songs.get(position++);
    }
}
