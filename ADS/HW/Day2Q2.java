class Day2Q1{
	static void table(int n , int i){
		if(i>10){
			return;
		}
		System.out.println(n + "*" + i +"=" + ( n * i ));
		table(n, i+1);
	}
	public static void main(String[] args) {
		int n = 5; 
        table(n, 1);
	}
}