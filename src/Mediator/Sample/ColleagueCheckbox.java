import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
    private Mediator mediator;
    public ColleagueCheckbox(String caption, CheckboxGroup group, boolean state) {  // �R���X�g���N�^
        super(caption, group, state);
    }
    public void setMediator(Mediator mediator) {            // Mediator��ێ�
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) {      // Mediator����L��/�������w�������
        setEnabled(enabled);
    }
    public void itemStateChanged(ItemEvent e) {             // ��Ԃ��ω�������Mediator�ɒʒm
        mediator.colleagueChanged();
    }
}
