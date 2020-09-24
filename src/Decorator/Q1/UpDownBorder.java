public class UpDownBorder extends Border {
    private char borderChar; // 飾りとなる文字

    public UpDownBorder(Display display, char ch) { // コンストラクタでDisplayと飾り文字を指定
        super(display);
        this.borderChar = ch;
    }

    public int getColumns() {
        return display.getColumns();
    }

    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    public String getRowText(int row) {
        // TODO: 編集
        // if (row == 0) {
        // return "+" + makeLine('-', display.getColumns()) + "+";
        // } else if (row == display.getRows() + 1) { // 下端の枠
        // return "+" + makeLine('-', display.getColumns()) + "+";
        // } else {
        // return display.getRowText(row - 1);
        // }
    }
}
