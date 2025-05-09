package Course4;

/* This data structure is easier for programmers to use than IntList*/
/* SLList like a middleman. */
public class SLList {
    
    /* Nested Classees */
    private class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    /* Variables */
    /* The first item, if it exists, is at sentinal.next */
    /* 用哨兵來避免創建一個空的SLList時，在addLast會遇到的bug*/
    /* Bug：指向null.next*/
    /* 而不是在addLast中加入判斷是使否為空節點的條件，使得程式碼更簡潔 */
    /* 太聰明了 */
    private IntNode sentinel;
    private int size;

    /* Creates a new SLList with ont item, namely x. */
    public SLList(int x) {
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* Creates an empty SLList.  */
    public SLList() {
        sentinel = new IntNode(0, null);;
        size = 0;
    }

    /* Adds item x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    /* Gets the first item in the list.  */
    public int getFirst() {
        return sentinel.next.item;
    }

    /* Add x to the end of the list. */
    public void addLast(int x) {
        size++;
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);

    }

    public int getLast() {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    /* Returns the size of the list. */
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addFirst(10);
        System.out.println(L.getFirst());
        L.addLast(2);
        System.out.println(L.size());
        System.out.println(L.getLast());
        L.addLast(1);
        System.out.println(L.size());
        System.out.println(L.getLast());
    }
}
