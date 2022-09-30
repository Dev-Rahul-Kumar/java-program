import java.util.*;

public class Test {
    public static void main(String args[]){

   
        Scanner sc= new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int rem = n%2;
        
        if (rem == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        sc.close();
    }    
    
}

