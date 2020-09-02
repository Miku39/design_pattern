import java.util.ArrayList;

public class MultiStringDisplay extends Display {
    private ArrayList body = new ArrayList();             // �\��������
    private int columns = 0;                        // �ő啶����
    public void add(String msg) {                   // ������ǉ�
        body.add(msg);
        updateColumn(msg);
    }
    public int getColumns() {                       // ������
        return columns;
    }
    public int getRows() {                          // �s��
        return body.size();
    }
    public String getRowText(int row) {             // �s�̓��e
        return (String)body.get(row);
    }
    private void updateColumn(String msg) {         // ���������X�V����
        if (msg.getBytes().length > columns) {
            columns = msg.getBytes().length;
        }
        for (int row = 0; row < body.size(); row++) {
            int fills = columns - ((String)body.get(row)).getBytes().length;
            if (fills > 0) {
                body.set(row, body.get(row) + spaces(fills));
            }
        }
    }
    private String spaces(int count) {              // �󔒍쐬
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
