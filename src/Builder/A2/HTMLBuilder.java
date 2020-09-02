import java.io.*;

public class HTMLBuilder extends Builder {
    private String filename;                                    // �쐬����t�@�C����
    private PrintWriter writer;                                 // �t�@�C���ɏ�������PrintWriter
    protected void buildTitle(String title) {                       // HTML�t�@�C���ł̃^�C�g��
        filename = title + ".html";                                 // �^�C�g�������Ƀt�@�C��������
        try {
            writer = new PrintWriter(new FileWriter(filename));     // PrintWriter�����
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");    // �^�C�g�����o��
        writer.println("<h1>" + title + "</h1>");
    }
    protected void buildString(String str) {                        // HTML�t�@�C���ł̕�����
        writer.println("<p>" + str + "</p>");                       // <p>�^�O�ŏo��
    }
    protected void buildItems(String[] items) {                     // HTML�t�@�C���ł̉ӏ�����
        writer.println("<ul>");                                     // <ul>��<li>�ŏo��
        for (int i = 0; i < items.length; i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }
    protected void buildDone() {                                 // �����̊���
        writer.println("</body></html>");                           // �^�O�����
        writer.close();                                             // �t�@�C�����N���[�Y
    }
    public String getResult() {
        return filename;                                            // �t�@�C������Ԃ�
    }
}
