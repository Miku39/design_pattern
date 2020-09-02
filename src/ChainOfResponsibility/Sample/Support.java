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
    public void support(Trouble trouble) {  // �g���u�������̎菇
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
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
