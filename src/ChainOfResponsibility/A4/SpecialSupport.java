public class SpecialSupport extends Support {
    private int number;                                 // ���̔ԍ����������ł���
    public SpecialSupport(String name, int number) {    // �R���X�g���N�^
        super(name);
        this.number = number;
    }
    protected boolean resolve(Trouble trouble) {     // �����p���\�b�h
        if (trouble.getNumber() == number) {
            return true;
        } else {
            return false;
        }
    }
}
