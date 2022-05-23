import java.util.Scanner;

public class Gcd {

    //creating scanner object for taking input from user
    Scanner sc = new Scanner(System.in);

    //Declaring instance variables
    int num1 , num2;

    //Default contructor to initialize instance variables
    Gcd(){
        num1 = 0;
        num2 = 0;
    }

    //function to accept number form user
    void accept(){
        System.out.println("Enter 1st Number : ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        num2 = sc.nextInt();
    }

    //function to find gcd of given input numbers using recursion
    int gcd(int x , int y){
        if(x%y == 0)
            return y;
        return gcd(y , x%y);
    }

    //function to display the gcd of the given numbers
    void display(){
        System.out.println("The G.C.D. of "+num1+" and "+num2+" is : "+gcd(num1 , num2));
    }

    //Main Function
    public static void main(String[] args) {
        Gcd obj = new Gcd();
        obj.accept();
        obj.display();
    }
}
