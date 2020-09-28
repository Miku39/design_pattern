import java.util.*;

public class FileFindVisitor extends Visitor {
    private String fileType;
    private List fileList = new ArrayList();

    public FileFindVisitor(String fileType) {
        this.fileType = fileType;
    }

    public Iterator getFoundFiles() {
        return fileList.iterator();
    }

    public void visit(File file) {
        if (file.getName().endsWith(fileType)) {
            fileList.add(file);
        }
    }

    public void visit(Directory directory) {
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.accept(this);
        }
    }
}
