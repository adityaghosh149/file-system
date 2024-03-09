import java.util.ArrayList;
import java.util.List;

public class Directory {
    public String directoryName;
    public Directory parent;
    public Directory current;
    public String type;
    public List<File> files;
    public List<Directory> directories;
    
    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.type = "directory";
        this.parent = null;
        this.current = null;
        this.files = new ArrayList<>();
        this.directories = new ArrayList<>();;
    }

    public Directory(String directoryName, Directory parent) {
        this.directoryName = directoryName;
        this.type = "directory";
        this.parent = parent;
        this.current = null;
        this.files = new ArrayList<>();
        this.directories = new ArrayList<>();;
    }
}
