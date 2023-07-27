public class exercise03 {
    /** Returns the maximum value from m. */
    public static int max( int[] m ) {
        int res = m[0];
        for ( int i = 0, j = m.length; i < j; i += 1 ){
            if (res < m[i]){
                res = m[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.println(exercise02.max(numbers));     
    }
}