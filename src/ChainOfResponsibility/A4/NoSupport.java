public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }
    protected boolean resolve(Trouble trouble) {     // �����p���\�b�h
        return false; // �����͉����������Ȃ�
    }
}
