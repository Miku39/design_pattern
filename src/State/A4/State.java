public interface State {
    public abstract void doClock(Context context, int hour);    // �����ݒ�
    public abstract void doUse(Context context);                // ���Ɏg�p
    public abstract void doAlarm(Context context);              // ���x��
    public abstract void doPhone(Context context);              // �ʏ�ʘb
}
