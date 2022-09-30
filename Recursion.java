import java.util.Scanner;

public class Recursion {

    public static void printNumber(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        // System.out.println(n);
        sum = sum+n;
        
        printNumber(n-1,sum);
        // System.out.println();
    }

    public static void main(String[] args) {
        // // for (int i=5; i>0;i--){
        // // System.out.print(i +" ");
        // // }

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println();

        printNumber(n, 0);

        sc.close();
    }

}
