package iteratorPractice.songPlaylist;

import java.util.Objects;

public class Song {
    private final int id;
    private final String title;
    private final String genre;

    public Song(int id, String title, String genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id && Objects.equals(title, song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre);
    }
}
