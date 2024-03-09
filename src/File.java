public class File {
    public String filename;
    public String type;
    public Directory parent;
    
    public File(String filename) {
        this.filename = filename;
        this.type = "file";
        this.parent = null;
    }
}
