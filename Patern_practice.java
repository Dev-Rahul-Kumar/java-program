import java.util.*;




public class Patern_practice {
    public static void main( String args[]){

        Scanner sc = new Scanner(System.in);



        // pattern:  

        /*
         
            * * * *
            * * * * 
            * * * *
            * * * *

         */  // Solution:----->
        // for (int i=1;i<=4;i++){
            
        //     for(int j=1;j<=5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        /*
            * * * *
            *     *
            *     *
            * * * *
        
        */ 
        // System.out.println("Enter number of pattern: ");

        // int n= sc.nextInt();
        // int m= sc.nextInt();

        // for (int i=1;i<=n;i++){
        //     for(int j=1; j<=m; j++){
        //         if(i==1 || j==1 || i==n || j==m){
        //             System.out.print(" * ");
        //         }else{
        //             System.out.print("   ");
        //         }
            
        //     }
        //     System.out.println();

        // }


        /*
            *
            * *
            * * *
            * * * *
            * * * * *
         
         */

        //  for(int i=1; i<=5; i++){
        //     for(int j=1;  j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        //  }


        // question-4:--->
        // int n=5;

        // for(int i=n; i>=0; i--){
        //     for(int j=0; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        //Question number: 5 ----->

        /* 
                  *
                 **
                ***
               ****
              *****
             ******
            
         
        */

        // int n=5;

        // for(int i=n; i>=0; i--){
        //     for(int j=0; j<=i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0;j<=n-i; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }


        // Question no- 6 ---->

        /* 
            1
            12
            123
            1234
            12345
          
        */


        // int n=5;

        // for(int i=1;i<=n; i++){
        //     for (int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }



        // Question no: 7 ---->

        /*
            

         */


         int n=5;
         for (int i=n; i>=1; i--){
            for(int j= 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
         }



        sc.close();

    }
}
