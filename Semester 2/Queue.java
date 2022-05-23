import java.util.Scanner;

public class Queue {

    //Declaring instance variables
    int dat[];
    int cap , front , rear ;

    //Parametrized constructor to initialize instance variables
    Queue(int max){
        cap = max;
        front = 0;
        rear = 0;
        dat = new int[cap];
    }

    //function to add integers from the rear index to the queue
    void add_dat(int v){
        if(rear == cap)
            System.out.println("Queue full ");
        else
            dat[rear++] = v;
    }

    //funtion to pop element from queue from front
    int pop_dat(){
        if(front == rear)
            return -999;
        else{
            rear--;
        return dat[front++];
        }
    }

    //function to display the elements of queue
    void display(){
        System.out.println(" The Queue Elements are : ");
        for (int i = front; i < rear; i++) {
            System.out.print(dat[i]+" , ");
        }
    }

}
