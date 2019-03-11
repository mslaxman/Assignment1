class Q5{
	public static void main(String... as){
		int x=1;
		int[][] a={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
/*
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(x+"\t");
				x++;
			}
			System.out.println("\n");
		}
		*/
	}
}