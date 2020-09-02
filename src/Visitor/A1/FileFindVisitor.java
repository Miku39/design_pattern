import java.util.Iterator;
import java.util.ArrayList;

public class FileFindVisitor extends Visitor {
    private String filetype;
    private ArrayList found = new ArrayList();
    public FileFindVisitor(String filetype) {           // ".txt"�̂悤�Ɋg���q��.�t���Ŏw��
        this.filetype = filetype;
    }
    public Iterator getFoundFiles() {                   // ���������t�@�C���𓾂�
        return found.iterator();
    }
    public void visit(File file) {                  // �t�@�C����K�₵���Ƃ��ɌĂ΂��
        if (file.getName().endsWith(filetype)) {
            found.add(file);
        }
    }
    public void visit(Directory directory) {   // �f�B���N�g����K�₵���Ƃ��ɌĂ΂��
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
    }
}
