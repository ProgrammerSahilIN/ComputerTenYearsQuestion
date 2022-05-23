import java.util.*;

public class check{

    //Created Scanner object to take input from the user.
    static Scanner sc = new Scanner(System.in);

    //instance/class variables declared.
    static String wrd ;
    static int len ;

    //Default constructor to initialize instance/class variables.
    check(){
        wrd = "";
        len = 0 ;
    }

    //function to aceept the word as input from user.
    void acceptword(){
        System.out.println("Enter Any Word : ");
        wrd = sc.next();
        wrd.trim();
        len = wrd.length();
    }

    //function to check and return 'true' if the word given is pallindrome else it will return 'false'
    boolean palindrome(){
        String chkwrd = wrd , revwrd = "";
        char c;
        for (int i = 0; i < len; i++) {
            c = chkwrd.charAt(i);
            revwrd = c + revwrd;

        }

        if(revwrd.equals(chkwrd))
        return true;
        return false;
    }

    //function to display the word along with the message whether it is palindrome or not.
    void display(){
        System.out.println("The input word = "+wrd);
        if(palindrome())
        System.out.println("The Word is a palindrome word.");
        else
        System.out.println("The Word is not a plaindrome word.");
    }

    //main funtion
    public static void main(String[] args) {
        check obj = new check();
        obj.acceptword();
        obj.display();
    }

}