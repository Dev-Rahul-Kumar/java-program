import java.util.*;

public class Array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Method--1 for array creating:

        /*
         * int[] marks = new int[3];
         * 
         * marks[0] = 97;
         * marks[1] = 86;
         * marks[2] = 56;
         * 
         * for (int i = 0; i < marks.length; i++) {
         * System.out.println(marks[i]);
         * }
         */

        // method- 2 for declareing array:

        /*
         * int marks[] = {97,86,56};
         * 
         * 
         * 
         * for(int i = 0 ; i< marks.length; i++ ){
         * System.out.println(marks[i]);
         * }
         */

        // System.out.print("Enter the size of array: ");
        // int size = sc.nextInt();

        // int[] arr = new int[size];

        // System.out.println(arr[0]);

        // Finding x number from an array:

        // System.out.print("Enter size of array");
        // int size = sc.nextInt();

        // int [] arr = new int[size];

        // for (int i=0; i<arr.length; i++){
        // System.out.print(" Enter your array value: ");
        // arr[i] = sc.nextInt();
        // }

        // System.out.print(" Enter the number you have to search: ");
        // int search = sc.nextInt();

        // for (int i=0; i<arr.length; i++){
        // if (arr[i]== search){
        // System.out.println(" Your search value found at "+ i + " index in arr
        // array");
        // }else {
        // System.out.println("Search value is not Exist ");
        // }

        // }

        /* 

        System.out.print("Enter thw array size: ");

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];
        
        // Input part:-->
        
        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the array element: ");
                arr[i][j] = sc.nextInt();

            }
        }

        // Output part--->

        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                
            }
            System.out.println();2
        }*/


        // Take an array of numbers as input and check if it is an array sorted in ascending order.
            // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
            //      {3, 4, 6, 2} is not sorted in ascending order.

            /* 
            System.out.println("Checking sorted array or not:--->");
            System.out.println();
            System.out.print("Enter the size of Array: ");
            int size = sc.nextInt();
            System.out.print("Enter your array: ");

            int[] arr = new int[size];

            for(int i=0; i<size; i++){
                arr[i]= sc.nextInt();
            }

            boolean hey = true;

            for(int i=0; i<size; i++){
                if(arr[i] > arr[i+1]){
                    hey = false;
                }else{
                    hey = true;
                }
            }

            if(hey){
                System.out.println("it is a sorted array");
            }else{
                System.out.println(" is a not sorted array");
            }

            */




        // Finding a number:----->

        /* 
        System.out.println();

        System.out.print("Enter the search value: ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==x){
                    System.out.print(" value find");
                }else{
                    System.out.println("not found");
                }
                
            }
            System.out.println();
        }
        */



        sc.close();
    }
}
