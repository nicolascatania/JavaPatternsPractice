package iteratorPractice.songPlaylist;

import java.util.Iterator;

public class MainSongs {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song(1,"Song 1", "Rock"));
        playlist.addSong(new Song(2,"Song 2", "Pop"));
        playlist.addSong(new Song(3,"Song 3", "Rock"));
        playlist.addSong(new Song(4,"Song 4", "Jazz"));
        playlist.addSong(new Song(5,"Song 5", "Rock"));

        System.out.println("Sequential Iteration:");
        for (Song song : playlist) {
            System.out.println(song);
        }

        System.out.println("\nRandom Iteration:");
        Iterator<Song> randomIterator = playlist.createRandomIterator();
        while (randomIterator.hasNext()) {
            System.out.println(randomIterator.next());
        }

        System.out.println("\nGenre Iteration (Rock):");
        Iterator<Song> genreIterator = playlist.createGenreIterator("Rock");
        while (genreIterator.hasNext()) {
            System.out.println(genreIterator.next());
        }
    }
}
