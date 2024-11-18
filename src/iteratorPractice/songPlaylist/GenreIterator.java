package iteratorPractice.songPlaylist;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class GenreIterator implements Iterator<Song> {
    private List<Song> filteredSongs;
    private int position = 0;

    public GenreIterator(List<Song> songs, String genre) {
        this.filteredSongs = songs.stream()
                .filter(song -> song.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    @Override
    public boolean hasNext() {
        return position < filteredSongs.size();
    }

    @Override
    public Song next() {
        return filteredSongs.get(position++);
    }
}
