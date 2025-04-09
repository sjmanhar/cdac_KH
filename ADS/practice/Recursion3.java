//fibonacci series
//f1=0 , f2=1
//series: 0 1 1 2 3 5 8 13 21 34 55 89 144 233...
class Recursion3 {
	static int sum(int n){
		if(n>0){
			return n+sum(n-1);
		}
		return 0;
		
	}
	public static void main(String...args){
		int n=10;
		
		System.out.println(sum(n));
	    
	}
}