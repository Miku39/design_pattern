public interface Context {

    public abstract void setClock(int hour);                // �����̐ݒ�
    public abstract void changeState(State state);          // ��ԕω�
    public abstract void callSecurityCenter(String msg);    // �x���Z���^�[�x�����Ăяo��
    public abstract void recordLog(String msg);             // �x���Z���^�[�L�^
}
