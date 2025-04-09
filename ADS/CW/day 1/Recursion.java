class Recursion{
	static void show(){
		System.out.println("hello");
		show();
	}
	public static void main(String...args){
		show();
	}
}//infinite loop: stackoverflow
//should not happen>> termination needed (base condition)