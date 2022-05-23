import java.util.Scanner;

public class Toggle {

    //Creating scanner object to take input
    Scanner sc = new Scanner(System.in);

    //Declaring instance/class Variables
    String str , newstr ;
    int len ;

    //Default Constructor
    Toggle(){
        str = "";
        newstr = "";
        len = 0;
    }

    //function to accpet word as a input from user
    void readword(){
        System.out.println("Enter Any Word : ");
        str = sc.next().trim();
        len = str.length();
    }

    //function to convert uppercase character to lowercase and Vice-Versa
    void toggle(){
         char c;
        for (int i = 0; i < len; i++) {
            c = str.charAt(i);
            if(Character.isUpperCase(c))
                newstr = newstr + Character.toLowerCase(c);
            else if(Character.isLowerCase(c))
                newstr = newstr + Character.toUpperCase(c);

        }
    }

    //function to display the string as well as toggled string
    void display(){
        System.out.println("The Original Word : "+str);
        System.out.println("The Toggled Word : "+newstr);
    }

    //Main function
    public static void main(String[] args) {
        Toggle obj = new Toggle();
        obj.readword();
        obj.toggle();
        obj.display();
    }
}
