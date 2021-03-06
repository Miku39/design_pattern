public class IncreaseDisplay extends CountDisplay {
    public IncreaseDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count++;
        }
    }
}
