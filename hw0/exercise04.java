public class exercise04 {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */ 
        for (int i = 0, j = a.length; i < j; i += 1){
            if (a[i] > 0){
                for (int m = 1; m <= n; m += 1){
                    if (i + m > a.length - 1){
                        break;
                    }
                    else {
                        a[i] = a[i] + a[i + m];
                }
            }
        }
        System.out.println(a[i]);
      }
    }

      public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
      }
}
