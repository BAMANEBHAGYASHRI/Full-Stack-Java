import java.util.*;
public class BiggestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 values-");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 =sc.nextInt();

        if(n1>n2 && n1>n3){
        System.out.println(n1+" is big number");
        }
        else{
            if(n2>n1 && n2>n3){
                System.out.println(n2+"is big number");
            }
            else{
                System.out.println(n3+"is big number");
            }
        }
    }
}
