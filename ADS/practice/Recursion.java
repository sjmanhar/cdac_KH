class Recursion {
	public static int findSum(int n){
		
		if (n == 0 ){
		return 0;}
		else{
		
		return n + findSum(n-1);}
	}
	public static void main(String...args){
		int n=10;
		System.out.println(findSum(n));
	}
}