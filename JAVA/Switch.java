import java.util.*;
class Switch{
public static void main(String x[]){
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2=sc.nextInt();
System.out.println("1.Addition");
System.out.println("2.Substraction");
System.out.println("3.Multiplication");
System.out.println("4.division");
System.out.print("Enter your choice");
int res;
int ch = sc.nextInt();
switch(ch){
case 1:res=n1+n2;
break;
case 2:res=n1-n2;
break;
case 3:res=n1*n2;
break;
case 4:res=n1/n2;
break;
default:
	System.out.println("Invalid");

}
System.out.println(res);
}


} 