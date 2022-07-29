public class pat4 {
    public static void right_triangle(int n){
        int i,j;
        for(i=0;i<n;i++){
            System.out.print(" ");
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        right_triangle(n);
    }
}
