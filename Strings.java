import java.util.*;

public class Strings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter Your Name: ");

        // String name = sc.next(); // next() method is use to take only first character
        // of string.

        // String name = sc.nextLine(); // Here nextLine() is used to print all the
        // sentence.

        // Concatenation (Joining 2 strings) ---->

        /*
         * 
         * String name = "vinod";
         * String name2 = "Daniel";
         * String cont = "My name is " + name + " " + name2;
         * System.out.println(cont);
         * 
         */

        // Length of string:

        // System.out.println( "Length of concatenatio string is " + cont.length());

        // Accessing the character of a given string :---->
        /*
         * 
         * for (int i = 0; i < name.length() ; i++ ){
         * System.out.println(name.charAt(i)); // Here charAt is used to pick the each
         * character.
         * }
         * 
         */

        // compareTo conditions-->

        // 1 s1 s2 : +ve value
        // 2 s1 == s2 : 0
        // 3 s1 s2 : -ve value

        /*
         * 
         * String name = "rahul";
         * String name2 = "rahul2";
         * if (name.compareTo(name2) == 0) {
         * System.out.println("both are equal");
         * 
         * }else{
         * System.out.println("not equal");
         * }
         * 
         */

        // ParseInt Method -----> is used to convert string to integer.
        // syntex : int number = Integer.parseInt(str);

        // ToString Method : --->> is used to convert integer to string.
        // Syntex : String number = Integer.ToString(str);

        /* String Builder */

        // StringBuilder sb = new StringBuilder(" Hello");

        // String name = sb.append()
        // System.out.println(sb);

        // set character at index :--->>
        // sb.setCharAt(1, 'p');
        // System.out.println(sb);

        // Insert method is used to insert character at first( 0 index).
        // sb.insert(0, 'k');
        // System.out.println(sb);

        // Delete is used to delete string giving stsrt and end value to execute
        // sb.delete(0, 2);
        // System.out.println(sb);

        // Append is used to add something at the end of the string.
        // sb.append("s");
        // System.out.println(sb);

        /* Reverseing the string */

        // for(int i = 0; i< sb.length(); i-- ){
        // for(int j=0 ; j< sb.length(); j++){
        // System.out.print(sb.charAt(i));
        // }
        // System.out.println();
        // }

        /* Practice */

        // Q.1--->Take an array of Strings input from the user & find the cumulative (combined)length of all those strings.

       
        // int size = 3;
        // String[] arr = new String[size];
        // int count = 0;
        // // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < size; i++) {
        //     arr[i] = sc.nextLine();
        //     count = count + arr[i].length();
        // }
        // System.out.println(count);
        // System.out.println(arr[0]);


        // Q.2--> Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.

        /* 
        System.out.print("Enter your string: ");
        String name = sc.next();

        String result = "";

        for(int i=0; i< name.length(); i++){
            if(name.charAt(i) == 'e'){
                result = result + 'i';
            }else{
                result = result + name.charAt(i);
            }
        }
        System.out.println(result);
        */

        // @.3. Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.

       /*

        System.out.print("Enter an email id: ");
        String email = sc.nextLine();

        String username = "";

        for (int i=0; i<=email.length(); i++){
            if(email.charAt(i)== '@'){
                break;
            }else{
                username += email.charAt(i);

            }
        }
        System.out.println(username);

        */

        

        sc.close();
    }
}
