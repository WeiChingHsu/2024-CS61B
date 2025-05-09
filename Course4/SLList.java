package Course4;

/* This data structure is easier for programmers to use than IntList*/
/* SLList like a middleman. */
public class SLList {
    
    private IntNode first;

    /* Creates a new SLList with ont item, namely x. */
    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /* Adds item x to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /* Gets the first item in the list.  */
    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(5);
        L.addFirst(10);
        System.out.println(L.getFirst());
    }
}
