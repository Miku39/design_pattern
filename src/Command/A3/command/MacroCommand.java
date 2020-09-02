package command;

import java.util.Stack;
import java.util.Iterator;

public class MacroCommand implements Command {
    // ���߂̏W��
    private Stack commands = new Stack();
    // ���s
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
    // �ǉ�
    public void append(Command cmd) {
        if (cmd != this) {
            commands.push(cmd);
        }
    }
    // �Ō�̖��߂��폜
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }
    // �S���폜
    public void clear() {
        commands.clear();
    }
}
