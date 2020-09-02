public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState() {                              // �R���X�g���N�^��private
    }
    public static State getInstance() {                 // �B��̃C���X�^���X�𓾂�
        return singleton;
    }
    public void doClock(Context context, int hour) {    // �����ݒ�
        if (9 <= hour && hour < 17) {
            context.changeState(DayState.getInstance());
        } else if (12 <= hour && hour < 13) {                   
            context.changeState(NoonState.getInstance());       
        }                                                       
    }
    public void doUse(Context context) {                // ���Ɏg�p
        context.callSecurityCenter("���F��Ԃ̋��Ɏg�p�I");
    }
    public void doAlarm(Context context) {              // ���x��
        context.callSecurityCenter("���x��(���)");
    }
    public void doPhone(Context context) {              // �ʏ�ʘb
        context.recordLog("��Ԃ̒ʘb�^��");
    }
    public String toString() {                          // ������\��
        return "[���]";
    }
}
