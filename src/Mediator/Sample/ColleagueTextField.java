import java.awt.TextField;
import java.awt.Color;
import java.awt.event.TextListener;
import java.awt.event.TextEvent;

public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns) {   // �R���X�g���N�^
        super(text, columns);
    }
    public void setMediator(Mediator mediator) {            // Mediator��ێ�
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {      // Mediator����L��/�������w�������
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }
    public void textValueChanged(TextEvent e) {             // �����񂪕ω�������Mediator�ɒʒm
        mediator.colleagueChanged();
    }
}
