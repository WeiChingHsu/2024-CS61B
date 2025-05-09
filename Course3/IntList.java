package Course3;

public class IntList {
    public int first;
    public IntList rest;

    public IntList(int f, IntList r)  {
        first = f;
        rest = r;
    }
    
    public int size(){  
        if  (rest == null ) {
            return 1;
        }
        return rest.size() + 1;
    }
    
    public int iterativeSize() {
        int totalSize = 0;
        IntList p = this;
        while (p != null) {
            totalSize++;
            p = p.rest;
        }
        return totalSize;
    }
    // Return the i'th item in the list.
    public int get(int i) {
        if (i == 0) {
            return first;
        }
       return rest.get(i - 1);
    }

    public static void main(String[] args){
        IntList L = new IntList(15, null);
        L = new IntList(30, L);
        System.out.println(L.size());
        System.out.println(L.iterativeSize());
        System.out.println(L.get(1));
    }
}
