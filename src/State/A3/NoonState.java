public class NoonState implements State {
    private static NoonState singleton = new NoonState();
    private NoonState() {                                // �R���X�g���N�^��private
    }
    public static State getInstance() {                 // �B��̃C���X�^���X�𓾂�
        return singleton;
    }
    public void doClock(Context context, int hour) {    // �����ݒ�     
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (9 <= hour && hour < 12 || 13 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context) {                // ���Ɏg�p
        context.callSecurityCenter("���F���H���̋��Ɏg�p�I");
    }
    public void doAlarm(Context context) {              // ���x��
        context.callSecurityCenter("���x��(���H��)");
    }
    public void doPhone(Context context) {              // �ʏ�ʘb
        context.recordLog("���H���̒ʘb�^��");
    }
    public String toString() {                          // ������\��
        return "[���H��]";
    }
}
