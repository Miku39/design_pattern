package game;
import java.util.*;

public class Memento {
    int money;                              // ������
    ArrayList fruits;                       // �t���[�c
    public int getMoney() {                 // �������𓾂�(narrow interface)
        return money;
    }
    Memento(int money) {                    // �R���X�g���N�^(wide interface)
        this.money = money;
        this.fruits = new ArrayList();
    }
    void addFruit(String fruit) {           // �t���[�c��ǉ�����(wide interface)
        fruits.add(fruit);
    }
    List getFruits() {                    // �t���[�c�𓾂�(wide interface)
         return (List)fruits.clone();
    }
}
