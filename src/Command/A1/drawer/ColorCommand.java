package drawer;

import command.Command;
import java.awt.Color;

public class ColorCommand implements Command {
    // �`��Ώ�
    protected Drawable drawable;
    // �`��F
    private Color color;
    // �R���X�g���N�^
    public ColorCommand(Drawable drawable, Color color) {
        this.drawable = drawable;
        this.color = color;
    }
    // ���s
    public void execute() {
        drawable.setColor(color);
    }
}
