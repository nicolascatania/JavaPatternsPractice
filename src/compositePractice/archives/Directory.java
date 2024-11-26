package compositePractice.archives;

import java.util.ArrayList;

public class Directory implements  Archive{

    private final String name;
    private ArrayList<Archive> archives = new ArrayList<>();

    public Directory(String name){
        this.name = name;
    }

    public void addArchive(Archive archive){
        archives.add(archive);
    }

    public void deleteArchive(Archive archive){
        archives.remove(archive);
    }

    @Override
    public void show() {
        System.out.println("+Directory: " + name);
        for (Archive a : archives) {
            a.show();
        }
    }
}
