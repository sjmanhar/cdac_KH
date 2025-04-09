class Recursion2{
	static int show(int n){
		if(n==4){
			return n;
		}else{
			return 2*show(n+1);
		}
	}
	public static void main(String[] args) {
		
       System.out.println(show(2));
	}
}
/*
            show(2)=       16!!!
2*show(2+1)-->2*show(3)= 6
                 2*show(4)=8
                            4

*/