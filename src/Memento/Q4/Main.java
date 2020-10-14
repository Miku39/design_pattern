import game.Memento;
import game.Gamer;
import java.io.*;
import java.util.zip.*;

public class Main {
    public static final String SAVEFILENAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100); // 最初の所持金は100
        Memento memento = loadMemento(); // ファイルからロード

        if (memento != null) {
            gamer.restoreMemento(memento);
        } else {
            memento = gamer.createMemento();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("==== " + i); // 回数表示
            System.out.println("現状:" + gamer); // 現在の主人公の状態表示

            gamer.bet(); // ゲームを進める

            System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

            // Mementoの取り扱いの決定
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    （だいぶ増えたので、現在の状態を保存しておこう）");
                memento = gamer.createMemento();
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    （だいぶ減ったので、以前の状態に復帰しよう）");
                gamer.restoreMemento(memento);
            }

            // 時間待ち
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("");
        }
    }

    public static void saveMemento(Memento memento) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new DeflaterOutputStream(new FileOutputStream(SAVEFILENAME)));

            out.writeObject(memento);

            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new InflaterInputStream(new FileInputStream(SAVEFILENAME)));

            memento = (Memento) in.readObject();

            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return memento;
    }
}
