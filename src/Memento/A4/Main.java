import game.Memento;
import game.Gamer;
import java.io.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";       
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);               // �ŏ��̏�������100
        Memento memento = loadMemento();            // �t�@�C�����烍�[�h   
        if (memento != null) {
            System.out.println("�O��ۑ��������ʂ���X�^�[�g���܂��B");
            gamer.restoreMemento(memento);
        } else {
            System.out.println("�V�K�ɃX�^�[�g���܂��B");
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("==== " + i);        // �񐔕\��
            System.out.println("����:" + gamer);    // ���݂̎�l���̏�ԕ\��

            gamer.bet();    // �Q�[����i�߂�

            System.out.println("��������" + gamer.getMoney() + "�~�ɂȂ�܂����B");

            // Memento�̎�舵���̌���
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    �i�����ԑ������̂ŁA���݂̏�Ԃ�ۑ����Ă������j");
                memento = gamer.createMemento();
                saveMemento(memento);   // �t�@�C���ɕۑ�   
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    �i�����Ԍ������̂ŁA�ȑO�̏�Ԃɕ��A���悤�j");
                gamer.restoreMemento(memento);
            }

            // ���ԑ҂�
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }
    public static void saveMemento(Memento memento) {   
        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
            out.writeObject(memento);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Memento loadMemento() {               
        Memento memento = null;
        try {
            ObjectInput in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
            memento = (Memento)in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return memento;
    }
}
