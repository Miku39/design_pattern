public class TextBuilder extends Builder {
    private String buffer = "";                                 // ���̃t�B�[���h�ɕ������\�z���Ă���
    public void makeTitle(String title) {                       // �v���[���e�L�X�g�ł̃^�C�g��
        buffer += "==============================\n";               // �����
        buffer += "�w" + title + "�x\n";                            // �w�x���̃^�C�g��
        buffer += "\n";                                             // ��s
    }
    public void makeString(String str) {                        // �v���[���e�L�X�g�ł̕�����
        buffer += '��' + str + "\n";                                // �����̕�����
        buffer += "\n";                                             // ��s
    }
    public void makeItems(String[] items) {                     // �v���[���e�L�X�g�ł̉ӏ�����
        for (int i = 0; i < items.length; i++) {
            buffer += "�@�E" + items[i] + "\n";                     // �E���̍���
        }
        buffer += "\n";                                             // ��s
    }
    public void close() {                                       // �����̊���
        buffer += "==============================\n";               // �����
    }
    public String getResult() {                                 // ������������
        return buffer;
    }
}
