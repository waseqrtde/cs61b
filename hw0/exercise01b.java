public class exercise01b {
    public static void drawTriangle(int N){
        int count = 1;
        String a = "*";
        while (count <= N){
            System.out.println(a);
            count = count + 1;
            a = a + "*";
        }
    }
    public static void main(String[] args){
        exercise01b.drawTriangle(10);
    }
    
}
