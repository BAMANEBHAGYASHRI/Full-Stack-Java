public class even_odd_while {
    public static void main(String args[]){
        int sumeven=0; 
        int sumodd=0;
        int i=1;
        for(i=1; i<=100; i++){
	if(i%2==0){
		sumeven+=i;
	}
	else{
		sumodd+=i;
	}
	System.out.println("even" + i);
	System.out.println("odd" + i);
       }
    }
}
