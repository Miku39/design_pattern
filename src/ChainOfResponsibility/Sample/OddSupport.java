public class OddSupport extends Support {
    public OddSupport(String name) {                // �R���X�g���N�^
        super(name);
    }
    protected boolean resolve(Trouble trouble) {    // �����p���\�b�h
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
