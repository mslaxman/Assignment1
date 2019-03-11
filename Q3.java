import java.util.*;
class Q3{
	public static void main(String... a){
		int num,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number: ");
		num=s.nextInt();
		if(num==0||num==1){
			System.out.println("Not a prime number");
		}
		else{
			for(int i=2;i<=num/2;i++){
				if(num%i==0){
					System.out.println("Not a Prime Number");
					count++;
					break;
				}
			}
			if(count==0){
				System.out.println("Prime number");
			}
		}
		
	}
	
}