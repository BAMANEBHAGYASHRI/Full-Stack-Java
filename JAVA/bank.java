import java.util.*;
class bank{
public static void main(String x[]){
Scanner sc =new Scanner(System.in);
int amt, ch;
System.out.println("Enter current balance");
int bal =sc.nextInt();
do{
System.out.println("1.Deposite");
System.out.println("2.Withdraw");
System.out.println("3.Display Balance");
System.out.println("4.Exit");
System.out.println("Enter your choice");
ch = sc.nextInt();
switch(ch){
case 1:
	System.out.println("enter your amount to deposite");
	amt = sc.nextInt();
	bal+=amt;
	System.out.println("Balance is - " + bal);	
	break;

case 2:
	System.out.println("enter your amount for withdraw");
	amt = sc.nextInt();
	if(amt>bal){
		System.out.println("Insuffient balance");	
	}
	else{
	bal=bal-amt;
	System.out.println("Balance is - " + bal);	
	}	
	break;

case 3:
	System.out.println("current balance" + bal);	
	break;

case 4:
	System.out.println("Thank you for banking");	
	break;

default:
	System.out.println("Invalid Choice");

}

}
while(ch !=4);
}


}