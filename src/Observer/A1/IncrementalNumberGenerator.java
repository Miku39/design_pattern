public class IncrementalNumberGenerator extends NumberGenerator {
    private int number;                     // ���݂̐�
    private int end;                        // �I���l(���̒l���܂܂Ȃ�)
    private int inc;                        // ������
    public IncrementalNumberGenerator(int start, int end, int inc) {
        this.number = start;
        this.end = end;
        this.inc = inc;
    }
    public int getNumber() {                // �����擾����
        return number;
    }
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += inc;
        }
    }
}
