public class Trouble {
    private int number;             // �g���u���ԍ�
    public Trouble(int number) {    // �g���u���̐���
        this.number = number;
    }
    public int getNumber() {        // �g���u���ԍ��𓾂�
        return number;
    }
    public String toString() {      // �g���u���̕�����\��
        return "[Trouble " + number + "]";
    }
}
