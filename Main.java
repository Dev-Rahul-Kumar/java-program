import java.util.*;
public class Main {
    public static void printMyName(String name){
        System.out.println(name);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // TEST CASE --> 1

        // System.out.print("Enter Your Age: ");
        // int age = sc.nextInt();

        // if(age>18){
        //     System.out.print("Your are adult");
        // }
        // else{
        //     System.out.println("your are child");
        // }



        // TEST CASE ----> 2

        // System.out.print("Enter the number: ");
        // int x = sc.nextInt();

        // int value = x%2;

        // if(value == 0){
        //     System.out.println(x + "is a even number");
        // }
        // else{
        //     System.out.println(x + " is a odd number");
        // }
        

        // TEST CASE 3

        // System.out.print("Enter the 1st number: ");
        // int a =sc.nextInt();

        // System.out.print("Enter the 2st number: ");
        // int b =sc.nextInt();

        // if(a==b){
        //     System.out.println(a + "and" + b + " is equal");
        // }else{
        //     if(a>b){
        //         System.out.println(a + " is greater than "+b);
        //     }else{
        //         System.out.println(b +" is greater than "+a);
        //     }
        // }


        // TEST CASE SWITCH() ---->


        // System.out.print("Press button from 1-3 : ");
        // int button =sc.nextInt();

        // switch(button){
        //     case 1: System.out.println("you are great"); break;
        //     case 2: System.out.println("You are awsome");break ;
        //     case 3: System.out.println("You are Good"); break ;
        //     default: System.out.println("Fuck Up");
        // }




        // Loop Methods---------->

        //  for Loops---->
       

        // for(int count=0; count<10; count=count+1){  // we can initialise variable inline

        //     System.out.println("Hello world");
        //     System.out.println(count);
        // }


        // While Loops--->>


        // int i=0;   // In while loops we initialize varible outside of loops.
        // while (i<10){
        //     System.out.println("You are my hero");
        //     i++;
        // }


        // Practice--->


        // Finding sum of n number:

        // System.out.print("Enter the number: ");
        // byte value = sc.nextByte();

        // int sum= 0;

        // for(int i=0; i<=value; i++){
        //     sum= sum+i;
            
        // }
        // System.out.println("Your sum is : "+ sum);



        // Printing table for a given number:--->


        // System.out.print("Enter table number: ");
        // int table= sc.nextByte();
        
        // for(int i=1; i<=10;i++){
            
        //     System.out.println(table + "*" + i + "=" + table*i );
        // }




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




        // Function and Methods:------->

            

           //printMyName( "Rahul kumar"); // Calling printMyName fuction that was mention above this function.
        
        

       
        sc.close();
    }
}