import java.util.*;
class sum_numbers{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
int i=1, n,sum=0;
while(i<=10){
System.out.println("Enter your number");
n=sc.nextInt();
sum=sum+n;
}

System.out.println(sum);
}

}