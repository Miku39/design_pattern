public class UpDownBorder extends Border {
    private char borderChar;                        // ����ƂȂ镶��
    public UpDownBorder(Display display, char ch) {   // �R���X�g���N�^��Display�Ə��蕶�����w��
        super(display);
        this.borderChar = ch;
    }
    public int getColumns() {                       // �������͒��g�̕������ɓ���
        return display.getColumns();
    }
    public int getRows() {                          // �s���͒��g�̏㉺�ɏ��蕶����������������
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {             // �w��s�̓��e
        if (row == 0 || row == getRows() - 1) {
            return makeLine(borderChar, getColumns());
        } else {
            return display.getRowText(row - 1);
        }
    }
    private String makeLine(char ch, int count) { // ����ch��count�A������������������
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
