public class pat6 {
    public static void main(String[] args){
        int n=65;
        int i,j;
        for(i=0;i<=5;i++){
            for(j=0;j<=i;j++){
                System.out.print((char)(n+j)+" ");
            }
            System.out.println();
        }
    }
}
