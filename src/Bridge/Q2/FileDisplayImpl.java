import java.io.*;

public class FileDisplayImpl extends DisplayImpl {
    private String fileName;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096; // 繰り返し表示させられる上限（バッファサイズ）

    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }

    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(fileName));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-= " + fileName + " =-=-=-=-=-="); // 飾り枠
    }

    public void rawPrint() {
        try {
            String line;
            reader.reset(); // markした位置まで巻き戻す
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void rawClose() {
        System.out.println("=-=-=-=-=-= "); // 飾り枠
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
