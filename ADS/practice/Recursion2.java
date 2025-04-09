//fibonacci series
//f1=0 , f2=1
//series: 0 1 1 2 3 5 8 13 21 34 55 89 144 233...
class Recursion2 {
	static int fibo(int n){
		if(n<=1){
			return n;
		}
		return fibo(n-1)+fibo(n-2);
		
	}
	public static void main(String...args){
		int num=10;
		for(int i=1; i<=num; i++){
		System.out.println(fibo(i));
	    }
	}
}