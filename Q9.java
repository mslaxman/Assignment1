class Q9{
	/*static int a=10;
	public int even(int a){
		
		if(a%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		return 1;
	}
	*/
	/*
	public static void main(String... as){
		final int a=10;
		int b=25;
		a=22;
		
		Q9 x=new Q9();
		System.out.println(x.even());
		
	}
	*/
	public Q9(int a){
		System.out.println("Constructor");
	}
	
}
class X{
	//Q9 s=new Q9();//constructor cannot be applied
	
	public static void main(String... a){
		Q9 s=new Q9(5);
	}
}