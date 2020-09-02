package game;
import java.util.*;

public class Gamer {
    private int money;                          // ������
    private List fruits = new ArrayList();      // �t���[�c
    private Random random = new Random();       // ����������
    private static String[] fruitsname = {      // �t���[�c���̕\
        "�����S", "�Ԃǂ�", "�o�i�i", "�݂���",
    };
    public Gamer(int money) {                   // �R���X�g���N�^
        this.money = money;
    }
    public int getMoney() {                     // ���݂̏������𓾂�
        return money;
    }
    public void bet() {                         // �q����c�Q�[���̐i�s
        int dice = random.nextInt(6) + 1;           // �T�C�R����U��
        if (dice == 1) {                            // 1�̖ځc��������������
            money += 100;
            System.out.println("�������������܂����B");
        } else if (dice == 2) {                     // 2�̖ځc�������������ɂȂ�
            money /= 2;
            System.out.println("�������������ɂȂ�܂����B");
        } else if (dice == 6) {                     // 6�̖ځc�t���[�c�����炤
            String f = getFruit();
            System.out.println("�t���[�c(" + f + ")�����炢�܂����B");
            fruits.add(f);
        } else {                                    // ����ȊO�c�����N���Ȃ�
            System.out.println("�����N����܂���ł����B");
        }
    }
    public Memento createMemento() {                // �X�i�b�v�V���b�g���Ƃ�
        Memento m = new Memento(money);
        Iterator it = fruits.iterator();
        while (it.hasNext()) {
            String f = (String)it.next();
            if (f.startsWith("��������")) {         // �t���[�c�͂����������̂����ۑ�
                m.addFruit(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento) {   // �A���h�D���s��
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }
    public String toString() {                      // ������\��
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
    private String getFruit() {                     // �t���[�c��1����
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "��������";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }
}
