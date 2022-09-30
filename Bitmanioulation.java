import java.util.*;

public class Bitmanioulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Get the 3rd bit (position = 2) of a number n.(n=0101)

        int n = 5;
        int pos = 3;
        int bit_mask = 1<<pos;
        

        // if((bit_mask & n) == 0){
        //     System.out.println("zero place");
        // }else{
        //     System.out.println("non Zero");
        // }

        int newnumber = bit_mask | n;
        System.out.println(newnumber);



        sc.close();
        
    }
}
