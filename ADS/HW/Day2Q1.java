class Day2Q1{
	static double series(double n ){
		if(n==1){
			return 1;
		}
		return series(n-1) + (n% 2 ==0 ? -1/ n : 1/n);
	}
	public static void main(String...args){
		//double n =3; //0.8333333333333333
		double n =4; //0.5833333333333333
		System.out.println(series(n));
	}
}