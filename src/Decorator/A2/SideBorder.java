public class SideBorder extends Border {
    private char borderChar;                        // ����ƂȂ镶��
    public SideBorder(Display display, char ch) {   // �R���X�g���N�^��Display�Ə��蕶�����w��
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       // �������͒��g�̗����ɏ��蕶����������������
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {                          // �s���͒��g�̍s���ɓ���
        return display.getRows();
    }
    public String getRowText(int row) {             // �w��s�̓��e�́A���g�̎w��s�̗����ɏ��蕶������������
        return borderChar + display.getRowText(row) + borderChar;
    }
}
