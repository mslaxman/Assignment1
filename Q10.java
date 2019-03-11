import java.util.*;
class Q10{
	public static void main(String... a){
		Scanner s=new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year=s.nextInt();
		int month;
		System.out.println("Enter Month");
		month=s.nextInt();
		if(month<1||month>12){
			System.out.println("Enter valid month");
			return;
		}
		else{
			switch(month){
				case 1:
					System.out.println("January has 31 days");
					break;
				case 2:
					if((year%4==0)||(year%400==0)){
						System.out.println("February has 29 days");
						break;
					}
					else{
						System.out.println("February has 28 days");
						break;
					}
				case 3:
					System.out.println("March has 31 days");
					break;
				case 4:
					System.out.println("April has 30 days");
					break;
				case 5:
					System.out.println("May has 31 days");
					break;
				case 6:
					System.out.println("June has 30 days");
					break;
				case 7:
					System.out.println("July has 31 days");
					break;
				case 8:
					System.out.println("August has 31 days");
					break;
				case 9:
					System.out.println("September has 30 days");
					break;
				case 10:
					System.out.println("October has 31 days");
					break;
				case 11:
					System.out.println("November has 30 days");
					break;
				case 12:
					System.out.println("December has 31 days");
					break;
			}
		}
	}
}