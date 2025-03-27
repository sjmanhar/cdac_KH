class A{
	
}
class B extends A{
	
}

class InstanceOperator{
	public static void main(String...args){
		InstanceOperator opt = new InstanceOperator();
		A a1 =new A();
		B b1 =new B();

		
		System.out.println(opt instanceof InstanceOperator);
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
	    System.out.println(b1 instanceof A);
		System.out.println(b1 instanceof B);
		//System.out.println(b1 instanceof InstanceOperator); //error: incompatible types: B cannot be converted to InstanceOperator



	}
}