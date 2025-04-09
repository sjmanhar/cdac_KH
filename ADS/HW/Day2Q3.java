class Day2Q3{
	static String gcd(int n ){
		if(n== 2){
			return "gcd(int, int)";
		}
		return "gcd(int, " + gcd(n - 1) + ")";
	}
	 public static void main(String[] args) {
		//int n = 3; //gcd(int, gcd(int, int))
        int n = 5; //gcd(int, gcd(int, int))
        System.out.println(gcd(n));
    }
}