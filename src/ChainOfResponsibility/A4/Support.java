public abstract class Support {
    private String name;                    // ���̃g���u�������҂̖��O
    private Support next;                 // ���炢�񂵂̐�
    public Support(String name) {           // �g���u�������҂̐���
        this.name = name;
    }
    public Support setNext(Support next) {  // ���炢�񂵂̐��ݒ�
        this.next = next;
        return next;
    }
    public void support(Trouble trouble) {          // �����̃��\�b�h�Ԋ|��
        for (Support obj = this; true; obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                obj.fail(trouble);
                break;
            }
        }
    }
    public String toString() {              // ������\��
        return "[" + name + "]";
    }
    protected abstract boolean resolve(Trouble trouble); // �����p���\�b�h
    protected void done(Trouble trouble) {  // ����
        System.out.println(trouble + " is resolved by " + this + ".");
    }
    protected void fail(Trouble trouble) {  // ������
        System.out.println(trouble + " cannot be resolved.");
    }
}
