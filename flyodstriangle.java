public class flyodstriangle {
    public static void main(String[] args) {
        int n =5;
        int numbers=1;

        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(numbers+" ");
                numbers++;
            }
            System.out.println();
        }
    }
}
