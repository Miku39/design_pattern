public abstract class Entry {
    public abstract String getName();                               // ���O�𓾂�
    public abstract int getSize();                                  // �T�C�Y�𓾂�
    public Entry add(Entry entry) throws FileTreatmentException {   // �G���g����ǉ�����
        throw new FileTreatmentException();
    }
    public void printList() {                                       // �ꗗ��\������
        printList("");
    }
    protected abstract void printList(String prefix);               // prefix��O�ɂ��Ĉꗗ��\������
    public String toString() {                                      // ������\��
        return getName() + " (" + getSize() + ")";
    }
}
