public class exercise02 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int count = 0;
        int res = m[count];
        while (count <= m.length - 2){
            count = count + 1;
            if (res < m[count]){
                res = m[count];
            }
        }
        return res;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6}; 
       System.out.println(exercise02.max(numbers));     
    }
}
