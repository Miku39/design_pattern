public class LimitSupport extends Support {
    private int limit;                              // ���̔ԍ������Ȃ�����ł���
    public LimitSupport(String name, int limit) {   // �R���X�g���N�^
        super(name);
        this.limit = limit;
    }
    protected boolean resolve(Trouble trouble) {         // �����p���\�b�h
        if (trouble.getNumber() < limit) {
            return true;
        } else {
            return false;
        }
    }
}
