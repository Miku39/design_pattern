import java.util.*;

public class MultiStringDisplay extends Display {
    private List<String> stringArray = new ArrayList<>();
    private int columnsLength = 0;

    public void add(String text) {
        if (columnsLength < text.getBytes().length) {
            columnsLength = text.getBytes().length;
        }
        stringArray.add(text);
        updateColumn(text);
    }

    public int getColumns() {
        return columnsLength;
    }

    public int getRows() {
        return stringArray.size();
    }

    public String getRowText(int row) {
        return stringArray.get(row);
    }

    private void updateColumn(String msg) {
        for (int row = 0; row < stringArray.size(); row++) {
            int fills = columnsLength - ((String) stringArray.get(row)).getBytes().length;
            if (fills > 0) {
                stringArray.set(row, stringArray.get(row) + spaces(fills));
            }
        }
    }

    private String spaces(int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(' ');
        }
        return buf.toString();
    }
}
