import java.util.HashMap;

public class BigCharFactory {
    // ���łɍ����BigChar�̃C���X�^���X���Ǘ�
    private HashMap pool = new HashMap();
    // Singleton�p�^�[��
    private static BigCharFactory singleton = new BigCharFactory();
    // �R���X�g���N�^
    private BigCharFactory() {
    }
    // �B��̃C���X�^���X�𓾂�
    public static BigCharFactory getInstance() {
        return singleton;
    }
    // BigChar�̃C���X�^���X����(���L)
    public synchronized BigChar getBigChar(char charname) {
        BigChar bc = (BigChar)pool.get("" + charname);
        if (bc == null) {
            bc = new BigChar(charname); // ������BigChar�̃C���X�^���X�𐶐�
            pool.put("" + charname, bc);
        }
        return bc;
    }
}
