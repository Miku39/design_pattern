import java.io.*;

public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private BufferedReader reader;
    private final int MAX_READAHEAD_LIMIT = 4096;   // �J��Ԃ��\�������������i�o�b�t�@�T�C�Y�j
    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READAHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=-=-=-=-=-= " + filename + " =-=-=-=-=-="); // ����g
    }
    public void rawPrint() {
        try {
            String line;
            reader.reset(); // mark�����ʒu�܂Ŋ����߂�
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void rawClose() {
        System.out.println("=-=-=-=-=-= "); // ����g
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
