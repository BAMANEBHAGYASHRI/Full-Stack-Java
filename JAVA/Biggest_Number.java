import java.util.*;
class Biggest_Number{
public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	int a= sc.nextInt();
	int b =sc.nextInt();
	int c = sc.nextInt();

	int max = (a>b)?(a<b ? a:c):(b>c ? b:c);
	System.out.println(max);

}


}