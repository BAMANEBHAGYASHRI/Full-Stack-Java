import java.util.*;
class Age{
public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int age= sc.nextInt();
	if(age>=18){
		System.out.println("Aplicable for vote");
	}
	else{
		if(age<0){
			System.out.println("Invalid age");
		}
		else{
			System.out.println("Not Aplicable");
		}
	}




}
}