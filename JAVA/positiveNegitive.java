import java.util.*;
public class positiveNegitive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ur value");
        int a = sc.nextInt();
        if(a>0){
            System.out.println(a+ "Positive number");
        }
        else{
            if(a<0){
                System.out.println(a+"negitive number");
            }
            else{
                System.out.println("Zero");
            }
        }
    }
}
