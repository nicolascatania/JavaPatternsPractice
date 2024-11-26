package compositePractice.archives;

public class archMain {
    public static void main(String[] args) {
        SimpleArchive a1 = new SimpleArchive("helloWorld.c");
        SimpleArchive a2 = new SimpleArchive("helloWorld.py");
        SimpleArchive a3 = new SimpleArchive("finances.csv");
        SimpleArchive a4 = new SimpleArchive("finances.py");
        SimpleArchive a5 = new SimpleArchive("songs.txt");
        Directory programming = new Directory("programming");
        Directory songs = new Directory("songs");
        Directory finances = new Directory("finances");
        Directory general = new Directory("general");

        general.addArchive(finances);
        general.addArchive(programming);
        general.addArchive(songs);

        songs.addArchive(a5);
        finances.addArchive(a4);
        finances.addArchive(a3);
        programming.addArchive(a1);
        programming.addArchive(a2);

        general.show();

    }
}
