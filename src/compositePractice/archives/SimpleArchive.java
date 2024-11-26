package compositePractice.archives;

public class SimpleArchive implements Archive {
    private String name;


    public SimpleArchive(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("-Archive: "+ this.name);
    }
}
