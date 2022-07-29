public class pat3 {
    public static void right_triangle(int n) {
        int i,j;
        for(i=1;i<=n;i++){
            System.out.print(" ");
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        } 
    }
    public static void main(String args[]) {
        int n=5;
        right_triangle(n);   
    }
}
