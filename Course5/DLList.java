package Course5;

public class DLList {
    private class IntNode {
        public int item;
        public IntNode prev;
        public IntNode next;

        public IntNode(int i, IntNode p, IntNode n) {
            item = i;
            prev = p;
            next = n;
        }
    }

    private IntNode sentinel;
    private int size;

    public DLList(int x) {
        sentinel = new IntNode(0, null, null);
        sentinel.next = new IntNode(x, sentinel, sentinel);
        sentinel.prev = sentinel.next;
        size = 1;
    }
    
    public DLList() {
        sentinel = new IntNode(0, null, null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }

    public void addFirst(int x) {
        IntNode temp = sentinel.next;
        sentinel.next = new IntNode(x, sentinel, temp);
        temp.prev = sentinel.next;
        size++;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        IntNode newNode = new IntNode(x, sentinel.prev, sentinel);
        sentinel.prev.next = newNode;
        sentinel.prev = newNode;
        size++;
    }

    public int getLast() {
        return sentinel.prev.item;
    }
    
    public int size() {
        return size;
    }

    public void PrintAll() {
        IntNode temp = sentinel;
        int index = 0;
        while (temp.next != sentinel) {
            temp = temp.next;
            index++;
            System.out.println(index + ":" + temp.item);
        }
    }

    public static void main(String[] args) {
        DLList D = new DLList();
        D.addFirst(2);
        D.addFirst(3);
        D.addLast(5);
        D.addFirst(7);
        System.out.println("First：" + D.getFirst());
        System.out.println("Last：" + D.getLast());
        System.out.println("Size：" + D.size());
        D.PrintAll();
    }
}
