public class CharDisplay extends AbstractDisplay {  // CharDisplay�́AAbstractDisplay�̃T�u�N���X�B
    private char ch;                                // �\�����ׂ������B
    public CharDisplay(char ch) {                   // �R���X�g���N�^�œn���ꂽ����ch���A
        this.ch = ch;                               // �t�B�[���h�ɋL�����Ă����B
    }
    public void open() {                            // �X�[�p�[�N���X�ł͒��ۃ��\�b�h�������B�����ŃI�[�o�[���C�h���Ď����B
        System.out.print("<<");                     // �J�n������Ƃ���"<<"��\������B
    }
    public void print() {                           // print���\�b�h�������Ŏ�������B���ꂪdisplay����J��Ԃ��ČĂяo�����B
        System.out.print(ch);                       // �t�B�[���h�ɋL�����Ă�����������1�\������B
    }
    public void close() {                           // close���\�b�h�������Ŏ����B
        System.out.println(">>");                   // �I��������">>"��\���B
    }
}
