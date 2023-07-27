

/* An SLList is a list of intergers, 
 * which hides the terrible truth of the nakedness within. */

public class SLList {

    public static class IntNode{
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n){
            item = i;
            next = n;
        }
    }
    
    private IntNode first;

    public SLList(int x){
        first = new IntNode(x, null);
    }

    /*Adds x to the front of the list. */
    public void addFirst(int x){
        first = new IntNode(x, first);
    }

     /*Return the first number of the list. */
    public int getFirst(){
        return first.item;
    }

    /*Adds an item to the end of the list.  */
    public int addLast(int x){
        IntNode p = first;
        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    private static int size(IntNode p){
        if (p.next == null){
            return 1;
        }
        return 1 + size(p.next);
    }
    
    public int size(){
        return size(first);
    }
    /* calculating the size of the list can be time-consuming;
     * you can maintain a special size variable that caches the size.
     */

    public static void main(String[] args){

        /*Creates a list of one integer, namely 10 
         * no longer necessary to specify a null.*/
        SLList L = new SLList(10);

        /* */
        SLList L = new SLList(15);
        L.addFirst(10);


        L.addFirst(10);
        L.addFirst(5);
        System.out.println(L.getFirst());
    }
}
