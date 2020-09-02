public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState() {                                // �R���X�g���N�^��private
    }
    public static State getInstance() {                 // �B��̃C���X�^���X�𓾂�
        return singleton;
    }
    public void doClock(Context context, int hour) {    // �����ݒ�
        if (hour < 9 || 17 <= hour) {
            context.changeState(NightState.getInstance());
        } else if (12 <= hour && hour < 13) {                   
            context.changeState(NoonState.getInstance());       
        }                                                       
    }
    public void doUse(Context context) {                // ���Ɏg�p
        context.recordLog("���Ɏg�p(����)");
    }
    public void doAlarm(Context context) {              // ���x��
        context.callSecurityCenter("���x��(����)");
    }
    public void doPhone(Context context) {              // �ʏ�ʘb
        context.callSecurityCenter("�ʏ�̒ʘb(����)");
    }
    public String toString() {                          // ������\��
        return "[����]";
    }
}
