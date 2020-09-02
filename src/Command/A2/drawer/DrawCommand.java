package drawer;

import command.Command;
import java.awt.Point;

public class DrawCommand implements Command {
    // �`��Ώ�
    protected Drawable drawable;
    // �`��ʒu
    private Point position;
    // �R���X�g���N�^
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }
    // ���s
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
