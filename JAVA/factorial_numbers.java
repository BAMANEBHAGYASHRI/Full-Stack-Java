import java.util.*;
class factorial_numbers{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Values");
int n = sc.nextInt();
int fact=0;
for(int i =n ; i>=1; i--){
	fact  = fact*n;

}

System.out.println(fact);

}


}