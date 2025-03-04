import java.util.*;
class Student{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Roll No");
	int Rollno = sc.nextInt();
	System.out.println("Enter Your Name");
	String name = sc.next();
	System.out.println("Enter Your 3 Subject Marks");
	Double m1 = sc.nextDouble();
	Double m2 = sc.nextDouble();
	Double m3 = sc.nextDouble();
	Double Total = m1+m2+m3;
	Double Avrage=Total/3;

	System.out.println(Rollno);
	System.out.println(name);
	System.out.println(Total);
	System.out.println(Avrage);
	

}



}