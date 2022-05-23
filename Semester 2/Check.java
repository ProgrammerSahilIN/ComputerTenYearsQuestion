import java.util.Scanner;

public class Check {

    //Declaring instance/class variables
    String wrd ;
    int len;

    //creating scanner object for taking inputs
    Scanner sc = new Scanner(System.in);

    //Default conctructor
    Check(){
        wrd = "";
        len = 0;
    }

    //function to accept word as a input from user
    void acceptword(){
        System.out.println("Enter Any Word : ");
        wrd = sc.next().trim().toUpperCase();
        len = wrd.length();
    }

    //function to check whether the word is a palindrome or not if the word is palindrome the function will return true else false
    boolean palindrome(){
        char c;
        String s = "";

        for (int i = 0; i < wrd.length(); i++) {
            c = wrd.charAt(i);
            s = c + s;
        }
        if(s.equals(wrd))
            return true;
        return false;
    }

    //function to display the word along with message that whether  it is palindrome or not
    void display(){
        if(palindrome())
            System.out.println("The Word {"+wrd+ "} is a Palindrome word");
        else
            System.out.println("The Word {" +wrd+ "} is not a Palindrome word");
    }

    //Main function
    public static void main(String[] args) {
        Check obj = new Check();
        obj.acceptword();
        obj.display();

    }

}
