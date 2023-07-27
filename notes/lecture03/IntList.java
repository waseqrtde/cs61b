public class IntList{

    public int first;
    public IntList rest;

    public IntList(int f, IntList r ){
        first = f;
        rest = r;
    }

    /** Return the size of the list using recursion */
    public int Size(){
        if (rest == null){
            return 1;
        }else{
            return 1 + this.rest.Size();
        }
    }

    /** Return the size of the list using iteration */
    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while (p != null){
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }
    
    /*Return the ith item in the list */
    public int get(int i){
        if(i == 0){
            return first;
        }else{
            return this.rest.get(i-1);
        }

    }

    /* Return an IntList identical to L, but with all values incremented by x;
     * Values in L cannot change!
     */
    public static IntList incrList(IntList L, int x){

    }


    /* Return an IntList identical to L, but with all values incremented by x;
     * NOt allowed to use 'new' to save memory.
     */
    public static IntList dincrList(IntList L, int x){
        ß
    }




    public static void main(String[] args){
        /*define a list [5,[10,[15]]] */
        IntList L = new IntList(15, null);
        L = new IntList(10, L);
        L = new IntList(5, L); 

        System.out.println(L.size);
    }
}