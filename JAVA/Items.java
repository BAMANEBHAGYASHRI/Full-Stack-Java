import java.util.*;
class Items{
	public static void main(String x[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Item Number");
	int num =sc.nextInt();
	System.out.println("Enter Item Name");
	String name = sc.next();
	System.out.println("Enter Item rate");
	double rate = sc.nextDouble();
	System.out.println("Enter Item quantity");
	double qty= sc.nextDouble();
	double price=rate*qty;
	double discount = 0;
	if(price>=1000 && price<2000){
		discount=0.10*price;
	}
	if(price>=2000 && price<3000){
		 discount=0.15*price;
	}
	if(price>=3000 && price<5000){
		 discount=0.20*price;
	}
	if(price>=5000){
		discount=0.25*price;
	}
	double netprice=price-discount;
	System.out.println(num);
	System.out.println(name);
	System.out.println(rate);
	System.out.println(qty);
	System.out.println(price);
	System.out.println(netprice);

	}
	

}