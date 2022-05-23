import java.util.Scanner;

public class Fibo {

    //Creating scanner object to take input from user
    Scanner sc = new Scanner(System.in);

    //Declaring instance/class variable
    int start , end;

    //Default Constructot
    Fibo(){
        start = 0;
        end = 0;
    }

    //Function to accept the value of start and end from user
    void read(){
        System.out.println("Enter start range : ");
        start = sc.nextInt();
        System.out.println("Enter ending range : ");
        end = sc.nextInt();
    }

    //Function that will return the nth fibonacci element
    int fibo(int n){
        //Base Case
        if(n==0 || n==1)
            return n;
        return fibo(n-1) + fibo(n-2);
    }

    //function to display the fibonacci series from start to end
    void display(){
        System.out.println("\nThe Fibonacci Series : ");
        for (int i = start; i <= end; i++) {
            System.out.print(fibo(i)+" , ");
        }

    }

    //Main Function
    public static void main(String[] args) {
        Fibo obj = new Fibo();
        obj.read();
        obj.display();
    }
}
