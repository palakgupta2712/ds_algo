import java.util.Scanner;
class series{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int i = 0;
        for(i = 0; i<t; i++){
            int a = s.nextInt();
            int b = s.nextInt();
            int n = s.nextInt();
            int c = a;
            for(int j = 0; j<n ; j++){
                c += Math.pow(2, j) * b;
                System.out.printf("%s ",c);
                
            }
        System.out.println();
        }
        s.close();
    }
}