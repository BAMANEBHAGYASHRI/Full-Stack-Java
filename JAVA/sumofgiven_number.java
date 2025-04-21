import java.util.*;
class sumofgiven_number{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter numbers");
int digit , sum=0;
int num = sc.nextInt();
while(num>0){
	digit = num%10;
	sum +=digit;
	num = num /10;
	System.out.println("sum of given number is " + sum);

}
}
}