import java.util.*;





public class Function_practice {

    // private static int multipication(int a, int b){
    //     int mul = a*b;
    
    //     return mul;
    // }

    // public static void primeNumber (int n){
        
    //     int prime = n % 2 ; 

    //     if (prime == 0){
    //         System.out.println(n + " a Prime Number");
    //     }else{
    //         System.out.println(n + " not a prime number");
    //     }

        
        
    // }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for checking: ");
        // int n = sc.nextInt();

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // double product =  multipication(a,b);

        // System.out.println("Product of two numbr: " + product);


        // primeNumber(n);




        // Fibonacci numbers :

        int n = sc.nextInt();
        int n1= 0;
        int n2 = 1;
        System.out.print(n1 +" "+ n2);
        // System.out.print(n2);

        for (int i=2;i<=n;i++){

            int n3 = n1+n2;
           
            System.out.print(" "+ n3);

            n1=n2;
            n2 = n3;

            
        }
        


        

        sc.close();
    }
    
}
