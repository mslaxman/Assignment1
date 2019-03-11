import java.util.*;
class Q4{
	public static double avg(double[] a){
		double n=a.length;
		double sum=0;
		double avg=0.0;
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		avg=sum/n;
		return avg;
	}
	public static void main(String... as){
		Scanner s=new Scanner(System.in);
		int n;
		
		System.out.println("Count of numbers: ");
		n=s.nextInt();
		double[] a=new double[n];
		System.out.println("Enter numbers: ");
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println(avg(a));
		
	}
}