public class StringDisplay extends Display {
    private String string;                          // �\��������
    public StringDisplay(String string) {           // �����ŕ\����������w��
        this.string = string;
    }
    public int getColumns() {                       // ������
        return string.getBytes().length;
    }
    public int getRows() {                          // �s����1
        return 1;
    }
    public String getRowText(int row) {             // row��0�̂Ƃ��̂ݕԂ�
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
