import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your value");
        int num =sc.nextInt();
       
        if(num % 2==0){
            System.out.println("Even number"+num);
        }
        else{
            System.out.println("Odd number"+num);
        }
    }
}
