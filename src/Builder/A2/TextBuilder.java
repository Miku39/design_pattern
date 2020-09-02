public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();           // ���̃t�B�[���h�ɕ������\�z���Ă���
    protected void buildTitle(String title) {                       // �v���[���e�L�X�g�ł̃^�C�g��
        buffer.append("==============================\n");          // �����
        buffer.append("�w" + title + "�x\n");                       // �w�x���̃^�C�g��
        buffer.append("\n");                                        // ��s
    }
    protected void buildString(String str) {                        // �v���[���e�L�X�g�ł̕�����
        buffer.append('��' + str + "\n");                           // �����̕�����
        buffer.append("\n");                                        // ��s
    }
    protected void buildItems(String[] items) {                     // �v���[���e�L�X�g�ł̉ӏ�����
        for (int i = 0; i < items.length; i++) {
            buffer.append("�@�E" + items[i] + "\n");                // �E���̍���
        }
        buffer.append("\n");                                        // ��s
    }
    protected void buildDone() {                                 // �����̊���
        buffer.append("==============================\n");          // �����
    }
    public String getResult() {
        return buffer.toString();                                   // StringBuffer��String�ɕϊ�
    }
}
