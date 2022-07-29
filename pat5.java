public class pat5 {
    public static void abc(int n){
        int i,j;
        int a=5;
        for(i=0;i<=a;i++){
            for(j=0;j<=i;j++){
                System.out.print((char)(n+j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int n=65;
        abc(n);
    }
}
